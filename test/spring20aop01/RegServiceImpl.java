package spring20aop01;

public class RegServiceImpl implements  Regservice {
    @Override
    public void addUser() {
        System.out.println("调用了dao层，这个是 会员的注册的功能");
        //注册完毕之后，应当给 顾客发送一个短信通知，提示，您已经注册了什么什么
        //订单-- 违规 等
    }

    @Override
    public void loginUer() {

        System.out.println("调用了dao层，这个是 会员的登录的功能");
    }

    @Override
    public void transMoney() {
        int i=9/0;
        System.out.println("转账......");
    }

}
