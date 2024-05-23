package Test;
public class currentThread {
    public static void main(String[] args) {

        Thread t= Thread.currentThread();
        System.out.println("Current Thread is : "+t);

        t.setName("Balaji");

        System.out.println("After changing name"+t);
try {
    for (int n=0;n<5;n++){
        System.out.print(n);
        Thread.sleep(1000);
    }
        }catch (InterruptedException e){
    System.out.println("Main thread intereptud");
        }
    }
}