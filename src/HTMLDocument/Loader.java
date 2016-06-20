package HTMLDocument;

import java.io.*;
import javax.net.ssl.HttpsURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Calendar;
import java.util.Map;
import java.util.logging.Logger;
import HTMLDocument.Websites.Website;
import accounts.User;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Evaluator;

import javax.jws.soap.SOAPBinding;
import javax.net.ssl.HttpsURLConnection;

import accounts.User.Update;

/**
 * Created by Wisdom on 13/06/2016.
 */
public class Loader<T> {

    User user;
    String  HTMLDocument;

    public Loader(User user){
        this.user =  user;
    }


    public Document load(Update update){

        switch (this.user.getWebsite()){

            case BitcoinTalk:
                try{
                    HttpsURLConnection bitcoinTalk = (HttpsURLConnection) new URL("https://bitcointalk.org/index.php?action=profile2").openConnection();
                    String cookie = this.user.getUserCookie() + " expires=2147483647; path=/;";
                    bitcoinTalk.setRequestProperty("Cookie", cookie);


                    if(update == Update.updateUserInfo) {
                        String urlParameters  = new String(("signature="+user.getSignature()+"&personalText="+user.getPersonalText()+"&userID="+user.getUserId()+"&sa=forumProfile"+"&sc="+user.getUserSC()).getBytes("utf-8"),"utf-8");

                        bitcoinTalk.setRequestMethod("POST");
                        bitcoinTalk.setRequestProperty( "Content-Type", "application/x-www-form-urlencoded");
                        bitcoinTalk.setRequestProperty( "charset", "utf-8");//ISO-8859-1
                        bitcoinTalk.setRequestProperty( "User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.84 Safari/537.36");


                        bitcoinTalk.setRequestProperty( "Content-Length", String.valueOf(urlParameters.length()));
                        bitcoinTalk.setUseCaches( false );
                        bitcoinTalk.setDoOutput( true );
                        bitcoinTalk.connect();

                        BufferedOutputStream os = new BufferedOutputStream(new DataOutputStream(bitcoinTalk.getOutputStream()));


                        os.write(urlParameters.getBytes());
                        os.flush();
                        os.close();
                        urlParameters = null;
                    }



                    BufferedReader reader = new BufferedReader(new InputStreamReader(bitcoinTalk.getInputStream()));

                    String line, content = "";
                    while((line = reader.readLine()) != null){
                        content += line;
                    }
                    reader.close();
                    HTMLDocument = content;

                    bitcoinTalk = null;
                    content = null;
                    cookie = null;
                    line = null;


                } catch(Exception Ex){}
               break;


            case bitcoinforum:
                try{



                } catch(Exception Ex){}
                break;
        }

        try{











        }catch (Exception ex){
            new  Throwable(ex);
        }
        this.user = null;
        return Jsoup.parse(HTMLDocument);
    }
}
