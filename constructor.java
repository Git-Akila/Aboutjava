class A{
    int A(int a,int b){
        return a+b;
    }
    int A(int a)
    {
        return a;
    }
    int A(int a,int b,int c){
        return a+b+c;
    }
}
class Constructor{
    public static void main(String args[]){
        A a=new A();

        System.out.println(a.A(2,2));
        System.out.println(a.A(2));
        System.out.println(a.A(1,2,3));


    }
}
