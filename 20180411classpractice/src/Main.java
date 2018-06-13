import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Shape shape = new Shape();
        boolean flag = true;
        while (flag){
            System.out.println("1.輸入圓形");
            System.out.println("2.輸入矩形");
            System.out.println("3.輸入梯形");
            System.out.println("4.輸入三角形");
            System.out.println("5.有多少個物件");
            System.out.println("6.結束");
            int q = scn.nextInt();
            switch (q){
                case 1:
                    Circle circle = new Circle(scn.nextInt());
                    System.out.println(circle.getArea());
                    break;
                case 2:
                    Rectangle rectangle = new Rectangle(scn.nextInt(), scn.nextInt());
                    System.out.println(rectangle.getArea());
                    break;
                case 3:
                    Trapezoidal trapezoidal = new Trapezoidal(scn.nextInt(), scn.nextInt(), scn.nextInt());
                    System.out.println(trapezoidal.getArea());
                    break;
                case 4:
                    Triangle triangle = new Triangle(scn.nextInt(), scn.nextInt(), scn.nextDouble());
                    System.out.println(triangle.getArea());
                    break;
                case 5:
                    System.out.println(shape.getSum());
                    break;
                case 6:
                    flag = false;
                    break;
            }
        }
    }
}
