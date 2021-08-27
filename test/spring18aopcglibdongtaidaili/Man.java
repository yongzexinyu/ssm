package spring18aopcglibdongtaidaili;

public class Man {
    private int gaoKaoScore=300;

    public int getGaoKaoScore() {
        return gaoKaoScore;
    }

    public void setGaoKaoScore(int gaoKaoScore) {
        this.gaoKaoScore = gaoKaoScore;
    }

    public  int dream(){
        System.out.println("高考成绩"+this.gaoKaoScore);
        return  this.gaoKaoScore;
    }
}
