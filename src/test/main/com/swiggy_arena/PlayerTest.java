package main.com.swiggy_arena;

import com.swiggy_arena.Player;

public class PlayerTest {
    public static void main(String[] args) {
        Player player = new Player(50, 5, 10);
        assert player.getHealth() == 50;
        assert player.getStrength() == 5;
        assert player.getAttack() == 10;

        player.reduceHealth(20);
        assert player.getHealth() == 30;

        player.reduceHealth(40);
        assert player.getHealth() == 0;
        assert !player.isAlive();

        System.out.println("All Player tests passed.");
    }
}
