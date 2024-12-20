public class LinkedListNode {
    private String word;
    private LinkedListNode next;

    public LinkedListNode(String word) {
        this.word = word;
        this.next = null;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
}