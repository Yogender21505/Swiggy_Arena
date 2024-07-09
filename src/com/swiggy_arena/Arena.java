package com.swiggy_arena;

public class Arena {
    private Player playerA;
    private Player playerB;
    private Die die;

    // Constructor to initialize players and the die
    public Arena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.die = new Die();
    }

    // Method to start the match and manage turns until one player dies
    public void startMatch() {
        while (playerA.isAlive() && playerB.isAlive()) {
            // Player with lower health attacks first
            if (playerA.getHealth() < playerB.getHealth()) {
                takeTurn(playerA, playerB);
                if (playerB.isAlive()) {
                    takeTurn(playerB, playerA);
                }
            } else {
                takeTurn(playerB, playerA);
                if (playerA.isAlive()) {
                    takeTurn(playerA, playerB);
                }
            }
        }

        // Announce the result of the match
        if (!playerA.isAlive()) {
            System.out.println("Player A is dead. Player B wins!");
        } else {
            System.out.println("Player B is dead. Player A wins!");
        }
    }

    // Method to manage an attack turn
    private void takeTurn(Player attacker, Player defender) {
        int attackRoll = die.roll();  // Attacker rolls the die
        int defenseRoll = die.roll(); // Defender rolls the die

        // Calculate attack damage and defense strength
        int attackDamage = attacker.getAttack() * attackRoll;
        int defenseStrength = defender.getStrength() * defenseRoll;

        // Calculate damage dealt to the defender
        int damageDealt = Math.max(0, attackDamage - defenseStrength);
        defender.reduceHealth(damageDealt);

        // Print the details of the turn
        System.out.println("Attacker's damage: " + attackDamage + ", Defender's defense: " + defenseStrength + ", Damage dealt: " + damageDealt);
        System.out.println("Defender's remaining health: " + defender.getHealth());
    }
}
