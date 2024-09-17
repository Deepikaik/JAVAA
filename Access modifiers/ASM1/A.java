package pack1;
public class A{                  //class is public so we can access anywhere
    public void m1(){ System.out.println("pack1 m1 public");}
           void m2(){System.out.println("pack1 m2 default");}
    protected void m3(){System.out.println("pack1 m3 protected");}
    private void m4(){System.out.println("pack1 m4 private");}
}