public class Main {
    public static void main(String[] args) {
        BinaryTree myBinaryTree = new BinaryTree();

        myBinaryTree.addNode(new Node(5));
        myBinaryTree.addNode(new Node(3));
        myBinaryTree.addNode(new Node(8));
        myBinaryTree.addNode(new Node(6));
        myBinaryTree.addNode(new Node(9));
        myBinaryTree.addNode(new Node(2));
        myBinaryTree.addNode(new Node(7));

        myBinaryTree.printInOrder(myBinaryTree.startNode);
    }


}