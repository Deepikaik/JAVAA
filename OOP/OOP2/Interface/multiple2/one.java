interface DAOI{
    public abstract void login();
    public abstract void logout();
}
interface USI extends DAOI{
    public abstract void forgotPw();
}
class USImpl implements USI{
    public void login(){
        System.out.println("login success");
    }
    public void logout(){
        System.out.println("logout success");
    }
    public void forgotPw(){
        System.out.println("password changed");
    }

    public static void main(String[]args){
        USImpl obj= new USImpl();
        obj.login();
        obj.logout();
        obj.forgotPw();
    }
}