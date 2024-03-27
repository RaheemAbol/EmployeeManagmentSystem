package weekfour.daytwo.employeemanagment;

public class Manager extends Employee{

    private int teamSize;

    public Manager(int id, String name, double salary, int teamSize) {
        super(id, name, salary);
        this.teamSize = teamSize;
    }

    public void addTeamMember(){
        teamSize++;
    }

    public void addTeamMembers(int x){
        teamSize += x;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Manager");
    }
}
