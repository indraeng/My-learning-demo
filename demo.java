class Employee{
    int id;
    String name;
    int salary;
    public void printDetails()
    {
        System.out.println("The id of the employee is "+id);
        System.out.println("The name of the employeee is "+name);
    }
    public int getSalary(int salary){
        System.out.print("The salary is ");
        return salary;
    }
}

public class demo {
   public static void main(String[] args) {
    System.out.println("This is our custom class");

    Employee indrajit = new Employee();//Instantiating a new Employee object
    Employee sayantani = new Employee();

    //setting the attributes
    indrajit.id=43;
    indrajit.name="Indrajit Naskar";
    indrajit.salary=50000;

    sayantani.id=45;
    sayantani.name="Sayantani Jodder";
    sayantani.salary=100000;

    //printing the attributes
    indrajit.printDetails();
    int iSalary = indrajit.getSalary(indrajit.salary);
    System.out.println(iSalary);

    sayantani.printDetails();
    int sSalary = sayantani.getSalary(sayantani.salary);
    System.out.println(sSalary);

   }
}
