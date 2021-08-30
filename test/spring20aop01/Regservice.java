package spring20aop01;
//这个是主要业务
public interface Regservice {
    void addUser();//切入点 spring20aop01.Regservice.addUser
    //登陆前发个短信验证
    void loginUer();
    //环绕通知
    void transMoney();
}
