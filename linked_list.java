import java.util.Scanner;

class Node {
    Integer data;
    Node next;
}

public class linked_list {
    static Node insertFirst(Node h, int n) {
        if (h.data == null) {
            h.data = n;
            h.next = null;
            return h;
        } else {
            Node newnode = new Node();
            newnode.data = n;
            newnode.next = h;
            h = newnode;
            return h;
        }
    }

    static Node insertLast(Node h, int n) {
        Node t = h;
        if (h.data == null) {
            h.data = n;
            h.next = null;
            return h;
        } else {
            while (t.next != null) {
                t = t.next;
            }
            t.next = new Node();
            t.next.data = n;
            t.next.next = null;
            return h;
        }
    }

    static Node insertAfter(Node h, int b, int c) {
        Node t = h;
        while (t != null && !t.data.equals(b)) {
            t = t.next;
        }
        if (t != null) {
            Node newnode = new Node();
            newnode.data = c;
            newnode.next = t.next;
            t.next = newnode;
        }
        return h;
    }

    static Node deleteLast(Node h) {
        if (h == null || h.next == null) {
            return null;
        }
        Node t = h;
        while (t.next.next != null) {
            t = t.next;
        }
        t.next = null;
        return h;
    }

    static Node deleteFirst(Node h) {
        if (h.data == null) {
            System.out.println("Linked list is empty");
            return h;
        } else if (h.next == null) {
            h.data = null;
            return h;
        } else {
            h = h.next;
            return h;
        }
    }

    static Node deleteAfter(Node h, int b) {
        Node t = h;
        while (t != null && !t.data.equals(b)) {
            t = t.next;
        }
        if (t != null && t.next != null) {
            t.next = t.next.next;
        }
        return h;
    }

    static void display(Node h) {
        Node t = h;
        while (t.next != null) {
            System.out.println(t.data);
            t = t.next;
        }
        System.out.println(t.data);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Node head = new Node();
        int choice;
        do {
            System.out.print("1.Insert First\n2.Insert Last\n3.Insert After\n4.Delete First\n5.Delete Last\n6.Delete After\n7.Display\n8.Exit\n");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    int n = s.nextInt();
                    head = insertFirst(head, n);
                    break;
                case 2:
                    int a = s.nextInt();
                    head = insertLast(head, a);
                    break;
                case 3:
                    int b = s.nextInt();
                    int c = s.nextInt();
                    head = insertAfter(head, b, c);
                    break;
                case 4:
                    head = deleteFirst(head);
                    break;
                case 5:
                    head = deleteLast(head);
                    break;
                case 6:
                    int d = s.nextInt();
                    head = deleteAfter(head, d);
                    break;
                case 7:
                    display(head);
                    break;
                case 8:
                    System.out.println("Thanks for using Linked List");
                    break;
                default:
                    break;
            }
        } while (choice != 8);
        s.close();
    }
}
