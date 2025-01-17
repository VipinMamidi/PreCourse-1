
// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Didn't Check
// Any problem you faced while coding this : The file wouldn't be running with "Exercise_2.java", So Created another file with the name "StackAsLinkedList.java". It is also being checked in here.
//Please do find and grade "StackAsLinkedList.java"
public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            // Constructor here
            this.data = data;// Initializing the
        }
    }

    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int data) {
        // Write code to push data to the stack.
        StackNode anotherNode = new StackNode(data);

        if (root == null) {
            root = anotherNode;
        } else {
            StackNode temp = root;
            root = anotherNode;
            anotherNode.next = temp;
        }
        System.out.println(data + " pushed to stack");
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
        int popValue = Integer.MIN_VALUE;
        if (root == null) {
            System.out.println("Stack is Empty");
        } else {
            popValue = root.data;
            root = root.next;
        }
        return popValue;
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (root == null) {
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        } else {
            return root.data;
        }
    }

    // Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
