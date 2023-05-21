package com.Spring.bean;
//工厂方法模式的具体工厂角色
public class GunFactory {
    //该角色的方法为实例方法
    public Gun get(){
        return new Gun();
    }
}
