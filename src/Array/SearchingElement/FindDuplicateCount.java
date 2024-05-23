package Array.SearchingElement;
import java.util.Scanner;
public class FindDuplicateCount {

    public static void main(String[] args) {
        int[] a ={10,10,30,40,10};
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to search");
        int num=sc.nextInt();

        for (int x:a){
            if (x==num){
                count++;
            }
        }
        System.out.println(num+" is present in "+ count+" times");
    }
}