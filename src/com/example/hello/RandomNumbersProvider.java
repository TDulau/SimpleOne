package com.example.hello;

import java.util.*;

/**
 * Created by Tudor on 3/24/2016.
 */
public class RandomNumbersProvider {

    /**
     * size of the generate numbers set
     */
    private int size;

    /**
     * minimum value for generated numbers
     */
    private int lowerLimit;

    /**
     * maximum value for generated numbers
     */
    private int higherLimit;

    public RandomNumbersProvider(int size, int lowerLimit, int higherLimit) {
        this.size = size;
        this.lowerLimit = lowerLimit;
        this.higherLimit = higherLimit;

        if (higherLimit <= lowerLimit)
            throw new IllegalArgumentException("higherLimit needs to be greater than lowerLimit");

        if (size > higherLimit - lowerLimit)
            throw new IllegalArgumentException("specified size is too big");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size > higherLimit - lowerLimit)
            throw new IllegalArgumentException("specified size is too big");
        this.size = size;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(int lowerLimit) {
        if (higherLimit <= lowerLimit)
            throw new IllegalArgumentException("higherLimit needs to be greater than lowerLimit");
        this.lowerLimit = lowerLimit;
    }

    public int getHigherLimit() {
        return higherLimit;
    }

    public void setHigherLimit(int higherLimit) {
        if (higherLimit <= lowerLimit)
            throw new IllegalArgumentException("higherLimit needs to be greater than lowerLimit");
        this.higherLimit = higherLimit;
    }

    /**
     * Generate a number of random number within the provided range
     * @return
     */
    public Set<Integer> generateNumbers() {

        if (size > (higherLimit - lowerLimit) / 2)
            System.out.println("This may take a few moments ...");

//        Random random = new Random();
//        Set<Integer> numbersSet = new HashSet<Integer>();
//        boolean alreadyThere;
//        for (int i = 0; i < size; i++) {
//            do {
//                int number = random.nextInt(higherLimit - lowerLimit) + lowerLimit;
//                alreadyThere = !numbersSet.add(number);
//                System.out.println((!alreadyThere ? "+" : "|") + "generated " + number + " " +
//                        (!alreadyThere ? "not contained" : "already there"));
//            } while (alreadyThere);
//        }

        ArrayList<Integer> numList = new ArrayList<Integer>();
        for (int i = lowerLimit; i < higherLimit; i++) {
            numList.add(i);
        }
        Collections.shuffle(numList);

        Set<Integer> numbersSet = new HashSet<Integer>();
        numbersSet.addAll(numList.subList(0, 6));
        return numbersSet;
    }
}
