public class Rectangle extends Shape {
    public Rectangle(int l,int w){
        if (l>0 && w>0){
            length = l;
            width = w;
            area = length*width;
        }else{
            System.out.println("ERROR");
        }
    }
}
