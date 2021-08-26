package spring12zhujie;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ws.rs.ext.ParamConverter;

/*
* @Compent 叫做通用注解
* @Compent  这个注解等于xml中写了bean标签<bean id="human" class=""></bean>
* @Controller 等于@Compent  用在controller层
* @Service 等于@Compent   用在Service
* @Repository 等于@Compent 用在dao层
*四个注解功效一样，运用的地方不一样
* @Repository（"ren")可以起别名，如果不起，默认为类的首字母小写状态 human
* */
//@Component//相当于xml中的bean
@Scope("prototype")//加这个就是原型 相当于<bean id="human" class="" scope="prototype"></bean>
@ParamConverter.Lazy//加这个注解，懒加载<bean id="human" class="" scope="prototype" lazy-init="true"></bean>
@Repository
public class Human {
    public  Human(){
        System.out.println("human对象产生了");
    }
    @PostConstruct//构造器之前的方法，意思就是生命周期
    //<bean id="human" class="" scope="prototype" lazy-init="true" init-methid="initShow" destroy-method="destroyObj"></bean>
public void initShow(){
        System.out.println("大哭");
    }
    @PreDestroy  //<bean id="human" class="" scope="prototype" lazy-init="true" init-methid="initShow" destroy-method="destroyObj"></bean>
    public  void destroyObj(){
        System.out.println("临死前的遗嘱");
    }
}
