import java.util.ArrayList;

public class BinaryTree<E>
{
  private BinaryTreeNode<E> root;
  private int size;
  private ArrayList<E> orderList;

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
      return false;
    } else {
      if (root.getElement() == element)
      {
        return true;
      }

      if (root.getLeftChild() != null)
      {
        BinaryTree leftSubtree = new BinaryTree(root.getLeftChild());

        if (leftSubtree.contains(element)) {
          return true;
        }
      }

      if (root.getRightChild() != null)
      {
        BinaryTree rightSubtree = new BinaryTree(root.getRightChild());

        if (rightSubtree.contains(element)) {
          return true;
        }
      }
    }

    return false;
  }

  public ArrayList<E> inOrder()
  {
    orderList = new ArrayList<>();
    inOrder(root);
    return orderList.isEmpty()? null : orderList;
  }

  private void inOrder(BinaryTreeNode node)
  {
    if (node == null) return;

    inOrder(node.getLeftChild());
    orderList.add((E) node.getElement());
    inOrder(node.getRightChild());
  }

  public ArrayList<E> preOrder()
  {
    orderList = new ArrayList<>();
    preOrder(root);
    return orderList.isEmpty()? null : orderList;
  }

  private void preOrder(BinaryTreeNode node)
  {
    if (node == null) return;

    orderList.add((E) node.getElement());
    preOrder(node.getLeftChild());
    preOrder(node.getRightChild());
  }

  public ArrayList<E> postOrder(){
    orderList = new ArrayList<>();
    postOrder(root);
    return orderList.isEmpty()? null : orderList;
  }

  private void postOrder(BinaryTreeNode node)
  {
    if (node == null) return;

    postOrder(node.getLeftChild());
    postOrder(node.getRightChild());
    orderList.add((E) node.getElement());
  }

  public ArrayList<E> levelOrder(){
    //TODO

    return null;
  }

  private void levelOrder(BinaryTreeNode node)
  {

  }

  public int height()
  {
    //TODO

    return -1;
  }
}
