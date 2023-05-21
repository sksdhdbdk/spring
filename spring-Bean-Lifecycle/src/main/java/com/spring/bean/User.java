package com.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/*
* bean的生命周期五部,还有七步,十步
* 第一步:实例化bean,调用无参构造方法
* 第二步:给bean属性赋值,调用set方法
* 第三步:初始化bean,调用bean的init方法,init需要自己写
* 第四步:使用bean
* 第五步:销毁bean.调用bean的destroy方法,需要自己写*/
/*七步添加"bean后处理器"在初始化bean的前后*/

/*十步添加在执行"bean后处理器"前后,销毁前
* 点位1:在"bean后处理器"前
*       检查bean是否实现aware相关接口,如果实现了则调用接口中的方法
*点位2:在"bean后处理器"后
*       检查bean是否实现InitializingBean接口,如果实现了则调用接口中的方法
*点位3:在使用bean后,或者说销毁bean前
*       检查bean是否实现DisposableBean相关接口,如果实现了则调用接口中的方法 */
public class User implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean,DisposableBean {
    private String name;
    public User(){
        System.out.println("第一步:无参构造方法执行");
    }

    public void setName(String name) {
        System.out.println("第二步:给对象的属性赋值");
        this.name = name;
    }
    public void initBean(){
        System.out.println("第三步:初始化bean");
    }
    public void destroyBean(){
        System.out.println("第五步:销毁bean");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("bean的类加载器"+classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("生产bean的工厂对象"+beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("bean的名字"+name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean的afterPropertiesSet执行");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean的destroy方法执行");
    }
}
