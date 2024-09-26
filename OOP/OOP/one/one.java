class Account{
    private int acc_Id;
    private String acc_Name;
    private double acc_Bal;
    
    public void setAcc_id(int id){       //setters and getters
        this.acc_Id=id;
    }

    public void getAcc_id(int id){
        this.acc_Id=id;
    }

    public void setAcc_name(String Name){
        this.acc_Name=Name;
    }
    
    public void getAcc_name(String Name){
        this.acc_Name=Name;
    }

    public void setAcc_name(double sal){
        this.acc_Bal=sal;
    }
    
    public void getAcc_name(double sal){
        this.acc_Bal=sal;
    }
    
    }

//setters and getters can help you access private methods into another file
//these are public methods
    
//IDE= generate setters and getters