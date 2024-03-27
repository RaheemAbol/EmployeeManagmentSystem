package weekfour.daytwo.employeemanagment;

public class Intern extends Employee implements IWork{

    private String timeZone;

    static String HR_CONTACT = "Lisa Smith";

    private Department department;




    public Intern(int id, String name, double salary, String timeZone, Department department) {
        super(id, name, salary);
        this.timeZone = timeZone;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Intern");
    }

    @Override
    public String startTime() {
        return "9:00 am " + timeZone;
    }

    @Override
    public String endTime() {
        return "5:00 pm " + timeZone;
    }

    @Override
    public String contactHr() {
        return "Email sent to " + Intern.HR_CONTACT;
    }
}
