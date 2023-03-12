public class q2 {
    public int size() {
        if (tail == null) {
            return 0;
        }
        int count = 1;  // count the tail node
        Node<E> current = tail.getNext();
        while (current != tail) {
            count++;
            current = current.getNext();
        }
    return count;
    }

}
