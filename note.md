@Autowired:自动装配通过类型，名字
        如果Autowired不能唯一制动装配属性，则需要@Qualifier(value="xxx")
@Nullable:这个字段可以为null

@Component:组件，放在类上，说明这个类被spring管理，就是bean
    dao[@Repository]
    service[@Service]
    controller[@Controller]
    这四个注解功能一样，都是代表将某个类注册到spring中，装配bean
@ComponentScan:扫描包

@Scope:设定作用域
    singleton单实例的(单例)(默认)----全局有且仅有一个实例
    prototype多实例的(多例)---- 每次获取Bean的时候会有一个新的实例
    reqeust同一次请求---request：每一次HTTP请求都会产生一个新的bean，同时该bean仅在当前HTTP request内有效
    session同一个会话级别---- session：每一次HTTP请求都会产生一个新的bean，同时该bean仅在当前HTTP session内有效

@Configuration:代表这是配置类，和beans.xml一样

@Bean:注册一个bean，等于bean标签
    方法名等于bean标签的id
    返回值等于bean标签的class

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xmlns:context="http://www.springframework.org/schema/context" xmlns:aop="http://www.springframework.org/schema/aop"
xmlns:tx="http://www.springframework.org/schema/tx"
xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd
http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop.xsd
http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx.xsd">
