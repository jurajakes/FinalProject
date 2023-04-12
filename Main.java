import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InsuranceClaimRegistry registry = new InsuranceClaimRegistry();

        while (true) {
            System.out.println("Welcome to the Insurance Registry!");
            System.out.println("Please choose an option:");
            System.out.println("1. Register a new insured");
            System.out.println("2. List all insureds");
            System.out.println("3. Search for an insured by name");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter the insured's first name:");
                    String firstName = scanner.nextLine();

                    System.out.println("Enter the insured's last name:");
                    String lastName = scanner.nextLine();

                    System.out.println("Enter the insured's age:");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character

                    System.out.println("Enter the insured's phone number:");
                    String phoneNumber = scanner.nextLine();

                    Insured insured = new Insured(firstName, lastName, age, phoneNumber);
                    registry.addInsured(insured);
                    System.out.println("Insured added successfully!");
                    break;
                case 2:
                    System.out.println(registry.getAllInsureds());
                    break;
                case 3:
                    System.out.println("Enter the name of the insured to search for:");
                    String nameToSearch = scanner.nextLine();
                    System.out.println(registry.searchByName(nameToSearch));
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
