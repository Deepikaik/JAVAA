package errNexception;

public class two {
    public static void main(String[] args) {
        System.out.println("GM");
        try{
        System.out.println(10/0); //ArithmeticException
        }
        catch(Exception e){
            System.out.println("can't divide by zero");
        }
        System.out.println("GA");
    }
    
}
