class Four{
    public static void main(String[]args){
        int adhar_no1=36;
        long adhar_no=363663381721l;
        long phone=9986334527l;
        System.out.println(adhar_no1);  
        System.out.println(adhar_no);
        System.out.println(phone);

        byte b=120;  //-200;  //or 128          //unable to convert from int to byte because of range being -128 to 127
        System.out.println(b);

        int I=23;  //232323232323232l;   //too large data for int
        System.out.println(I);

        float f=4.5f;
        System.out.println(f);

        double sal=45000.12345678999;
        System.out.println(sal);

         char flag='H';    //char needs single quotation
        String S="Hello";     //string needs double quotation
        System.out.println(flag);
        System.out.println(S);
    }
}