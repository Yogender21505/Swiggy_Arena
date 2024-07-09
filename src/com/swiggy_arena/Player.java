package com.swiggy_arena;
public class Player {

    // Using Encapsulation properties to ensure that the data security and avoid redundancy
    private int health;
    private int strength;
    private int attack;

    // constructor
    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    // reduce health method to keep changing the health while got damage
    public void reduceHealth(int damage) {
        this.health -= damage;
        if(this.health<0){
            this.health = 0;
        }
    }

    // getter and setter functions to call it from other classes to get and set the values as per the requirements
    public int getHealth() {return health;}
    public int getStrength() {return strength;}
    public int getAttack(){return attack;}
    public boolean isAlive(){return this.health>0;}

}
