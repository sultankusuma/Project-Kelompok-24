public class Queue {
    private LinkedListNode front;
    private LinkedListNode rear;

    public Queue() {
        front = rear = null;
    }

    public void enqueue(String word) {
        LinkedListNode newNode = new LinkedListNode(word);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    public String dequeue() {
        if (front == null) {
            return null;
        }
        String word = front.getWord();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        return word;
    }

    public void print() {
        LinkedListNode current = front;
        while (current != null) {
            System.out.println(current.getWord());
            current = current.getNext();
        }
    }
}