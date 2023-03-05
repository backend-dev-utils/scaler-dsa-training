package intermediate.assignment.lecture_39;

/**
 * Input Format : A = [ [0, 1, -1], [1, 2, -1], [2, 3, 1] ]
 * Output Format : 1 -> 3 -> 2 -> NULL
 * Refer Attached Document.
 */
public class DesignLinkedList {
    public static void main(String[] args) {
        int array[][] = {{0, 1, -1}, {1, 2, -1}, {2, 3, 1}};

    }

    private ListNode solve(int array[][]){
        ListNode temp = new ListNode(1); // Head is created
        int operationType = 0;
        int firstElement = 1, secondElement = 2;
        for (int index = 0; index < array.length; index++) {
            if (array[index][operationType] == 0){
                //
            }
        }
        return temp;
    }

    private ListNode add(int data){
        ListNode head = new ListNode(1);
        ListNode temp = head;

        return head;
    }

    class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
}
