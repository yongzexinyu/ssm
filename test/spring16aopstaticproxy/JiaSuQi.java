package spring16aopstaticproxy;

public class JiaSuQi {
    private Game game;//代理类才是主体类，代理对象依赖了目标对象 ，代理对象包含了目标对象
    private int ws;

    public  void conNet(){
//这个方法要承接目标对象的方法
        int wangsu=game.getWangSu();//目标对象的网速方法
        this.ws=wangsu-400;
        System.out.println("现在打游戏网速为： " + this.ws);
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getWs() {
        return ws;
    }

    public void setWs(int ws) {
        this.ws = ws;
    }
}
