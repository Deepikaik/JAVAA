public class SA extends Account{
    private double min_Bal;
    private int acc_Id;
    private double acc_Bal;
    public SA(int id,String name,double bal,String email){
        super(name,email);
        this.acc_Id =id;
        this.acc_Bal = bal;
    }
    //generate setter and getting
    public void setMin_Bal(double min_Bal) {             //method +class making it encapsulated entity
        this.min_Bal = min_Bal;
    }
    public double getMin_Bal() {
        return min_Bal;
    }

    @Override
    public double cal_Bal(){
        double bal = this.acc_Bal - this.getMin_Bal();
        return bal;
    }
    

}