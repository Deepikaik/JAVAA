//how to access static members
class Employee{    //int is class level variables
    static int eid=101;  //error occurs because it should be defined with static
    public static void m1(){
        System.out.println("Employee class - m1 method");
    }
    public static void main(String[]args){
        System.out.println(eid)
        m1();
    }
}