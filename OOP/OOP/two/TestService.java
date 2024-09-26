public class TestService{
    public static void main(String[]args){
    PaymentService ps=new  PaymentService();
    ps.setStatus("yes");

    String acc_status=ps.getStatus();
    System.out.println(acc_status);
    }
}