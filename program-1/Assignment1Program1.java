import java.util.Scanner;

public class Assignment1Program1 {
  public static void main(String[] args){
        System.out.println("EEEEE  SSSSS");
        System.out.println("E      S");
        System.out.println("EEEEE  SSSSS");
        System.out.println("E          S");
        System.out.println("EEEEE  SSSSS");

        System.out.println();
  }

public static void second(String[] args){

          Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 5-character string: ");
        String input = sc.nextLine();

        if (input.length() == 5) {

            String trimmed = input.substring(1, 4);

            String reversed = new StringBuilder(trimmed).reverse().toString();

            System.out.println("Result: " + reversed);
        } else {
            System.out.println("Please enter exactly 5 characters.");
        }
            System.out.println();
        sc.close();

    }
}
