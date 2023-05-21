package com.spring.simpleFactory;
//工厂类角色
public class WeaponFactory {
    public static Weapon get(String weaponType){
        //静态方法获取产品看传参,传Tank获取坦克
        //简单工厂模式有一个静态方法,被称为静态工厂方法模式
        if ("Tank".equals(weaponType)) {
            return new Tank();
        }
        else if ("Dagger".equals(weaponType)){
            return new Dagger();
        } else if ("Fighter".equals(weaponType)) {
            return new Fighter();
        }else {
            throw new RuntimeException("不支持该武器的生产");
        }
    }
}
