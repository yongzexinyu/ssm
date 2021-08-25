package day021;

public class Keyboard {
    private Cpu cpu;
    public  Keyboard(Cpu cpu){
        this.cpu=cpu;
    }
    public  Keyboard(){
        System.out.println("键盘对象诞生了");
    }
    public void  click(){
        System.out.println("敲击键盘");
        cpu.dispatch();
    }
}
