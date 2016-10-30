package binglove.entity;

import java.io.Serializable;

/**
 * Created by jian on 2016/10/30.
 */

public class CardInfo implements Serializable{
    private String name;
    private String sex;
    private String cardStyple;
    private String cardNumber;
    private String birthday;
    private String visaOffice;
    private String TimeForVisa;
    private String failureTime;
    private String address;
    private String picture;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCardStyple() {
        return cardStyple;
    }

    public void setCardStyple(String cardStyple) {
        this.cardStyple = cardStyple;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getVisaOffice() {
        return visaOffice;
    }

    public void setVisaOffice(String visaOffice) {
        this.visaOffice = visaOffice;
    }

    public String getTimeForVisa() {
        return TimeForVisa;
    }

    public void setTimeForVisa(String timeForVisa) {
        TimeForVisa = timeForVisa;
    }

    public String getFailureTime() {
        return failureTime;
    }

    public void setFailureTime(String failureTime) {
        this.failureTime = failureTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public CardInfo(String name, String sex, String cardStyple, String cardNumber, String birthday, String visaOffice, String timeForVisa, String failureTime, String address, String picture) {

        this.name = name;
        this.sex = sex;
        this.cardStyple = cardStyple;
        this.cardNumber = cardNumber;
        this.birthday = birthday;
        this.visaOffice = visaOffice;
        TimeForVisa = timeForVisa;
        this.failureTime = failureTime;
        this.address = address;
        this.picture = picture;
    }
}
