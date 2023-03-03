package com.example.pynt;

public class UserModel {
    private String edittxtfullname, edittxtregemailaddress, edittxtregpassword, edittxtregcontactnumber, edittxtregaddress;

    public UserModel(){

    }

    public UserModel(String fullname, String regemailaddress, String edittxtregpassword, String edittxtregcontactnumber, String regaddress) {
        this.edittxtfullname = fullname;
        this.edittxtregemailaddress = regemailaddress;
        this.edittxtregpassword = edittxtregpassword;
        this.edittxtregcontactnumber = edittxtregcontactnumber;
        this.edittxtregaddress = regaddress;
    }


    public String getFullname() {
        return edittxtfullname;
    }

    public void setFullname(String fullname) {
        this.edittxtfullname = fullname;
    }

    public String getEdittxtregemailaddress() {
        return edittxtregemailaddress;
    }

    public void setEdittxtregemailaddress(String edittxtregemailaddress) {
        this.edittxtregemailaddress = edittxtregemailaddress;
    }

    public String getEdittxtregpassword() {
        return edittxtregpassword;
    }

    public void setEdittxtregpassword(String edittxtregpassword) {
        this.edittxtregpassword = edittxtregpassword;
    }

    public String getEdittxtregcontactnumber() {
        return edittxtregcontactnumber;
    }

    public void setEdittxtregcontactnumber(String edittxtregcontactnumber) {
        this.edittxtregcontactnumber = edittxtregcontactnumber;
    }

    public String getEdittxtregaddress() {
        return edittxtregaddress;
    }

    public void setEdittxtregaddress(String edittxtregaddress) {
        this.edittxtregaddress = edittxtregaddress;
    }
}
