package weekfour.daytwo.employeemanagment;

public class Developer extends Employee implements IWork {

    private String programmingLanguage;


    static String HR_CONTACT = "Rick Jones";




    public Developer(int id, String name, double salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Developer");
    }

    @Override
    public String startTime() {
        return "9:00 am pst";
    }

    @Override
    public String endTime() {
        return "5:00 pm pst";
    }

    @Override
    public String contactHr() {
        return "Emailed hr " + HR_CONTACT;
    }
}
