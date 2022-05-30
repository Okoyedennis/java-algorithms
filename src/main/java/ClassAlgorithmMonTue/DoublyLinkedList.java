package ClassAlgorithmMonTue;

//Write a DoublyLinkedList class that has a head and a tail, both of which point to either a linked list Node or None / null.
//
//        The class should support:
//
//        Setting the head and tail of the linked list.
//        Inserting nodes before and after other nodes as well as at given positions (the position of the head node is 1).
//        Removing given nodes and removing nodes with given values.
//        Searching for nodes with given values.
//        Note that the setHead, setTail, insertBefore, insertAfter, insertAtPosition, and remove methods all take in actual Nodes as input parameters not integers (except for insertAtPosition, which also takes in an integer representing the position); this means that you don't need to create any new Nodes in these methods.
//
//        The input nodes can be either stand-alone nodes or nodes that are already in the linked list. If they're nodes that are already in the linked list, the methods will effectively be moving the nodes within the linked list.
//
//        You won't be told if the input nodes are already in the linked list, so your code will have to defensively handle this scenario.
//
//        Each Node has an integer value as well as a prev node and a next node, both of which can point to either another node or None / null.
//
//        Sample Usage

 public class DoublyLinkedList {
        public Node head;
        public Node tail;

        public void setHead(Node node) {
            // Write your code here.
        }

        public void setTail(Node node) {
            // Write your code here.
        }

        public void insertBefore(Node node, Node nodeToInsert) {
            // Write your code here.
        }

        public void insertAfter(Node node, Node nodeToInsert) {
            // Write your code here.
        }

        public void insertAtPosition(int position, Node nodeToInsert) {
            // Write your code here.
        }

        public void removeNodesWithValue(int value) {
            // Write your code here.
        }

        public void remove(Node node) {
            // Write your code here.
        }

        public boolean containsNodeWithValue(int value) {
            // Write your code here.
            return false;
        }
    }

    // Do not edit the class below.
    class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

