import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest
{
  @Test
  void getRoot_return_node()
  {
    BinaryTreeNode node = new BinaryTreeNode<>(2);
    BinaryTree tree = new BinaryTree<>(node);

    Assertions.assertEquals(node, tree.getRoot());
  }

  @Test void getRoot_return_null()
  {
    BinaryTree tree = new BinaryTree<>(null);

    Assertions.assertEquals(null, tree.getRoot());
  }

  @Test
  void setRoot()
  {
    BinaryTree tree = new BinaryTree<>(null);
    BinaryTreeNode root = new BinaryTreeNode(3);
    tree.setRoot(root);

    Assertions.assertEquals(root, tree.getRoot());
  }

  @Test
  void setRoot_rootNotNull()
  {
    BinaryTree tree = new BinaryTree<>(null);
    BinaryTreeNode root = new BinaryTreeNode(3);

    tree.setRoot(root);

    BinaryTreeNode newRoot = new BinaryTreeNode<>(5);
    Assertions.assertThrows(IllegalArgumentException.class, () -> tree.setRoot(newRoot));
  }

  @Test
  void  isEmptyTrue()
  {
    BinaryTree tree = new BinaryTree<>();

    Assertions.assertEquals(true, tree.isEmpty());
  }

  @Test
  void isEmptyFalse()
  {
    BinaryTree tree = new BinaryTree<>(new BinaryTreeNode<>(5));

    Assertions.assertEquals(false, tree.isEmpty());
  }

  @Test
  void sizeTestIsOne()
  {
    BinaryTree tree = new BinaryTree<>(new BinaryTreeNode<>(5));

    Assertions.assertEquals(1, tree.size());
  }

  @Test
  void containsTrue()
  {
    BinaryTree tree = new BinaryTree<>(new BinaryTreeNode<>(5));

    Assertions.assertEquals(true, tree.contains(5));
  }

  @Test
  void containsFalse()
  {
    BinaryTree tree = new BinaryTree<>(new BinaryTreeNode<>(7));

    Assertions.assertEquals(true, tree.contains(5));
  }

  @Test
  void containsInRightChild()
  {
    BinaryTreeNode node = new BinaryTreeNode<>(3);
    node.addLeftChild(new BinaryTreeNode<>(2));
    node.addRightChild(new BinaryTreeNode<>(4));

    BinaryTree tree = new BinaryTree<>(node);

    Assertions.assertEquals(true, tree.contains(4));
  }

  @Test
  void containsInLeftChild()
  {
    BinaryTreeNode node = new BinaryTreeNode<>(3);
    node.addLeftChild(new BinaryTreeNode<>(2));
    node.addRightChild(new BinaryTreeNode<>(4));

    BinaryTree tree = new BinaryTree<>(node);

    Assertions.assertEquals(true, tree.contains(2));
  }
}
