package spring06di;
/*
* 人 是我们的 主题，主要的类  它需要依赖手机*/
public class Person {
    public PlayGame getPlayGame() {
        return playGame;
    }

    public void setPlayGame(PlayGame playGame) {
        this.playGame = playGame;
    }

    /* public Phone getPhone() {
            return phone;
        }

        public void setPhone(Phone phone) {//set 是暴露给别人看的，让别人给你东西的
            this.phone = phone;
        }*/
private  PlayGame playGame;
    public Person(){
        System.out.println("人在容器中诞生了");
    }
   /* private Phone phone;*///人依赖了手机，所以，人就拥有了手机
  /*  private Psp psp;*/
    public void play(){
        System.out.println("人在玩手机");
        playGame.game();
      /*  phone.game();*/
    }
}
