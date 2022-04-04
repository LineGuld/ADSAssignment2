public class BinaryTreeNode<Object>
{
  private BinaryTreeNode<Object> leftChild, rightChild;
  private Object element;

  public BinaryTreeNode(Object element)
  {
    this.element = element;
  }

  public void setElement(Object element)
  {
    this.element = element;
  }

  public Object getElement()
  {
    return element;
  }

  public void addLeftChild(BinaryTreeNode<Object> node)
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

  public void addRightChild(BinaryTreeNode<Object> node)
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

  public BinaryTreeNode<Object> getLeftChild()
  {
    return leftChild;
  }

  public BinaryTreeNode<Object> getRightChild()
  {
    return rightChild;
  }
}
