package Test;

public class solution {
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}
    public ListNode addTwoNum(ListNode L1,ListNode L2){
    ListNode dummyList=new ListNode(0);
    ListNode current=dummyList;
    int carry=0;

    while (L1!=null || L2!=null || carry!=0){
        int sum=carry;
        if (L1 !=null){
            sum +=L1.val;
            L1=L1.next;
        }
        if (L2!=null){
            sum +=L2.val;
            L2=L2.next;
        }
        carry =sum%10;
        current.next=new ListNode(sum%10);
        current=current.next;
    }
    return dummyList.next;
    }
}