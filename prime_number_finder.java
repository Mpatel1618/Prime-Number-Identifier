import java.util.Scanner;
import java.util.Random;

public class prime_number_finder {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 2;

        Boolean test = true;

        System.out.println("Is this number prime or composite? (" + number + ")");

        Boolean correct = true;

        String answer = entry.next();

        if(!"prime".equalsIgnoreCase(answer) && !"composite".equalsIgnoreCase(answer)){
            do {
                correct=false;
                System.out.println("Wrong input. Please use the given inputs.");
                answer = entry.next();
                if(answer.equalsIgnoreCase("prime") || answer.equalsIgnoreCase("composite")) {
                    correct=true;
                }
            }while(correct==false);
        }

        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                test = false;
                break;
            }
        }

        if (test == false && answer.equalsIgnoreCase("composite")) {
            System.out.println("You are correct. Congratulations :)");
        } else if (test == true && answer.equalsIgnoreCase("prime")) {
            System.out.println("You are correct. Congratulations :)");
        } else if (test == false && answer.equalsIgnoreCase("prime")) {
            System.out.println("You are incorrect. Better luck next time :(");
        } else if (test == true && answer.equalsIgnoreCase("composite")) {
            System.out.println("You are incorrect. Better luck next time :(");
        }else {
            System.out.println("Wrong input.");
        }
    }
}