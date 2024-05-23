package DSA.LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertLast(int val){

        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;

        if (tail==null){
            insertFirst(val);
            return;
        }
    }
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if (index==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    public int delete(int index){
        if (index==0){
            return deleteFirst();
        }
        if (index==size-1)
        {
            return deleteLaste();
        }
        Node prev=get(index-1);
            int val=prev.next.values;
        prev.next=prev.next.next;
            return val;
    }

    public int deleteFirst(){
        int val=head.values;
        head=head.next;
        if (head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteLaste(){
        if (size<=1){
            deleteFirst();
        }
        Node seconLaste=get(size-2);
        int val=tail.values;
        tail=seconLaste;
        tail.next=null;
        return val;
    }



    public Node find(int value){
        Node node=head;
        while (node!=null){
            if (node.values==value){
                return node;
            }
            node=node.next;
        }

        return null;
    }

    public Node get(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }




    public void display(){

        Node temp=head;
        while (temp!=null){
            System.out.print(temp.values+"->");
            temp=temp.next;
        }
        System.out.println("Finish");
    }

    private class Node{
        private int values;
        private Node next;

        public Node(int values) {
            this.values = values;
        }

        public Node(int values, Node next) {
            this.values = values;
            this.next = next;
        }
    }

}