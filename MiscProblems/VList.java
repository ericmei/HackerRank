// [0, 1, 2, 3, 4, 5] 6
// ->
// [6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17] 12
// ->
// [18, 19, ..., 41]

// [0, 1, 2, ..., 41]

// n O(n)

class VList<T> {

    class Node {
        private Node next;
        private T[] data;
        int currentIndex;

        Node(Node next, T[] data) {
            this.next = next;
            this.data = data;
            this.currentIndex = 0;
        }
    }

    private Node head;
    private Node tail;

    public VList(int capacity) {
        T[] data = (T[]) new Object[capacity];

        head = new Node(null, data);
        tail = head;
    }

    public T get(int index) {

        Node currentNode = head;
        int relativeIndex = index;

        while (relativeIndex >= currentNode.data.length) {
            relativeIndex -= currentNode.data.length;
            currentNode = currentNode.next;
        }

        return currentNode.data[relativeIndex];
    }

    public void add(T element) {

        //resizing
        if (tail.currentIndex == tail.data.length) {
            T[] data = (T[]) new Object[tail.data.length * 2];

            Node tailExtension = new Node(null, data);
            tail.next = tailExtension;
            tail = tailExtension;
        }

        tail.data[tail.currentIndex] = element;
        tail.currentIndex += 1;
    }

    public static void main(String[] args) {
        VList list = new VList(1);
        list.add(1);
        list.add(2);
        list.add(5);

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
    }

}
