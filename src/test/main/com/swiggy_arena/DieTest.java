package main.com.swiggy_arena;

import com.swiggy_arena.Die;

public class DieTest {
    public static void main(String[] args) {
        Die die = new Die();
        for (int i = 0; i < 100; i++) {
            int roll = die.roll();
            assert roll >= 1 && roll <= 6;
        }
        System.out.println("All Die tests passed.");
    }
}
