import java.util.Scanner;
public class akila{
    static int max(int a,int b){
        return a>b?a:b;
    }
    static double max(double a,double b){
        return a>b?a:b;
    }
    static int max(char a,char b)
    {
        return a>b?a:b;
    }
    public static void main(String args[]) {
        System.out.println(max(5,7));
        System.out.println(max(6,8));
        System.out.println(max(5.7,3.4));
        System.out.println(max('p','c'));
    }}
