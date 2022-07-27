package com.cc.java.Bees;

public class Drone extends HoneyBee{
   
    public String doYourJob() {
        return "I'm a drone, I'm going to date our Queen!";
     }

    @Override
    public String fly() {
        return "I believe, I can fly at 6mph!";
    }


}
