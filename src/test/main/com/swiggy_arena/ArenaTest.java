package main.com.swiggy_arena;

import com.swiggy_arena.Arena;
import com.swiggy_arena.Player;

public class ArenaTest {
    public static void main(String[] args) {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        Arena arena = new Arena(playerA, playerB);
        arena.startMatch();

        System.out.println("All Arena tests passed.");
    }
}
