package myhomework.com.meilmanager.model;

/**
 * Created by Misho on 6/16/2016.
 */
public class EmailData {
    String strSender;
    String strSubject;
    String strBody;
    public EmailData(){

    }
    // constructor
    public EmailData(String Sender, String Subject, String Body){
        this.strSender = Sender;
        this.strSubject = Subject;
        this.strBody = Body;
    }
    public String getSender() {
        return this.strSender;
    }
    public void setSender(String Sender){
        this.strSender = Sender;
    }
    public String getSubject() {
        return this.strSubject;
    }
    public void setSubject(String Subject){
        this.strSubject = Subject;
    }
    public String getBody() {
        return this.strBody;
    }
    public void setBody(String Body){
        this.strBody = Body;
    }
}
