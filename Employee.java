public class Employee {
    String name;
    int emp_id;
    double salary=0.0d;
    Employee(String name,int emp_id)
    {
        this.name=name;
        this.emp_id=emp_id;
    }
    Employee(String name,int emp_id,double salary)
    {
        this.name=name;
        this.emp_id=emp_id;
        this.salary=salary;
    }
    public void display_emp_details()
    {
        System.out.println("Employee Id:"+emp_id);
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Salary:"+salary);
    }
    public static void main(String[] args) {
        Employee e1=new Employee("Hariharan", 1,250000);
        Employee e2=new Employee("Eliyas", 2);
            e1.display_emp_details();
            e2.display_emp_details();
    }
}
