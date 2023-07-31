public class BinaryTree {
    Node startNode = null;

    public void addNode(Node newNode){
        if (startNode == null)
            startNode = newNode;
        else {
            Node traversesNode = startNode;
            while (true){
                if(newNode.getValue() < traversesNode.getValue()){
                    if(traversesNode.left == null){
                        traversesNode.left = newNode;
                        break;
                    } else
                        traversesNode = traversesNode.left;
                } else {
                    if(traversesNode.right == null){
                       traversesNode.right  = newNode;
                       break;
                    } else
                        traversesNode = traversesNode.right;
                }
            }
        }
    }

    public void printInOrder(Node traversesNode){
        if(traversesNode == null)
            return;

        printInOrder(traversesNode.left);
        System.out.println(traversesNode.getValue());
        printInOrder(traversesNode.right);
    }
}