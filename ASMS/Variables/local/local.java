class Test{ 
    int a; 
    public void m1(){              //local variable 
        System.out.println(a);
    }
    public void m2(){
        System.out.println(a);
    }
    public static void main(String[]args){                      
    m1(); //error output---local.java:10: error: non-static method m1() cannot be referenced from a static context m1();
        //---local.java:11: error: non-static variable a cannot be referenced from a static context System.out.println(a);
     System.out.println(a);
    }
}