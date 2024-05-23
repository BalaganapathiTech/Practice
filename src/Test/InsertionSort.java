package Test;

public class InsertionSort {
    private static int[] arr;

    public static void main(String[] args) {

        int arr[]={1,4,2,3,6,5};
        System.out.println("Befor sorthing");
        printArrray(arr);

        InsertionSort(arr);
        System.out.println("After sorthing");
        printArrray(arr);
    }
    public static void InsertionSort(int[] arr){

        int n=arr.length;
        for(int i=1;i<n;++i){
            int key= arr[i];
            int j=i-1;

            while (j>0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    public static void printArrray(int[] arr){
        InsertionSort.arr = arr;
        for(int value : arr){
            System.out.print(value +" ");
        }
    }
}