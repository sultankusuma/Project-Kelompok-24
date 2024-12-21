public class Stack {
    private LinkedListNode top;

    public Stack() {
        top = null;
    }

    public void push(String word) {
        LinkedListNode newNode = new LinkedListNode(word);
        newNode.setNext(top);
        top = newNode;
    }

    public void print() {
        LinkedListNode current = top;
        while (current != null) {
            System.out.println(current.getWord());
            current = current.getNext();
        }
    }

    public void bubbleSortAscending() {
        LinkedListNode current = top;
        LinkedListNode index;
        String temp;

        if (top == null) {
            return;
        }

        while (current != null) {
            index = current.getNext();
            while (index != null) {
                if (current.getWord().compareTo(index.getWord()) > 0) {
                    temp = current.getWord();
                    current.setWord(index.getWord());
                    index.setWord(temp);
                }
                index = index.getNext();
            }
            current = current.getNext();
        }
    }

    public void bubbleSortDescending() {
        LinkedListNode current = top;
        LinkedListNode index;
        String temp;

        if (top == null) {
            return;
        }

        while (current != null) {
            index = current.getNext();
            while (index != null) {
                if (current.getWord().compareTo(index.getWord()) < 0) {
                    temp = current.getWord();
                    current.setWord(index.getWord());
                    index.setWord(temp);
                }
                index = index.getNext();
            }
            current = current.getNext();
        }
    }
}