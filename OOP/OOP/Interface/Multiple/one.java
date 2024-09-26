interface DAOI{                  //digital A Object impletation
    public abstract void login();
    public abstract void logout();
}

interface USI{                   //usi userservice interface
    public void forgotPassword();
}
                                           
class DAOImpl implements DAOI,USI{            
    public void login(){
        System.out.println("login successfully");
    }
    public void logout(){
        System.out.println("logout successfully");

    }
    public void forgotPassword(){
        System.out.println("changed pw successfully");

    }

    public static void main(String[]args){
        DAOImpl obj=new DAOImpl();
        obj.login();
        obj.logout();
        obj.forgotPassword();
    }
}