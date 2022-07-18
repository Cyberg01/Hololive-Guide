package com.example.hololiveguide;

import android.os.Parcel;
import android.os.Parcelable;

public class Talent {
    private String name;
    private String hololive;
    private String quotes;
    private String desc;
    private String nickName;
    private String debute;
    private String affiliation;
    private String illustrator;
    private String birthday;
    private String fanbase;
    private String talentChannel;

    public String getTalentWebio() {
        return talentWebio;
    }

    public void setTalentWebio(String talentWebio) {
        this.talentWebio = talentWebio;
    }

    public String getTalentTwitter() {
        return talentTwitter;
    }

    public void setTalentTwitter(String talentTwitter) {
        this.talentTwitter = talentTwitter;
    }

    private String talentWebio;
    private String talentTwitter;
    private int height;
    private int photo;

    public String getTalentChannel() {
        return talentChannel;
    }

    public void setTalentChannel(String talentChannel) {
        this.talentChannel = talentChannel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHololive() {
        return hololive;
    }

    public void setHololive(String hololive) {
        this.hololive = hololive;
    }

    public String getQuotes() {
        return quotes;
    }

    public void setQuotes(String quotes) {
        this.quotes = quotes;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getDebute() {
        return debute;
    }

    public void setDebute(String debute) {
        this.debute = debute;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getFanbase() {
        return fanbase;
    }

    public void setFanbase(String fanbase) {
        this.fanbase = fanbase;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
