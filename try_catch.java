import java.util.Scanner;
public class akila
{
    public static void main(String args[])
    {
        Scanner aki=new Scanner(System.in);
        int a=10,b=0,c=0;
        try{
            c=a/b;
        }
        catch(Exception e){
            System.err.println("Error occurred");

    }
        System.out.println(c);
    }
}
