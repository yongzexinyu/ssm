package day05aopban;

public class VideoServiceImpl implements  VideoService {
    @Override
    public void boFang() {
        System.out.println("播放**");
    }

    @Override
    public void zanTing() {
        System.out.println("暂停**");
    }
    @Override
    public void zhuanJinBi() {
        System.out.println("转金币.....");
    }

    @Override
    public void noFindVideo() {
        int i=9/0;
        System.out.println("视频找不到了");
    }
}
