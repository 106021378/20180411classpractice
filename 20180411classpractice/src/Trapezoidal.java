public class Trapezoidal extends Shape {
    public Trapezoidal(int up1,int down1,int hight1){
        if (up1>0 && down1>0 &&  hight1>0){
            up = up1;
            down = down1;
            hight = hight1;
            area = ((up+down)*hight/2);
        }else{
            System.out.println("ERROR");
        }
    }
}
