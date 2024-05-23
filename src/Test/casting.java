package Test;

public class casting {
    public static void main(String[] args) {

        int Intnum=10;    //widening convertion   --it's converting big datatype to integer
        float FloatNum= Intnum;
        System.out.println(FloatNum);


        double doubleNuum=10.5; // Narrowing convertion  --it's converting integer to big datatype
        int IntValue= (int) doubleNuum;
        System.out.println(IntValue);

        try {
    Object[] objects=new String[5];
    objects[0]="Hello";
    objects[1]=123;
    objects[2]="is";
    objects[3]="Balaji";
    String str= (String) objects[1];

}catch (ClassCastException e){
    System.out.println("Cast Exception will caught with array");
    e.printStackTrace();
}

        try {
            Object[] objects = new String[5];
            objects[0] = "Hello";
            objects[1] = 123;

            // This will throw a ClassCastException at runtime
            String str = (String) objects[1];
        } catch (ClassCastException e) {
            System.out.println("\nExample 2: ClassCastException caught with Arrays!");
            e.printStackTrace();
        }

    }
}
