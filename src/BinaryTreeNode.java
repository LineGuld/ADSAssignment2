public class BinaryTreeNode<E>
{
  private BinaryTreeNode<E> leftChild, rightChild;
  private E element;

  public BinaryTreeNode(E element)
  {
    this.element = element;
  }

  public void setElement(E element)
  {
    this.element = element;
  }

  public E getElement()
  {
    return element;
  }

  public void addLeftChild(BinaryTreeNode<E> node)
  {
    if (leftChild == null)
    {
      leftChild = node;
    }
    else
    {
      System.out.println("Stinker, der er allerede en venste node");
    }
  }

  public void addRightChild(BinaryTreeNode<E> node)
  {
    if (rightChild == null)
    {
      rightChild = node;
    }
    else
    {
      System.out.println("Stinker, der er allerede en højre node");
    }
  }

  public BinaryTreeNode<E> getLeftChild()
  {
    return leftChild;
  }

  public BinaryTreeNode<E> getRightChild()
  {
    return rightChild;
  }
}
