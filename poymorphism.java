class Polygon{
    public void Shape(){
        System.out.println("IT's the shape of traingle");
    }

}
class Circle extends Polygon{
    public void Shape(){
        System.out.println("IT's the shape of Circle");
    }
}
class Square extends Polygon{
    public void Shape(){
        System.out.println("It's the Shape of Square");
    }
}
public class Polymorphism
{
    public static void main(String args[]){
        Polygon  ss=new Polygon();
        ss.Shape();
        Circle c=new Circle();
        Square s=new Square();
        c.Shape();
        s.Shape();
    }
}
