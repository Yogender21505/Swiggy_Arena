package com.swiggy_arena;

import java.util.Random;
public class Die {

    // Define the number of sides on the die
    private static final int SIDES = 6;

    // Initialize a Random object for generating random numbers
    private Random random;

    // Constructor to create a Die object and initialize the Random object
    public Die() {
        this.random = new Random();
    }

    // Function to roll the die, generating a random value between 1 and 6
    public int roll() {
        // nextInt(SIDES) generates a value from 0 to (SIDES-1), so add 1 to get a range from 1 to SIDES
        return random.nextInt(SIDES) + 1;
    }
}
