
package binarytree;

public class BinaryTree {
 public static void main(String[] args) {
    new BinaryTree().run();
  }
//node class
  static class Node {
    Node left;

    Node right;

    int value;

    public Node(int value) {
      this.value = value;
    }
  }

  
  
  //run
  
  public void run() {
    // build the simple tree from chapter 11.
    Node root = new Node(5);
    //System.out.println("Binary Tree Example");
    //System.out.println("Building tree with root value " + root.value);
    insert(root, 1);
    insert(root, 8);
    insert(root, 6);
    insert(root, 3);
    insert(root, 9);
    System.out.println("Traversing tree in order");
   // printInOrder(root);
    
/*


     System.out.println("After mirror image");
     mirror_image(root);
     printInOrder(root);
     
*/

  }

  public void insert(Node node, int value) {
    if (value < node.value) {
      if (node.left != null) {
        insert(node.left, value);
      } else {
          /*
        System.out.println("  Inserted " + value + " to left of "
            + node.value);*/
        node.left = new Node(value);
      }
    } else if (value > node.value) {
      if (node.right != null) {
        insert(node.right, value);
      } else {
          /*
        System.out.println("  Inserted " + value + " to right of "
            + node.value);  */
        node.right = new Node(value);
      }
    }
  }

  public int search(Node node,int value){

     if(node.value==value)
       return node.value;
     if (node.value >value){
        return search(node.left, value);}
     else{
    return search(node.right, value);}
  }

  public void printInOrder(Node node) {
    if (node != null) {
      printInOrder(node.left);
      System.out.println(  node.value);
      printInOrder(node.right);
    }
  }

// function for generating the mirror image
 void mirror_image(Node node){

     if(node==null){

     }
     else{
      Node temp=node.left;
      node.left=node.right;
      node.right=temp;
      mirror_image(node.left);
      mirror_image(node.right);
     }

 }

}
