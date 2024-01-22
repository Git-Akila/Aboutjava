interface Shape{
    void show();
    static void line(){
    System.out.println("The Shapes are:");}

}
class Rectangle implements Shape{
    public void show()
    {
        System.out.println("The Shape is Rectangle");
    }
}
class Square implements Shape{
    public void show(){
        System.out.println("The Shape is Square");
    }
}
public class Exampleabstract1{
    public static void main(String args[]) {
        Shape s=new Square();
        s.show();
        Shape a=new Rectangle();
        a.show();

    }
}
