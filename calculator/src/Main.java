import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("A BASIC CALCULATOR");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number_1 = sc.nextInt();
        System.out.println("Enter your number");
        int number_2 = sc.nextInt();
        System.out.println("choose operation to carry out :  * + - /");
        String operand = sc.next();
        switch (operand){
            case "*":
                System.out.println("Answer : "+number_1 * number_2);
                break;
            case "+" :
                System.out.println("Answer : "+number_1 + number_2);
                break;
            case "-" :
                int result_ = number_1 - number_2 ;
                System.out.println("Answer : "+result_);
                break ;
            case "/" :
                double result;
                result = number_1 / number_2 ;
                System.out.println("Answer : "+result);
                break;
            default:
                System.out.println("Error in operand entry");
        }



    }
}