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
        Child c1=new Child();
        c1.m1();
        c1.m2();
        c1.m3();
    }
}