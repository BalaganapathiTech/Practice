package DSA.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(8);
        list.insertFirst(9);

        list.insertLast(12);

        list.insert(20,3);

        list.display();

//        list.deleteFirst();
//        list.display();

//        System.out.println(list.deleteLaste());
//        list.display();
//        System.out.println(list.delete(2));

        System.out.println("find"+list.find(2));
        list.display();
    }
}