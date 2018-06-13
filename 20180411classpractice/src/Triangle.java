public class Triangle extends Shape{
    public Triangle(int a1,int b1,double angle1){
        if (a1>0 && b1>0 && angle1>180){
            a = a1;
            b = b1;
            angle = angle1;
            area = a*b*Math.sin(angle);
        }else{
            System.out.println("ERROR");
        }
    }
}
