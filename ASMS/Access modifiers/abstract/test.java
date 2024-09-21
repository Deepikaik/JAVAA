abstract class Account{         //object creation is not possible for abstract class
    public void open_acc(){
        System.out.println("account opened");
    }

    public abstract int get_bal();
    public abstract void close_acc();
}

class SavingsAcc extends Account{
    public int get_bal(){
        return 100;
    }
    
    public static void main(String[]args){
        //new Account();   object can't be created as account is abstract class
        SavingsAcc obj=new SavingsAcc();

        obj.open_acc();
        int bal=obj.get_bal();
        System.out.println(bal);

    }
}