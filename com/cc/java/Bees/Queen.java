package com.cc.java.Bees;

public class Queen extends HoneyBee{
    
    public String doYourJob() {
        return "I'm a Queen, any questions?";
     }

    @Override
    public String fly() {
        return "I believe, I can fly  at 10mph!";
    }
     
}
