public class Shape {
    protected int r,length,width,a,b,hight,up,down;
    protected double area,angle;
    protected static int circle,triangle,rectangle,trapezoidel;
    private int sum;
    public int getCircle(){
        return circle;
    }
    public int getTriangle(){
        return triangle;
    }
    public int getRectangle(){
        return triangle;
    }
    public int getTrapezoidel(){
        return trapezoidel;
    }
    public int getSum(){
        sum = circle+triangle+rectangle+trapezoidel;
        return sum;
    }
    public double getArea(){
        return area;
    }
}
