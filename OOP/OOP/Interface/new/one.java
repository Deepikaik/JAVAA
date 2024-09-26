class Account{
    String acc_Name;
    String acc_email;
    Account(String Name,String Email){
        this.acc_Name= Name;
        this.acc_email=Email;
    }
}

class SA extends Account{
    int acc_id;
    double acc_bal;
    static double min_bal=500;
    SA(int id, String Name,double Bal, String Email){
        super(Name,Email);         //compiler won't place this key because it needs arguements
        this.acc_id=id;
        this.acc_bal=Bal;
        
    }
}

class Test{
    public static void main(String[]args){
        new SA(101,"Rahul",55000,"r@gmail");
    }
}