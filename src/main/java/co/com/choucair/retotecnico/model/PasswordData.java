package co.com.choucair.retotecnico.model;

public class PasswordData {
    private String strPassword;
    private Boolean strCheckUpdate;
    private Boolean booleanCheckTermOfUser;
    private Boolean booleanPrivacy;
    private String strMsgWelcome;


    public Boolean getStrCheckUpdate() { return strCheckUpdate; }
    public void setStrCheckUpdate(Boolean strCheckUpdate) { this.strCheckUpdate = strCheckUpdate; }

    public String getStrPassword() { return strPassword; }
    public void setStrPassword(String strPassword) { this.strPassword = strPassword; }

    public Boolean getBooleanCheckTermOfUser() { return booleanCheckTermOfUser; }
    public void setBooleanCheckTermOfUser(Boolean booleanCheckTermOfUser) { this.booleanCheckTermOfUser = booleanCheckTermOfUser; }

    public Boolean getBooleanPrivacy() { return booleanPrivacy; }
    public void setBooleanPrivacy(Boolean booleanPrivacy) { this.booleanPrivacy = booleanPrivacy; }

    public String getStrMsgWelcome() { return strMsgWelcome; }
    public void setStrMsgWelcome(String strMsgWelcome) { this.strMsgWelcome = strMsgWelcome; }
}
