/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import HTMLDocument.Websites.Website;
import javafx.geometry.Pos;

/**
 *
 * @author Wisdom
 */
public abstract class User{

     private String userId;
     private String name;
     private String posts;
     private int activity;
     private String dateRegistered;
     private String lastActive;
     private String emial;
     private Website website;
     private String bitcoinAddress;
     private TrustType trustType;
     private String avatarURI;
     private String signature;
     private String personalText;
     private Position position;
     private String userCookie;
     private String userSC;

     private enum Position {
        Brand_New,
        Newbie,
        JR_Member,
        Member,
        Full_Member,
        SR_Member,
        Hero_Member,
        Legendary
    }
     private enum TrustType{
        Positive,
        Negative
    }
     public enum  Update {
         updateUser,
         updateUserInfo,
         updateUserAvatar,
         updateUserPersonalText,
         clearUser
     }

    public String getUserSC(){return this.userSC;}
    public String getUserCookie(){return this.userCookie;}
    public String getUserId(){
        return this.userId;
    }
    public String getName(){
        return this.name;
    }
    public String getPosts(){

        return this.posts;
    }
    public int getActivity(){

        return this.activity;
    }
    public Position getPosition(){

        return this.position;
    }
    public String getDateRegistered(){

        return this.dateRegistered;
    }
    public String getlastActive(){

        return this.lastActive;
    }
    public String getEmail(){


        return this.emial;
    }
    public Website getWebsite(){
        return this.website;
    }
    public String getBitcoinAddress(){
        return this.bitcoinAddress;
    }
    public TrustType getTrustType(){

        return this.trustType;
    }
    public String getAvatarURI(){

        return this.avatarURI;
    }
    public String getSignature(){

        return this.signature;
    }
    public String getPersonalText(){

        return this.personalText;
    }


    public void setUserSC(String sc){this.userSC = sc;}
    public void setUserCookie(String cookie){this.userCookie = cookie;}
    public void setUserId(String userId){
        this.userId = userId;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPosts(String posts){
        this.posts = posts;
    }
    public void setActivity(int activity){
        this.activity = activity;
    }
    public void setPosition(int activity){
        this.position = Position.Brand_New;

        if(activity > 1)
            this.position = Position.Newbie;

        if(activity > 29)
            this.position = Position.JR_Member;

        if(activity > 59)
            this.position = Position.Member;

        if(activity > 119)
            this.position = Position.Full_Member;

        if(activity > 239)
            this.position = Position.SR_Member;

        if(activity > 479)
            this.position = Position.Hero_Member;

        if(activity > 774)
            this.position = Position.Legendary;

    }
    public void setDateRegistered(String dateRegistered){
        //might need to be converted to Date type, for db
        this.dateRegistered = dateRegistered;
    }
    public void setlastActive(String lastActive){
        //might need to be converted to date-time for db
        this.lastActive  = lastActive;
    }
    public void setEmail(String email){
        this.emial = email;
    }
    public void setWebsite(Website website){
        this.website = website;
    }
    public void setBitcoinAddress(String bitcoinAddress){
        this.bitcoinAddress = bitcoinAddress;
    }
    public void setTrust(int trustType){
        //o = negative
        //1 = positive
         this.trustType = trustType == 0? TrustType.Negative : TrustType.Negative;
    }
    public void setAvatarURI(String avatarURI){

        this.avatarURI = avatarURI;
    }
    public void setSignature(String signature){
        this.signature = signature;
    }
    public void setPersonalText(String personalText){
        this.personalText = personalText;
    }
}