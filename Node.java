public class Node {
    private char nodeName;
    private boolean endOfWord;
    private Node nextSibling;
    private Node firstChild;

    public Node() {
        this.endOfWord = false;
        this.nextSibling = null;
        this.firstChild = null;
    }

    public char getNodeName() {
        return nodeName;
    }

    public void setNodeName(char nodeName) {
        this.nodeName = nodeName;
    }

    public boolean isEndOfWord() {
        return endOfWord;
    }

    public void markEndOfWord() {
        this.endOfWord = true;
    }

    public Node getNextSibling() {
        return nextSibling;
    }

    public void setNextSibling(Node nextSibling) {
        this.nextSibling = nextSibling;
    }

    public Node getFirstChild() {
        return firstChild;
    }

    public void setFirstChild(Node firstChild) {
        this.firstChild = firstChild;
    }
}