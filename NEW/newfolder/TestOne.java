package newfolder;

class TestOne {
    public static void main(String[] args) {
        try{
            int a=Integer.parseInt("twenty");
            System.out.println(a*10);
        }
        catch(NumberFormatException nfe){
            //nfe.printStackTrace();
            //System.out.println(nfe.getMessage());
            //System.out.println(nfe.getclass());
            System.out.println(nfe.getMessage());
        }
    }
}
