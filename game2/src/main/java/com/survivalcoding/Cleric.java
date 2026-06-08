package com.survivalcoding;

public class Cleric {
    String name = "Cleric";
    int HP = 50;
    int MP = 10;

    void selfAid() {
        System.out.println("MP를 5 소비하는것으로 자신의 HP를 최대 HP까지 회복할 수 있다.");
    }
}
