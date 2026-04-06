
class Solution {
    public ListNode removeElements(ListNode head, int val) {
         ListNode dummynode=new ListNode(0);
         ListNode temp=dummynode;
        
        while(head!=null  ){   
            if(head.val!=val){
                temp.next=head;
                temp=temp.next;
            }
            
                head=head.next;

        }
        temp.next=null;
        return dummynode.next;

        
    }
}