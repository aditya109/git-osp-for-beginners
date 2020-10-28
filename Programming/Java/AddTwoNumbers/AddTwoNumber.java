import java.util.Scanner;

public class AddTwoNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length for 1st list:");
        int length = sc.nextInt();
        System.out.println("Enter numbers for 1st list:");
        Node first = init(length, sc);

        System.out.println("Enter length for 2nd list:");
        length = sc.nextInt();
        System.out.println("Enter numbers for 2nd list:");
        Node second = init(length, sc);

        sc.close();

        Solution solution = new Solution();
        Node res = addLists(first, second);
        printList(res);
    }

    static Node init(int length, Scanner sc) {
        int val;
        Node node = null;
        Node tail = node;
        for (int i = 0; i < length; i++) {
            val = sc.nextInt();
            if (node == null) {
                node = new Node(val);
                tail = node;
            } else {
                tail.next = new Node(val);
                tail = tail.next;
            }
        }

        return node;
    }

    static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static Node addLists(Node first, Node second) {
        first = reverse(first);
        second = reverse(second);
        int carry = 0;
        Node prev = null;
        while (first != null || second != null) {
            int sum = carry + (first != null ? first.data : 0) + (second != null ? second.data : 0);
            carry = sum / 10;
            sum = sum % 10;
            first = first != null ? first.next : first;
            second = second != null ? second.next : second;
            Node node = new Node(sum);
            node.next = prev;
            prev = node;

        }
        if (carry > 0) {
            Node node = new Node(carry);
            node.next = prev;
            prev = node;
        }

        return reverse(prev);
    }

    static Node reverse(Node node) {
        Node prev = null;
        Node next = null;
        Node current = node;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}