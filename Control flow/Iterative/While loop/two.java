class two{
    public static void main(String[]args){
        for(int i=10;i<=0;i++);
        System.out.println(i);
    }
    //eror output

class two1{
    public static void main(String[]args){
        int i=10;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=0);
    }                  //output is 10
}