class Test{
    int a=100;    //instance variable
    //cannot access static context instance

    static int b=200;  //static variable
    //can be accessed with class,object or directly in static context

    public static void main(String[]args){
        int c=300;               //local variable   used usually for temproary purpose
        Test t1=new Test();
        System.out.println(t1.a);    //can't use (a) because its non static
        System.out.println(Test.b);  //accessing b thru class name
        System.out.println(t1.b);     //accessing b thru object name
        System.out.println(b);       //accessing b directly as it is static variable
        System.out.println(c);       
    }
}

