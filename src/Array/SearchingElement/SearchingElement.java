package Array.SearchingElement;

import java.util.Scanner;

public class SearchingElement {

    public static void main(String[] args) {

        int a[]={12,23,34,45,56,12,12};
        boolean status=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element you want to search");
        int searchinElement=sc.nextInt();

        for (int x:a){
            if (x==searchinElement){
                System.out.println(searchinElement+" is Element Found ");
                status=true;
                break;
            }
        }
        if (status==false) {
            System.out.println("Element Not found");
        }
    }
}