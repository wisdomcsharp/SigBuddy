package HTMLDocument;

import accounts.User;
import org.jsoup.nodes.Document;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Wisdom on 17/06/2016.
 */
public class ExtractToUser {

    Document document;
    User user;

    public ExtractToUser(Document document) {
        this.document = document;
    }

    public User Extract() {

        String successTitle   =  document.select("table tbody tr.catbg td").html().toLowerCase();
        String successMessage =  document.select("table tbody tr td.windowbg").html().substring(0, 49).toLowerCase();//success if files, accept any...

        if(successTitle.equals("warning!") && successMessage.equals("you are not permitted to modify profile settings.")){
            //success
            System.out.print("Success!");
        }else{
            //fail
            System.out.print("Fail!");

        }
        //return --> success | "Warning!" - You are not permitted to modify profile settings. Please login below or register an account with Bitcoin Forum.



        return user;
    }


}
