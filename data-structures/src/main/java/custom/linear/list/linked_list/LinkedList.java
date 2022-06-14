package custom.linear.list.linked_list;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class LinkedList<T> {

    Node<T> head = null;

    static class Node<T> {
        private T data;
        private Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

    public void push(T data) {
        Node<T> node = new Node<>(data);

        if (!this.isEmpty()) node.next = head;
        this.head = node;
    }

    public void insertAfter(T data, Node<T> prevNode) {
        if (isNull(prevNode)) throw new IllegalArgumentException("Ops.. the is no such node as null in Linked List");
        Node<T> node = new Node<>(data);
        node.next = prevNode.next;
        prevNode.next = node;
    }

    public void insertAtTheEnd(T data) {
        Node<T> node = new Node<>(data);
        if (this.isEmpty()) {
            this.head = node;
        } else {
            Node<T> tmpNode = head;
            while (nonNull(tmpNode.next)) {
                tmpNode = tmpNode.next;
            }
            tmpNode.next = node;
        }
    }

    public void deleteNode(T toBeDeleted) {
        if (isNull(toBeDeleted)) throw new IllegalArgumentException("Cannot delete null element!");
        if (isEmpty()) throw new IllegalArgumentException("Linked List is empty!");
        if (this.head.data.equals(toBeDeleted)) {
            this.head = null;
        } else {
            Node tmp = head;
            Node prev = null;
            while (nonNull(tmp.next)) {
                prev = tmp;
                tmp = tmp.next;
                if (tmp.data.equals(toBeDeleted)) {
                    prev.next = tmp.next;
                    return;
                }
            }
            System.out.printf("There is no such element %s%n", toBeDeleted);
        }
    }

    public boolean isEmpty() {
        return isNull(head);
    }
}
