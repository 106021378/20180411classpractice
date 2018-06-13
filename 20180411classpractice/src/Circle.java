public class Circle extends Shape{
    public Circle(int r1){
        if (r1>0){
            r = r1;
            area = r*r*Math.PI;
        }else{
            System.out.println("ERROR");
        }
    }
}
