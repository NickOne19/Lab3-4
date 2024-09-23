package com.example;
public class App {
    public static void main(String[] args) throws Exception {

        SmartLamp SmartLamp = new SmartLamp();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("- Start State -");
        System.out.println("BRIGHTNESS: " + SmartLamp.getBrightness());
        System.out.println("MODE: " + SmartLamp.getMode());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");

        try {
            SmartLampStart.run(SmartLamp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
