class Test{
    int a=100;
    int b=200;
    static int c=300;

    public static void main(String[]args){
        Test t1=new Test();

        Test t2=new Test();
        
        t2.b=20;
        c=200;

        System.out.println(t1.a+t1.b+c);   // static variable c can be accessed directly
        System.out.println(t2.a+t2.b+c);   //as c since it is static
    }       
}
