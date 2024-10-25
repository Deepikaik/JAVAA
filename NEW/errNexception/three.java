package errNexception;

class three {
    public static void main(String[]args){
        int[] eids={101,102,103,104,105};
        System.out.println(eids[0]);
        System.out.println(eids[1]);
        System.out.println(eids[10]); //ArrayIndexOutOfBoundsException
        System.out.println(eids[3]);
    }
}
