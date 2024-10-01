class Employee{
    String name;
    Employee(String name){
        this.name=name;
    }
}

class Manager extends Employee{
    String dept;
    Manager(String name,String dept);
    super(name,dept);
    this.dept=dept;
}

class Test{
    public static void main(String[]args){
        Manager obj=new Manager();
        obj.name();
        obj.dept();
    }

}