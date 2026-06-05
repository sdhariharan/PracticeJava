public class StudentAttendace {
    String std_name;
    int std_reg;
    float att_perc=0.0f;
    StudentAttendace(String std_name,int std_reg)
    {
        this.std_name=std_name;
        this.std_reg=std_reg;
    }
    StudentAttendace(String std_name,int std_reg,float att_perc)
    {
        this.std_name=std_name;
        this.std_reg=std_reg;
        this.att_perc=att_perc;
    }
    public void display()
    {
        System.out.println("Student Name:"+std_name);
        System.out.println("Student Id:"+std_reg);
        System.out.println("Student Attendance:"+att_perc);
    }
    public static void main(String[] args) {
        StudentAttendace s1=new StudentAttendace("Harikishan", 65);
        s1.display();
        StudentAttendace s2=new StudentAttendace("Hariharan", 64, 100);
        s2.display();
    }
}
