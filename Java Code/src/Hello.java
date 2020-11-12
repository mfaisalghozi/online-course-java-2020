import java.util.Scanner;

public class Hello {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello World one two three four");

        int myNumber = 5, guess;

        do {
            System.out.print("Guess The Number : ");
            guess = scan.nextInt();
        }while(guess != myNumber);
        System.out.println("Congratulations !! You Did It !!");




    }
}
