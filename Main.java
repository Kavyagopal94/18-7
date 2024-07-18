public class Main {
    public static void main(String[] args) {
    	 BinarySearchTree<Integer> tree = new BinarySearchTree<>();

         tree.insert(50);
         tree.insert(30);
         tree.insert(20);
         tree.insert(40);
         tree.insert(70);
         tree.insert(60);
         tree.insert(80);

         System.out.println("Inorder traversal:");
         tree.inorder();
         
         System.out.println("\nPreorder traversal:");
         tree.preorder();
         
         System.out.println("\nPostorder traversal:");
         tree.postorder();
    }
}
