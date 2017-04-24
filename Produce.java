package com.proto.aaronlee.farmerpayout;

/**
 * Created by Connor Haas on 2/23/2017.
 */

public class Produce {


    public String name = null;
    public double priceAtConsignment = 0.0;
    public int unit = 0;
    public String weight = null;
    public double grossPerCrop = 0.0;

    public Produce (String name, double priceAtConsignment, int unit, String weight, double grossPerCrop)
    {

        name = name;
        priceAtConsignment =  priceAtConsignment;
        unit = unit;
        weight = weight;
        grossPerCrop = grossPerCrop;

    }
}
