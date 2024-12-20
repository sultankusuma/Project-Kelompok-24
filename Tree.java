public class Tree {
    private Node root;

    public Tree(){
        this.root=new Node();
    }
    public void insert(String word){
        Node current=root;
        for (char c: word.toLowerCase().toCharArray()){
            Node child = findChild(current, c);
            if (child==null){
                child=new Node();
                child.setNodeName(c);
                addChild(current, child);
            }
            current=child;
        }
        current.markEndOfWord();
    }
    public boolean search(String prefix){
        Node current=root;
        for (char c:prefix.toLowerCase().toCharArray()){
            current =findChild(current,c);
            if(current==null){
                return false;
            }
        }
        return true;
    }
    private Node findChild(Node current, char c){
        Node child = current.getFirstChild();
        while (child!=null){
            if(child.getNodeName()==c){
                return child;
            }
            child=child.getNextSibling();
        }
        return null;
    }
}
