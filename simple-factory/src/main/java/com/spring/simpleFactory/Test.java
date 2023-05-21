package com.spring.simpleFactory;
//客户端程序
public class Test {
    public static void main(String[] args) {
        //客户端不关心生产细节,只索要
        //简单工厂模式达到职责分类
        Weapon tank = WeaponFactory.get("Tank");
        tank.attack();
        Weapon dagger = WeaponFactory.get("Dagger");
        dagger.attack();
        Weapon fighter = WeaponFactory.get("Fighter");
        fighter.attack();
    }
}
