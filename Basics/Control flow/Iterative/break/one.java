class one{
    public static void main (String[]args){
        int[] prices={99,199,299,399,499,599,699};
        for(int i=0;i<=prices.length-1;i++){
            if(prices[i]==399){
                break;          //stops the execution and comes out of the loop
            }
            System.out.println(prices[i]);
            System.out.println(i);   
        }
    }// op- 99 199 299
}


