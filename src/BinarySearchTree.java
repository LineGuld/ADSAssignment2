public class BinarySearchTree<E extends Comparable<? super E>> extends BinaryTree<E>
{
  private BinarySearchTreeNode<E> root;

  public BinarySearchTree(BinarySearchTreeNode root)
  {
    this.root = root;
  }

  public BinarySearchTree()
  {
    root = null;
  }

  public boolean insert(E element)
  {
    return insert(element, root);
  }

  private boolean insert(E element, BinarySearchTreeNode<E> root)
  {
    if (root == null)
    new BinarySearchTreeNode<>(element);

    int compareResult = element.compareTo(root.getElement());

    if (compareResult < 0)
    {
      BinarySearchTree leftSearch = new BinarySearchTree(
          (BinarySearchTreeNode) root.getLeftChild());
      insert(element,leftSearch.root);
      return true;
    }
    else if (compareResult > 0)
    {
      BinarySearchTree rightSearch = new BinarySearchTree(
          (BinarySearchTreeNode) root.getRightChild());
      insert(element,rightSearch.root);
      return true;
    }
    else
      return false;
  }

  public boolean removeElement(E element)
  {
    return removeElement(element, root);
  }

  private boolean removeElement(E element, BinarySearchTreeNode<E> root)
  {
    if (root == null)
      return false;

    int compareResult = element.compareTo(root.getElement());

    if (compareResult < 0)
    {
      BinarySearchTree leftSearch = new BinarySearchTree(
          (BinarySearchTreeNode) root.getLeftChild());
      removeElement(element,leftSearch.root);
      return true;
    }
    else if (compareResult > 0)
    {
      BinarySearchTree rightSearch = new BinarySearchTree(
          (BinarySearchTreeNode) root.getRightChild());
      removeElement(element,rightSearch.root);
      return true;
    }
    else if (root.getLeftChild() != null && root.getRightChild() != null)
    {
      E element2 = (E) findMin(
          (BinarySearchTreeNode<E>) root.getRightChild());
     return removeElement(element2, (BinarySearchTreeNode<E>) root.getRightChild());
    }

    return false;
  }

  public E findMin() throws Exception
  {
    if(isEmpty())
      throw new Exception("Der er slet ikke noget minimum din kegle");

      BinarySearchTreeNode<E> min = (BinarySearchTreeNode<E>) findMin(root);
      return min.getElement();
  }

  private Object findMin(BinarySearchTreeNode<E> root)
  {
    if (root == null)
      return null;
    else if (root.getLeftChild() == null)
      return root;

    BinarySearchTree nextTree = new BinarySearchTree<E>(
      (BinarySearchTreeNode) root.getLeftChild());
    return findMin(nextTree.root);
  }

  public E findMax() throws Exception
  {
    if(isEmpty())
      throw new Exception("Det er dig der er en største... klovn!");

    BinarySearchTreeNode<E> max = (BinarySearchTreeNode<E>) findMax(root);
    return max.getElement();
  }

  private Object findMax(BinarySearchTreeNode<E> root)
  {
    if (root != null)
      while (root.getRightChild() != null)
        root = (BinarySearchTreeNode<E>) root.getRightChild();
    return root;
  }

  public boolean contains(E element)
  {
    return contains(element, root);
  }

  private boolean contains(E element, BinarySearchTreeNode<E> t)
  {
    if (t == null)
      return false;

    int compareResult = element.compareTo(t.getElement());

    if (compareResult < 0)
      return contains(element, (BinarySearchTreeNode<E>) t.getLeftChild());
    else if (compareResult > 0)
      return contains(element, (BinarySearchTreeNode<E>) t.getRightChild());
    else
      return true;
  }

  public void rebalance()
  {
    //TODO kriseeeee
  }
}
