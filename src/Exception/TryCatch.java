package Exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        try {
            System.out.println("Enter the number");
            int number =sc.nextInt();
            System.out.println("You entered: "+number);
        }catch (InputMismatchException e){
            System.out.println("Invalid input! Please Enter a number");
        }catch (Exception e){
            System.out.println("Unex");
        }
    }
}