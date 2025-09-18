import java.util.Random;
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

//2

 Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a 5-character string: ");
        String input = scanner.nextLine();


        if (input.length() == 5) {

            String middle = input.substring(1, 4);


            String reversed = new StringBuilder(middle).reverse().toString();


            System.out.println("Saved string: " + reversed);
        } else {
            System.out.println("Error: Enter only 5 characters.");
        }



//3



        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();


        double celsius = (5.0 / 9.0) * (fahrenheit - 32);


        System.out.println("Temperature in Celsius: " + celsius);



//4

Random rand = new Random();

        int min = 32;
        int max = 16384;


        int randomNumber = rand.nextInt(max - min + 1) + min;


        System.out.println("Random number: " + randomNumber);

        scanner.close();

//5

      System.out.print("Your new string is:"  + celsius + randomNumber);}


}
