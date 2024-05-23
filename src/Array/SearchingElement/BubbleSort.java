package Array.SearchingElement;
public class BubbleSort {
//
//    public static void main(String[] args) {
//
//        int[] a={10,9,8,7,6,5,4};
//        int temp=0;
//
//        System.out.println("Befor Sorthng");
//        for (int num:a){
//            System.out.print(num+" ");
//        }
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length-i-1; j++) {
//                if (a[j]>a[j+1]){
//                    temp=a[j];
//                    a[j]=a[j+1];
//                    a[j+1]=temp;
//                }
//
//            }
//        }
//        System.out.println();
//        System.out.println("After sorting");
//        for (int num:a){
//            System.out.print(num+" ");
//        }
//    }


    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        int temp;

        System.out.println("Befor Sorting");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
        System.out.println();
        System.out.println("After sorting");
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}