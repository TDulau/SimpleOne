package com.example.hello;

/**
 * Created by Tudor on 3/22/2016.
 */
public class Simple {
    public static void main(String[] args) {

        int div = 2;

        for (int i = 0; i < 14; i++) {
            System.out.println(i + ": I'm saying HI!");
            if (i % div == 0) {
                System.out.println("    " + i + " -> am a multiple of " + div);
            }
        }
    }
}
