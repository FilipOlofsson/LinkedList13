public class LinkList {

    Node first;

    public LinkList() {
        first = null;
    }

    public void addLast(String toAdd) {
        if(first == null) {
            addFirst(toAdd);
        } else {
            Node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(toAdd);
        }
    }

    public void addFirst(String toAdd) {
        Node temp = new Node(toAdd);
        temp.next = first;
        first = temp;
    }

    public void removeLast() {
        Node temp = first;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void removeFirst() {
        first = first.next;
    }

    public int size() {
        int i = 1;
        Node temp = first;
        while(temp.next != null) {
            i++;
            temp = temp.next;
        }
        return i;
    }

    public boolean isEmpty() {
        if(first == null)
            return true;
        return false;
    }

    public String toString() {
        if(isEmpty()) {
            return null;
        }
        Node temp = first;
        String output = first.toAdd;
        while(temp.next != null) {
            output = output + " --> " + temp.next.toAdd;
            temp = temp.next;
        }

        return output;
    }

    public void print() {
        Node temp = first;
        System.out.println(temp.toAdd);
        while(temp.next != null) {
            System.out.println(temp.next.toAdd);
            temp = temp.next;
        }
        System.out.println("All out.");
    }


    class Node {

        Node next;

        String toAdd;

        public Node(String toAdd) {
            this.toAdd = toAdd;
            next = null;
        }

    }

}