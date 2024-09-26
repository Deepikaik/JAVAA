public class Account{
    int acc_Id;
    String acc_Name;
    double acc_Bal=0;
    double min_bal=500.00;

    public Account(int id,String name, double amount){    //constructor
        this.acc_Id=id;
        this.acc_Name=name;
        this.acc_Bal=amount;
    }

    public void open_Account(){}
    public boolean deposit_Amount(double amount){
       this.acc_Bal=this.acc_Bal+double amount;
        return true;
    }
    public double get_Bal(){
        return 5000.00;
    }
    public static void main(String[] args) {
        Account a1= new Account(101,"Rahul",5000.50);
        a1.deposit_Amount(150.00);
        a1.deposit_Amount(50.00);
        System.out.println("deposit_Amount");
    }
}