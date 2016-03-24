package com.example.hello;

import java.util.Set;

/**
 * Created by Tudor on 3/22/2016.
 */
public class Simple {
    public static void main(String[] args) {

        int div = 2;
        RandomNumbersProvider provider = new RandomNumbersProvider(6, 1, 50);
        Set<Integer> generatedNumbers = provider.generateNumbers();
        System.out.println("\nNumbers generated:");

        for (int i : generatedNumbers) {
            System.out.println("  " + i + " -> am " + (i % div != 0 ? "NOT " : " ") + "a multiple of " + div);
        }
    }
}
