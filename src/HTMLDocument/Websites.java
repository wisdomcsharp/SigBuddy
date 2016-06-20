package HTMLDocument;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Wisdom on 13/06/2016.
 */

public class Websites {
    public enum Website {
        BitcoinTalk{
            @Override
            public URL toURL(){
                try {
                    toURL = new URL("https://bitcointalk.com");
                }catch(MalformedURLException Ex){
                    new Throwable("MalformedURLException");
                }
                return toURL;
            }

            @Override
            public URL toProfile(String userId){
                try {
                    toProfile = new URL("https://bitcointalk.org/index.php?action=profile;u="+userId);
                }catch(MalformedURLException Ex){
                    new Throwable("MalformedURLException");
                }
                return toProfile;
            }

            @Override
            public URL toProfileInfo(String userId){
                try {
                    toProfileInfo = new URL("https://bitcointalk.org/index.php?action=profile;u="+userId+";sa=forumProfile");
                }catch(MalformedURLException Ex){
                    new Throwable("MalformedURLException");
                }
                return toProfileInfo;
            }
            @Override
            public URL toProfileAvatar(String userId){
                try {
                    toProfileAvatar = new URL("https://bitcointalk.org/index.php?action=avatar;u="+userId);
                }catch(MalformedURLException Ex){
                    new Throwable("MalformedURLException");
                }
                return toProfileAvatar;
            }
        },
        bitcoinforum{
            @Override
            public URL toURL(){
                try {
                    toURL = new URL("https://bitcoinforum.com");
                }catch(MalformedURLException Ex){
                    new Throwable("MalformedURLException");
                }
                return toURL;
            }

            @Override
            public URL toProfile(String userId){
                try {
                    toProfile = new URL("https://bitcoinforum.com/profile/?area=summary;u="+userId);
                }catch(MalformedURLException Ex){
                    new Throwable("MalformedURLException");
                }
                return toProfile;
            }

            @Override
            public URL toProfileInfo(String userId){
                try {
                    toProfileInfo = new URL("https://bitcoinforum.com/profile/?area=forumprofile;u="+userId);
                }catch(MalformedURLException Ex){
                    new Throwable("MalformedURLException");
                }
                return toProfileInfo;
            }
            @Override
            public URL toProfileAvatar(String userId){
                //Not supported yet. Need to get an account that can view these areas.
                return null;
            }
        };

        protected URL toURL;
        protected URL toProfile;
        protected URL toProfileInfo;
        protected URL toProfileAvatar;

        public abstract URL toURL();
        public abstract URL toProfile(String userId);
        public abstract URL toProfileInfo(String userId);
        public abstract URL toProfileAvatar(String userId);

    }

}