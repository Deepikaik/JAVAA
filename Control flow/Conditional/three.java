//check if the num is even or odd
class three{
    public static void main(String[]arge){
        int num=378796;
        if(num%2 ==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}


//using ternary operator
class test{
    public static void main(String[]arge){
        int num=33;
       String abc= num%2==0? "even":"odd";
       System.out.println(abc);
    }
}