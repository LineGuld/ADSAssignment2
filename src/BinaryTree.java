import java.util.ArrayList;

public class BinaryTree<E>
{
  private BinaryTreeNode<E> root;
  private int size;

  public BinaryTree(BinaryTreeNode<E> root)
  {
    this.root = root;
    this.size = 1;
  }

  public BinaryTree()
  {
    size = 0;
  }

  public BinaryTreeNode<E> getRoot()
  {
    return root;
  }

  public void setRoot(BinaryTreeNode<E> node)
  {
    if (root != null)
    {
      throw new IllegalArgumentException("Tree root is not EMPTY!!! AARRRGGGGH");
    } else {
      root = node;
    }
  }

  public boolean isEmpty()
  {
    return size() <= 0;
  }

  public int size()
  {
    return size;
  }

  public boolean contains(E element)
  {

    if (root == null) {
      System.out.println("Trylle trylle ... binær træet er tomt");
    } else {
      if (root.getElement() == element)
      {
        System.out.println("Is '" + root.getElement() + "' equal to '" + element + "'" + " true...");
        return true;
      }

      if (root.getLeftChild() != null)
      {
        BinaryTree leftSubtree = new BinaryTree(root.getLeftChild());
        System.out.println("Checking left sub tree");
        System.out.println("Length " + leftSubtree.size + " " + leftSubtree.getRoot().getElement() + " vs " + element);
        if (leftSubtree.contains(element)) {
          return true;
        }
        //return leftSubtree.contains(element);
      }

      if (root.getRightChild() != null)
      {
        BinaryTree rightSubtree = new BinaryTree(root.getRightChild());
        System.out.println("Checking right sub tree");
        System.out.println("Length " + rightSubtree.size + " " + rightSubtree.getRoot().getElement() + " vs " + element);
        if (rightSubtree.contains(element)) {
          return true;
        }
        //return rightSubtree.contains(element);
      }
    }

    return false;
  }

  public ArrayList<E> inOrder()
  {
    //TODO

    return null;
  }

  public ArrayList<E> preOrder()
  {
    //TODO

    return null;
  }

  public ArrayList<E> postOrder(){
    //TODO

    return null;
  }

  public ArrayList<E> levelOrder(){
    //TODO

    return null;
  }

  public int height()
  {
    //TODO

    return -1;
  }
}
