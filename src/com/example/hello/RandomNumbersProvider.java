package com.example.hello;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by Tudor on 3/24/2016.
 */
public class RandomNumbersProvider {

    private int size;

    private int lowerLimit;

    private int higherLimit;

    public RandomNumbersProvider(int size, int lowerLimit, int higherLimit) {
        this.size = size;
        this.lowerLimit = lowerLimit;
        this.higherLimit = higherLimit;

        if (higherLimit <= lowerLimit)
            throw new IllegalArgumentException("higherLimit needs to be greater than lowerLimit");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public int getHigherLimit() {
        return higherLimit;
    }

    public void setHigherLimit(int higherLimit) {
        this.higherLimit = higherLimit;
    }

    public Set<Integer> generateNumbers() {
        Random random = new Random();
        Set<Integer> numbersSet = new HashSet<Integer>();
        boolean alreadyThere;
        for (int i = 0; i < size; i++) {
            do {
                int number = random.nextInt(higherLimit - lowerLimit) + lowerLimit;
                alreadyThere = !numbersSet.add(number);
                System.out.println((!alreadyThere ? "  " : "") + "generated " + number + " " +
                        (!alreadyThere ? "not contained" : "already there"));
            } while (alreadyThere);
        }
        return numbersSet;
    }
}
