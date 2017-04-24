package com.proto.aaronlee.farmerpayout;

/**
 * Created by Connor Haas on 2/23/2017.
 */

public class Farmer {

    public String name = null;
    public String UID = null;
    public String COO = null;
    public String lang = null;
    public String DOB = null;
    public double salesToDate = 0.0;

    //TODO
    public Farmer (String name, String UID, String COO, String lang, String DOB, double salesToDate)
    {
        name = name;
        UID = UID;
        COO = COO;
        lang = lang;
        DOB = DOB;
        salesToDate = salesToDate;
    }

    //TODO fill out by using a text field in GUI
}
