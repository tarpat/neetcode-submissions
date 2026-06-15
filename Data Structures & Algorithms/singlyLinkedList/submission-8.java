class LinkedList {
    private Node first;
    private Node last;
    private int size;

    public LinkedList() {

    }

    public int get(int index) {
        if (index >= size) {
            return -1;
        }
        Node curr = first;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.data;
    }

    public void insertHead(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = first;
        first = newNode;
        if (size == 0) {
            last = newNode;
        }
        size++;
    }

    public void insertTail(int val) {
        Node newNode = new Node();
        newNode.data = val;
        if (size != 0) {
            last.next = newNode;
        } else {
            first = newNode;
        }
        last = newNode;
        size++;
    }

    public boolean remove(int index) {
        if (index >= size) {
            return false;
        }
        if (index == 0) {
            return removeHead();
        } else if (index == size - 1 && size == 1) {
            return removeTail();
        }
        Node curr = first;
        Node trail = first;
        for (int i = 0; i < index; i++) {
            trail = curr;
            curr = curr.next;
        }
        trail.next = curr.next;
        if (index == size - 1) {
            last = trail;
        }
        size--;
        return true;
    }

    private boolean removeHead() {
        first = first.next;
        if (size == 1) {
            last = null;
        }
        size--;
        return true;
    }

    private boolean removeTail() {
        first = null;
        last = null;
        size--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        Node curr = first;
        ArrayList<Integer> arr = new ArrayList<>();
        while (curr != null) {
            arr.add(curr.data);
            curr = curr.next;
        }
        return arr;
    }

    private class Node {
        private int data;
        private Node next;
    }

}
