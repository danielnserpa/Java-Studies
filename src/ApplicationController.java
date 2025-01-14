import java.util.ArrayList;

public class ApplicationController {

    @Override
    public String toString() {
        return "[" + role + ", " + companyName + ", " + date + ", " + status + "]";
    }

    public static void addToList (ArrayList<ApplicationController> applications, String role, String companyName, String date, String status) {
        applications.add(new ApplicationController(role, companyName, date, status));
    }

    public static void removeFromList (ArrayList<ApplicationController> applications, String role, String companyName, String date, String status) {
        applications.remove(new ApplicationController(role, companyName, date, status));
    }

    String role;
    String companyName;
    String date;
    String status;

    public ApplicationController(String role, String companyName, String date, String status) {
        this.role = role;
        this.companyName = companyName;
        this.date = date;
        this.status = status
    }

    public static void main(String[] args) {

        ArrayList<ApplicationController> applications = new ArrayList<>();

        ApplicationController.addToList(applications, "Dev", "IBM", "10/01/25", "Applied");
        ApplicationController.addToList(applications, "Customer Service","Accenture", "10/01/25", "Applied");
        ApplicationController.removeFromList(applications, "Dev", "IBM", "10/01/25", "Applied");


        System.out.println(applications);

    }
}
