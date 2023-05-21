package com.spring.simpleFactory;

public class Fighter extends Weapon{
    @Override
    public void attack() {
        System.out.println("战斗机轰炸");
    }
}
