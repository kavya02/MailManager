package myhomework.com.meilmanager.model;

/**
 * Created by James-001 on 2/24/2016.
 * datas related with UserInfomation..
 *this class are including student email, email subject, email content  and program id
 * can get datas and set new datas ..
 */
public class UserInfomation {
    String _userID;
    String _EmailAddress;
    String _Password;
    String _FirstName;
    String _LastName;
    public UserInfomation(){

    }
    // constructor
    public UserInfomation(String userID, String EmailAddress, String Password,
                          String FirstName, String LastName){
        this._userID = userID;
        this._EmailAddress = EmailAddress;
        this._Password = Password;
        this._FirstName = FirstName;
        this._LastName = LastName;
    }
    public String getUserID() {
        return  this._userID;
    }
    public void setUserID(String userID) {
        this._userID = userID;
    }
    public String getEmailAddress(){
        return this._EmailAddress;
    }
    // setting id
    public void setEmailAddress(String studentEmail){
        this._EmailAddress = studentEmail;
    }
    // getting name
    public String getPassword(){
        return this._Password;
    }
    public void setPassword(String emailSubject){
        this._Password = emailSubject;
    }
    public String getFirstName(){
        return this._FirstName;
    }
    public void setFirstName(String emailContent){
        this._FirstName = emailContent;
    }
    public String getLastName(){
        return this._LastName;
    }

    public void setLastName(String programId){
        this._LastName = programId;
    }
}

