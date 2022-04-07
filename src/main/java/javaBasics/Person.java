package javaBasics;

public class Person {
    // private variables declared here and they can only be accessed by public methods of the class
    private String myAge;
    private String sex;
    private String iq;


    public String getMyAge() {
        return myAge;
    }

    public void setMyAge(String myAge) {
        this.myAge = myAge;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIq() {
        return iq;
    }

    public void setIq(String iq) {
        this.iq = iq;
    }


}
