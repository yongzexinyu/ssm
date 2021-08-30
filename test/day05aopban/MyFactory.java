package day05aopban;

import day05xmlban.VIdeoAspect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyFactory {

    public static VideoService createService(){
        VideoService videoService=new VideoServiceImpl();
        VIdeoAspect vIdeoAspect=new VIdeoAspect();
        VideoService videoService1= (VideoService) Proxy.newProxyInstance(videoService.getClass().getClassLoader(),
                videoService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object result=null;
                        if(method.getName().equals("boFang")){
                            VideoAspect.beforeMsg();
                            result = method.invoke(videoService, args);

                        }
                        else if(method.getName().equals("zanTing")){

                            result = method.invoke(videoService, args);
                            VideoAspect.afterMsg();
                        }else if (method.getName().equals("zhuanJinBi")){
                            System.out.println("验证一下");
                            result = method.invoke(videoService, args);
                            System.out.println("转账成功");
                        }else if(method.getName().equals("noFindVideo")){
                            System.out.println("视频已失踪,推荐您看其他同类视频, 并给管理员的邮箱发 异常信息");
                            result = method.invoke(videoService, args);

                        }
                        return result;
                    }
                });
        return  videoService1;
    }
}
