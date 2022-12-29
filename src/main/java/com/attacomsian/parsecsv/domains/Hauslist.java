package com.attacomsian.parsecsv.domains;

import com.opencsv.bean.CsvBindByName;

public class Hauslist {

    @CsvBindByName(column = "location")
    private String location;
    @CsvBindByName
    private String code;
    @CsvBindByName
    private String pzn;
    @CsvBindByName
    private String atcid;
    @CsvBindByName
    private String atctext;
    @CsvBindByName
    private String askid;
    @CsvBindByName
    private String asktext;

    public Hauslist() {
    }

    public Hauslist(String location, String code, String pzn, String atcid, String atctext, String askid, String asktext) {
        this.location = location;
        this.code = code;
        this.pzn = pzn;
        this.atcid = atcid;
        this.atctext = atctext;
        this.askid = askid;
        this.asktext = asktext;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPzn() {
        return pzn;
    }

    public void setPzn(String pzn) {
        this.pzn = pzn;
    }

    public String getAtcid() {
        return atcid;
    }

    public void setAtcid(String Atcid) {
        this.atcid = atcid;
    }

    public String getAtctext() {
        return atctext;
    }

    public void setAtctext(String atctext) {
        this.atctext = atctext;
    }

    public String getAskid() {
        return askid;
    }

    public void setAskid(String Askid) {
        this.askid = askid;
    }

    public String getAsktext() {
        return asktext;
    }

    public void setAsktext(String asktext) {
        this.asktext = asktext;
    }

    @Override
    public String toString() {
        return "Hauslist{" +
                ", location='" + location +
                ", code='" + code + '\'' +
                ", pzn='" + pzn + '\'' +
                ", atcid='" + atcid + '\'' +
                ", atctext='" + atctext + '\'' +
                ", askid='" + askid + '\'' +
                ", asktext=" + asktext +
                '}';
    }

}

