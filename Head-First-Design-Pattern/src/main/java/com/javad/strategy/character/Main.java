package com.javad.strategy.character;

public class Main {

    public static void main(String[] args) {
        Character king = new King();
        king.setWeaponBehavior(new AxeBehavior());
        king.performWeapon();
    }
}
