class Account{
    int Acc_Id;
    String Acc_Name;
    double Acc_bal;
    static double min_bal;
    static String Branch_name;
        public static void main(String[]arg){
        Account a1=new Account();
        Account a2=new Account();
        Account a3=new Account();  
    
        System.out.println(a1.Acc_Id);
        System.out.println(a1.Acc_Name);
        System.out.println(a1.Acc_bal);
        System.out.println(a1.min_bal);
        System.out.println(a1.Branch_name);
    }
}