package com.cc.java.Birds;

import com.cc.java.Interfaces.Flyable;
import com.cc.java.Interfaces.IFeathers;

public class Bird implements Flyable,IFeathers{

    @Override
    public String fly() {
        //
        return "I'm a bird, I can fly!";
    }

    @Override
    public String hasFeathers() {
        // 
        return "I'm a bird, I have feathers!";
    }
    
}

