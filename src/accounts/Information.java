package accounts;

/**
 * Created by Wisdom on 14/06/2016.
 */

public interface Information {//php updates db and server updates web accounts.

    public boolean updateUser(String cookie); //updates or adds info and cookie in DB, and pulls info
    public boolean signatureUpdateUser(); //changes the signature on a users account, and pulls info
    public boolean avatarUpdateUser(); //updates the avatar of a users account
    public boolean personalTextUpdateUser(); //updates a users personal text
    public boolean removeUser(); //removes the user requires userid

    public boolean groupPayAdvert(); //weekily, makes group payment - requires ad_id
    public boolean DailyProfileUpdateAdvert(); //DB updates group stats of participants in the add like posts - requires ad_id
    public boolean startAdvert(); //requires ad_id - checks whether an advert can be started, then sends sigs to user profiles
    public boolean removeAdvert(); //requires ad_id - once an advert ends, removes all users associated.
    public boolean changeUserLimitAdvert(); // requires ad_id, increases users or decreases them.

    public boolean playAdvertScript(); //scripts are in the form of JSON text. they are settings for each campaign,
                                      // which are then processed and used to select users, set payment for each user... and remove users.
    //scripts are also played every week, after payments are made.





}
