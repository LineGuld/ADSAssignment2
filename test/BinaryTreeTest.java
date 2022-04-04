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
    BinaryTree tree = new BinaryTree(null);
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

    BinaryTreeNode newRoot = new BinaryTreeNode(5);
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

    Assertions.assertEquals(false, tree.contains(5));
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

  @Test
  void inOrderEmpty()
  {
    BinaryTree tree = new BinaryTree<>();

    Assertions.assertNull(tree.inOrder());
  }

  @Test
  void inOrder()
  {
    BinaryTreeNode node = new BinaryTreeNode<>(2);
    node.addLeftChild(new BinaryTreeNode<>(1));
    node.addRightChild(new BinaryTreeNode<>(3));

    BinaryTree tree = new BinaryTree<>(node);

    Assertions.assertEquals(1, tree.inOrder().get(0));
    Assertions.assertEquals(2, tree.inOrder().get(1));
    Assertions.assertEquals(3, tree.inOrder().get(2));
  }

  @Test
  void preOrderEmpty()
  {
    BinaryTree tree = new BinaryTree<>();

    Assertions.assertNull(tree.preOrder());
  }

  @Test
  void preOrder()
  {
    BinaryTreeNode node = new BinaryTreeNode<>(2);
    node.addLeftChild(new BinaryTreeNode<>(1));
    node.addRightChild(new BinaryTreeNode<>(3));

    BinaryTree tree = new BinaryTree<>(node);

    Assertions.assertEquals(2, tree.preOrder().get(0));
    Assertions.assertEquals(1, tree.preOrder().get(1));
    Assertions.assertEquals(3, tree.preOrder().get(2));
  }

  @Test
  void postOrderEmpty()
  {
    BinaryTree tree = new BinaryTree<>();

    Assertions.assertNull(tree.postOrder());
  }

  @Test
  void postOrder()
  {
    BinaryTreeNode node = new BinaryTreeNode<>(2);
    node.addLeftChild(new BinaryTreeNode<>(1));
    node.addRightChild(new BinaryTreeNode<>(3));

    BinaryTree tree = new BinaryTree<>(node);

    Assertions.assertEquals(1, tree.postOrder().get(0));
    Assertions.assertEquals(3, tree.postOrder().get(1));
    Assertions.assertEquals(2, tree.postOrder().get(2));
  }

  @Test
  void levelOrderEmpty()
  {
    BinaryTree tree = new BinaryTree<>();

    Assertions.assertNull(tree.postOrder());
  }

  @Test
  void levelOrder()
  {
    BinaryTreeNode node = new BinaryTreeNode<>(5);
    node.addLeftChild(new BinaryTreeNode<>(3));
    node.addRightChild(new BinaryTreeNode<>(7));
    node.getLeftChild().addLeftChild(new BinaryTreeNode(2));
    node.getLeftChild().addRightChild(new BinaryTreeNode(4));
    node.getRightChild().addLeftChild(new BinaryTreeNode(6));
    node.getRightChild().addRightChild(new BinaryTreeNode(8));

    BinaryTree tree = new BinaryTree<>(node);

    Assertions.assertEquals(5, tree.postOrder().get(0));
    Assertions.assertEquals(3, tree.postOrder().get(1));
    Assertions.assertEquals(7, tree.postOrder().get(2));
    Assertions.assertEquals(2, tree.postOrder().get(3));
    Assertions.assertEquals(4, tree.postOrder().get(4));
    Assertions.assertEquals(6, tree.postOrder().get(5));
    Assertions.assertEquals(8, tree.postOrder().get(6));
  }
}
