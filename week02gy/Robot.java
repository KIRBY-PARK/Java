package week02gy;

public class Robot {

    // 속성
    private boolean leftleg;
    private boolean rightleg;

    // 기능
    public void setLeftleg(boolean power) {
        this.leftleg = power;
    }

    public void setRightleg(boolean power) {
        this.rightleg = power;
    }

    // 기능 개선
    public void moveRobot(boolean power){
        this.leftleg = power;
        this.rightleg = power;
    }
}
