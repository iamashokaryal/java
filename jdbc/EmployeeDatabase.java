/* write a java program where A database "testdb" contains a table "Employee" with fields id, name 
and address. Write a program that asks users to enter the information and save them in the database. 
The program should prompt the user to press y/n to either continue or exit the program after every 
successful entry. Also print out the total number of records added. */



import java.sql.*;
import java.util.Scanner;

public class EmployeeDatabase {

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Declare variables to store user input
        int id;
        String name;
        String address;
        String choice;

        // Create a connection object to connect to the database
        Connection conn = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish the connection to the database
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");

            // Create a statement object to execute SQL queries
            Statement stmt = conn.createStatement();

            // Create a table Employee if it does not exist
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Employee (id INT PRIMARY KEY, name VARCHAR(50), address VARCHAR(100))");

            // Loop until the user chooses to exit
            do {
                // Prompt the user to enter the employee id
                System.out.print("Enter the employee id: ");
                id = sc.nextInt();

                // Clear the input buffer
                sc.nextLine();

                // Prompt the user to enter the employee name
                System.out.print("Enter the employee name: ");
                name = sc.nextLine();

                // Prompt the user to enter the employee address
                System.out.print("Enter the employee address: ");
                address = sc.nextLine();

                // Insert the employee record into the table
                stmt.executeUpdate("INSERT INTO Employee VALUES (" + id + ", '" + name + "', '" + address + "')");

                // Print a success message
                System.out.println("Employee record added successfully.");

                // Prompt the user to continue or exit
                System.out.print("Do you want to add another record? (y/n): ");
                choice = sc.nextLine();

            } while (choice.equalsIgnoreCase("y"));

            // Close the scanner object
            sc.close();

            // Query the table to get the number of records
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM Employee");

            // Move the cursor to the first row of the result set
            rs.next();

            // Get the number of records from the result set
            int count = rs.getInt(1);

            // Print the number of records added
            System.out.println("Total number of records added: " + count);

            // Close the result set object
            rs.close();

            // Close the statement object
            stmt.close();

        } catch (ClassNotFoundException e) {
            // Handle the exception if the driver is not found
            e.printStackTrace();
        } catch (SQLException e) {
            // Handle the exception if there is any SQL error
            e.printStackTrace();
        } finally {
            try {
                // Close the connection object if it is not null
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                // Handle the exception if there is any error in closing the connection
                e.printStackTrace();
            }
        }
    }
}
