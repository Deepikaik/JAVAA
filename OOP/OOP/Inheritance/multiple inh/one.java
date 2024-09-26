class Parent{
    public void m1(){
        System.out.println("parent m1");
        };
    public void m2(){
        System.out.println("parent m2");
        };
}

class Child extends Parent{
    public void m3(){
        System.out.println("child m3");
        };
}

class Test{
    public static void main(String[]args){


        Parent p1=new Parent();
        p1.m1();
        p1.m2();
        //cant have m3() because it is in child class

        Child c1=new Child();
        c1.m1();
        c1.m2();

        c1.m3();

        Parent p2=new Child();
        p2.m1();
        p2.m2();
       //  p2.m3(); because parent type only has m1 and m2

       //  error Child c2=new Parent(); because parent cannot refer to child

    }
}


