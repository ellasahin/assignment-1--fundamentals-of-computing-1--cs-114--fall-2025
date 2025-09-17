import java.util.Scanner;

public class Assignment1Program1 {
  public static void main(String[] args){
        System.out.println("EEEEEEEE      SSSSSS");
        System.out.println("EEEEEEEE     SS     SS");
        System.out.println("EEE         SS       SS");
        System.out.println("EEE        SSS");
        System.out.println("EEEEEE       SSS");
        System.out.println("EEEEEE          SSS");
        System.out.println("EEE              SSS");
        System.out.println("EEE        SS       SS");
        System.out.println("EEEEEEEE    SS      SS");
        System.out.println("EEEEEEEE      SSSSSS");
//                   EEEEEEEE      SSSS
// |  ____|/ ____|   EEEEEEEE     SS  SS
 //| |__  | (___     EEE         SS    SS
 //                  EEE        SSS
 //|  __|  \___ \    EEEEEE     SSSSSS
// | |____ ____) |   EEEEEE        SSSSS
 //|______|_____/    EEE             SSS
 //                  EEE          SS   SS
 //                  EEEEEEEE     SS    SS
 //                  EEEEEEEE      SSSSSS

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
