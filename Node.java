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
}
