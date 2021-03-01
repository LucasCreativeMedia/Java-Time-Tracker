import java.io.FileWriter;
import java.util.Scanner;

/*Tim Lucas*/

public class trackMyTime {
    public static void main(String[] args) {
        // Header
        System.out.println("Track my Jobs and Hours.\n************************");

        // blank line to separate header
        System.out.println();

        String firstName;
        String lastName;
        String jobNumber;
        String jobHours;
        int quitProgram = 2;

        do {
            // Listens for user input
            Scanner input = new Scanner(System.in);

            // Asks user for info
            System.out.print("Enter First Name:");
            firstName = input.next();

            System.out.print("Enter Last Name:");
            lastName = input.next();

            System.out.print("Enter Job Number:");
            jobNumber = input.next();

            System.out.print("Enter your hours worked:");
            jobHours = input.next();

            System.out.println("1 to continue or 2 to quit");
            quitProgram = input.nextInt();

            //Writes to file    
            try {
                FileWriter fileToWriteTo = new FileWriter("jobList.txt", true);
                fileToWriteTo.write("Tim's Job List\n****************************************************\n");
                fileToWriteTo.write(firstName + " ");
                fileToWriteTo.write(lastName + " | ");
                fileToWriteTo.write("Job Number: " + jobNumber + " | ");
                fileToWriteTo.write("Job Hours: " + "[" + jobHours + "]" + "\n");
                fileToWriteTo.close();
                if (quitProgram == 1) {
                    System.out.println("Please Proceed--->");
                } else {
                    System.out.println("Thank you, Info Submitted!!");
                }
            } catch (Exception e) {
                System.out.println("**Indecipherable Error Message**");
                e.printStackTrace();
            }

        } while (quitProgram != 2);

    }
}