package HTTPhandle;

import HTMLDocument.ExtractToUser;
import HTMLDocument.Loader;
import HTMLDocument.Websites.Website;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.*;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;



import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;


import accounts.*;
import org.jsoup.nodes.Document;


/**
 * Created by Wisdom on 14/06/2016.
 */

 /*
    *Updates a user account which exists on the server.
    *If no user account exists, it inserts a new record into the database.
    *This method is for the HTTP Webserver
    *@param cookie Value of the user account's cookie to be scraped
    *@return boolean Whether this function succeeded or failed
    **/
// cookie = "SMFCookie129=a%3A4%3A%7Bi3A0%3B%7D; PHPSESSID=jnpll0qr56ug4782j3f1bbqb31;";
//  String  HTMLDoc = new Loader(url, cookie).load();

//  Document doc = new ConvertSMFToDocument(HTMLDoc).toDocument();

class Request extends User implements HttpHandler, Information {

    public Advert  advert;
    public Document profileInfo;





    List<NameValuePair> queries;
    @Override
    public void handle(HttpExchange t) throws IOException {

        setUserId("454718");
        setUserCookie("PHPSESSID=1alp0qdfcoad4g5; SMFCookie129=a%A1655387177%3Bi%3A3%3Bi%3A0%3B%7D;");
        setWebsite(Website.BitcoinTalk);
        setSignature(("[url=https://google.come/][font=Arial][size=10pt][color=#1C5A77]  %E2%9C%94 Signature DETECT TEST     ✔ TEST [b]TEST TEST[/b]       ✔ TEST [b]TEST[/b]      ✔ [color=#53a800]SIMPLE TEST[/color]      [/color][/size][/font][/url] [url=https://google.com][font=Arial][size=24pt][color=#1C5A77][size=10pt]   [/size][size=20pt][b]Ny[color=#00A9D2]eFe[/color][color=#8DACBD].com[/color][/b][/size][size=10pt]   [color=#ff0000]▮[/color][/size][size=14pt][color=#25b02b]▮[/color][/size][size=10pt][color=#ff0000]▮[/color][/size][size=14pt][color=#25b02b]▮[/color][/size][size=14pt][color=#25b02b]▮[/color][/size][size=10pt]   [/size][size=16pt][b]Play TEST DEMO this is only here testing      [/b][/size][size=10pt][/size][size=10pt][/size][/color][/size][/font][/url]"));
        setPersonalText("Changed by SigBuddy Server. ");
        setUserSC("ea36b0470eb1b4c8ef");


        BufferedReader response = new BufferedReader(new InputStreamReader(t.getRequestBody()));
        String line, content = "";
        while ((line = response.readLine()) != null) {
            content += line;
        }


        String userId, cookie;
try {
     queries = URLEncodedUtils.parse(t.getRequestURI(), "UTF-8");

}catch (Exception e){}

       for(NameValuePair query : queries){

          if(query.getValue().toLowerCase() == "profile");
              profileInfo = new Loader((User)Request.this).load(Update.updateUserInfo);
              new ExtractToUser(profileInfo).Extract();
       }

        t.sendResponseHeaders(200, "<h1>TEST NETWORK</h1>".length());
        BufferedOutputStream os = new BufferedOutputStream(t.getResponseBody());
        os.write("<h1>TEST NETWORK</h1>".getBytes());
        os.flush();
        os.close();
    }


    @Override
    public boolean updateUser(String cookie) {
        return false;
    }

    @Override
    public boolean signatureUpdateUser() {
        return false;
    }

    @Override
    public boolean avatarUpdateUser() {
        return false;
    }

    @Override
    public boolean personalTextUpdateUser() {
        return false;
    }

    @Override
    public boolean removeUser() {
        return false;
    }

    @Override
    public boolean groupPayAdvert() {
        return false;
    }

    @Override
    public boolean DailyProfileUpdateAdvert() {
        return false;
    }

    @Override
    public boolean startAdvert() {
        return false;
    }

    @Override
    public boolean removeAdvert() {
        return false;
    }

    @Override
    public boolean changeUserLimitAdvert() {
        return false;
    }

    @Override
    public boolean playAdvertScript() {
        return false;
    }
}

