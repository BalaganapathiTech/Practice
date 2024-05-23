package interview;

public class palindrom {

    public static void main(String[] args) {

        int n=122;
        int r,temp,sum=0;

        temp=n;

        while (n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if (sum==temp)
            System.out.println(temp+" is palindrom");
        else
            System.out.println(temp+" is not polindrom");
        }
    }