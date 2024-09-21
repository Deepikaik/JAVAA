class test{
    public static void main(String[]args){
        int[] eids={101,102,103,104,105,106};
        for(int eid : eids){
        System.out.println(eid);
        }
    }
}


class test1{
    public static void main(String[]args){
        int[] eids={101,102,103,104,105,106};

        for(int i=0;i<=eids.length-1;i++){
            System.out.println(i);
             System.out.println(eids[i]);
        }
    }
}

class test2{
    public static void main(String[]args){
        int[] eids={101,102,103,104,105,106,107,108,109};

        int i=0;
        while(i<=eids.length-1){
            System.out.println(i);
            System.out.println(eids[i]);
        i++;
        }
    }
}

class test3{
    public static void main(String[]args){
        int[] eids={101,102,103,104,105,106};
        int i=0;
        do{
            System.out.println(i);
            System.out.println(eids[i]);
            i++;
        }
        while(i<=eids.length-1);
    }
}