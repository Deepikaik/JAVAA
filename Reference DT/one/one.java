class One{
    static String s;

    public static void main(String[]args){
        
    int[] sizes={30,35,40,45,50};
    System.out.println(sizes);           //[I@530612ba
    for(int size : sizes){              //iterating using foreach
        System.out.println(size); 
    }

    String enames[]={"Rahul","Sonia","Priya","Modi"};
    System.out.println(enames);        //[Ljava.lang.String;@2a40cd94
     for(String ename : enames){      //iterating using foreach
        System.out.println(ename); 
    }


    System.out.println(s);

    }
}
