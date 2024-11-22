import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        Scanner scanner = new Scanner(System.in);

        // Getting array elements from the user
        System.out.println("Enter 10 integer numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the Element to Remove: ");
        int elementToRemove = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == elementToRemove) {
                for (int j = i; j < (numbers.length - 1); j++)
                    numbers[j] = numbers[j + 1];
                System.out.println("\nRemoved the element successfully!");
                break;
            }
        }

        System.out.println("\nThe new array is:");
        for (int i = 0; i < (numbers.length - 1); i++)
            System.out.print(numbers[i] + " ");
    }
}
