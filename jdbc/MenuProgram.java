
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MenuProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Print out all the IP addresses associated with Netflix.com");
            System.out.println("2. Display the localhost address");
            System.out.println("3. Print the loopback address");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    printNetflixIPs();
                    break;
                case 2:
                    printLocalhost();
                    break;
                case 3:
                    printLoopback();
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
        sc.close();
    }

    // A method to print out all the IP addresses associated with Netflix.com
    public static void printNetflixIPs() {
        try {
            InetAddress[] addresses = InetAddress.getAllByName("Netflix.com");
            System.out.println("The IP addresses associated with Netflix.com are:");
            for (InetAddress address : addresses) {
                System.out.println(address.getHostAddress());
            }
        } catch (UnknownHostException e) {
            System.out.println("An error occurred while resolving Netflix.com");
        }
    }

    // A method to display the localhost address
    public static void printLocalhost() {
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("The localhost address is: " + localhost.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("An error occurred while getting the localhost address");
        }
    }

    // A method to print the loopback address
    public static void printLoopback() {
        InetAddress loopback = InetAddress.getLoopbackAddress();
        System.out.println("The loopback address is: " + loopback.getHostAddress());
    }
}
