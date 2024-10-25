package errNexception;

public class six {
    public static void main(String[] args) {
        System.out.println("HELLOOOo");
        try{
        String ename=null;
        System.out.println(ename.length());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("GM");
    }
}
