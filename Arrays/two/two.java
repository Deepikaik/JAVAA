//create 1d array and print elements
class two{
    public static void main(String[]args){
        int[] numbers={1,2,3,4,5,6,7,8,9};
        int[][] two_dnum={{10,20,30},{40,50,60},{70,80,90}};
        int sum=0;
        for(int num: numbers){
            sum=sum+num;
        }
        System.out.println(sum);
    }
}

class Test{
     public static void main(String[]args){
        int[][] twoD={{2,4,6},{8,10,12}};
        int sum=0;
        for(int[] num:twoD){
            for(int x:num){
                sum=sum+x;
            }
        }
        System.out.println(sum);
     }
}
