package com.cc.java;

import com.cc.java.Bees.Drone;
import com.cc.java.Bees.HoneyBee;
import com.cc.java.Bees.Queen;
import com.cc.java.Bees.Worker;
import com.cc.java.Birds.Bird;

public class App {
    
    public static void main(String[] args) {
     
        HoneyBee worker = new Worker();
        HoneyBee queen = new Queen();
        HoneyBee drone = new Drone();

        Bird bird = new Bird();

        output("----- Bees -----");
        output(worker.doYourJob());
        output(queen.doYourJob());
        output(drone.doYourJob());

        output("---- Bird(s) ------");
        output(bird.hasFeathers());

        output("----------------");

        output("---- Birds & Bees ------");
        output(worker.fly());
        output(queen.fly());
        output(drone.fly());
        output(bird.fly());

    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

