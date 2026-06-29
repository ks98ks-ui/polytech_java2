package com.survivalcoding;

public class StrongBox<UNKNOWN> {
    private UNKNOWN data;
    private int count;
    private final KeyType keyType;

    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
        this.count = 0;
    }

    public void put(UNKNOWN data) {
        this.data = data;
    }

    public UNKNOWN get() {
        count++;

        if (count <= keyType.getDurability()) {
            return null;
        }

        return data;
    }
}

