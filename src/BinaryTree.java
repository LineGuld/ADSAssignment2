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
    //TODO
    if (root == null) {
      System.out.println("Trylle trylle ... binær træet er tomt");
    } else {
      if (root == element)
      {
        return true;
      }
      if(element.compareTo(root) < 0)
      {
        BinaryTree leftSubtree = new BinaryTree<>(root.getLeftChild());
        return leftSubtree.contains(element);
      }
      if(element.compareTo(root) > 0)
      {
        BinaryTree rightSubtree = new BinaryTree<>(root.getRightChild());
        return rightSubtree.contains(element);
      }
      //contains()
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
