import java.util.Scanner;

public class ArraySeparator {
    public static void main(String[] args) {
        int[] numbers = new int[10];
       


        Scanner scanner = new Scanner(System.in);

        // Getting array elements from the user
        System.out.println("Enter 10 integer numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }


       
      //Logic for even array elements
      System.out.println("Even numbers are:");
      for(int i=0; i<numbers.length; i++){
         if(numbers[i]%2==0){
         
            //separates even numbers
            System.out.println(numbers[i]+" ");
         }
      }
      
      //Logic for odd array elements
      System.out.println("\nOdd numbers are:");
      for(int i=0; i<numbers.length; i++){
         if(numbers[i] %2==1){
         
            //separates odd numbers
            System.out.println(numbers[i]+" ");
         }
      }
   }
}
