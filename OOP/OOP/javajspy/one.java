class Test{
	Test(){
		super();
		System.out.println("test class CM");
	}
	public static void main(String[]args){
		Test t1=new Test();
        new Test();
	}
}