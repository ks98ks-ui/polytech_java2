package com.survivalcoding;

public enum KeyType {
    PADLOCK(1024),
    BUTTON(10000),
    DIAL(30000),
    FINGER(1000000);

    private final int durability;

    KeyType(int durability) {
        this.durability = durability;
    }

    public int getDurability() {
        return durability;
    }
}
