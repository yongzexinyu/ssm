package spring08autowire;
//主题类 依赖电脑类
public class Student {
    public void setGameInterface(GameInterface gameInterface) {
        this.gameInterface = gameInterface;
    }

    /*  public Computer getComputer() {
            return computer;
        }

        public void setComputer(Computer computer) {
            this.computer = computer;
        }

        private Computer computer;*/
  private  GameInterface gameInterface;
    public Student(){
        System.out.println("我是学生类，学生对象被创建了");
    }
    public void play(){
        System.out.println("学生玩");
     /*   computer.game();*/
        gameInterface.game();
    }
}
