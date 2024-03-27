package weekfour.daytwo.employeemanagment;

public class MainRunner {

    public static void main(String[] args) {
//        Employee emp1 = new Employee(1,"John Doe",65000.00);
////
//        System.out.println(emp1.getName());

        Developer dev1 = new Developer(2,"Jim Smith",70400.00,"Python");


        System.out.println(dev1.getProgrammingLanguage());

        System.out.println(dev1.getName());

        System.out.println(dev1.startTime());
        System.out.println(dev1.endTime());



        Manager manager1 = new Manager(3,"Jane Doe",85000.00,4);

        manager1.addTeamMember();

        manager1.addTeamMembers(5);

        System.out.println(manager1.getTeamSize());


        Intern intern1 = new Intern(4,"Tim Jones",45000.00,"est",Department.HR);

        System.out.println(intern1.startTime());

        System.out.println(intern1.endTime());


        System.out.println(intern1.contactHr());


        Intern intern2 = new Intern(4,"Sara Jones",45000.00,"est",Department.IT);

        Developer dev3 = new Developer(2,"Jake Smith",70400.00,"Python");


//        System.out.println(intern2.contactHr());
//
//        System.out.println(dev1.contactHr());
//        System.out.println(dev3.contactHr());

        System.out.println(intern2.getDepartment());
        System.out.println(intern1.getDepartment());
    }
}
