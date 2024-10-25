

class A{}
class B{}
class C extends B{}
public class Assignment {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        int c=100;
        String ename1="Rahul";
        String ename2=new String("Rahul");
        StringBuffer ename3=new StringBuffer("Rahul");
        A obj1=new A();
        B obj2=new B();
        C obj3=new C();
        System.out.println(a==b); //false (equal operator)
        System.out.println(a==c);  //true(equal operator)

        //System.out.println(a==ename1);//CE coz int and str
        //System.out.println(a.equals(c));//CE

        System.out.println(ename1.equals(ename2));//true
        System.out.println(obj1.equals(obj2));//false

        //System.out.println(obj1==obj2);//CE 

        System.out.println(obj3==obj2);//false
        System.out.println(ename3.equals(ename1));//false
    }
    
}
