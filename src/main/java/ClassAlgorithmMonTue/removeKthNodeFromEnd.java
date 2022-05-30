package ClassAlgorithmMonTue;

public class removeKthNodeFromEnd {

    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        // Write your code here.
    }

//        LinkedList slow = head;
//        LinkedList high = head;
//        while (k > 0) {
//            high = high.next;
//            k--;
//        }
//        if (high == null) {
//            head.value = head.next.value;
//            head.next = head.next.next;
//            return;
//        }
//        while (high.next != null) {
//            high = high.next;
//            slow = slow.next;
//        }
//        slow.next = slow.next.next;



    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
