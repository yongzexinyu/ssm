package day05aopban;

import day05xmlban.VIdeoAspect;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class VideoTest {
    @Test
    public  void  test(){

        VideoService videoService=MyFactory.createService();
        videoService.boFang();//播放
        System.out.println("======================");
        videoService.zanTing();//暂停
        System.out.println("======================");
        videoService.zhuanJinBi();//转金币
        System.out.println("======================");
        videoService.noFindVideo();
    }
}
