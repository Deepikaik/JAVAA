interface Account{
    public abstract int get_bal();
    public abstract void close_acc();
}


class SA implements Account{
    public int get_bal(){
        return 100;
    }

    public void close_acc(){
        System.out.println("acc closed");
    }

    public static void main(String[]args){
        SA obj=new SA();
        int bal=obj.get_bal();
        System.out.println(bal);
    }
}