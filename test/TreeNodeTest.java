import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TreeNodeTest
{

  @Test
  void setNodeTest()
  {//Arrange
    BinaryTreeNode treeNode = new BinaryTreeNode<>(1);
    treeNode.setElement(5);

    //Assert
    Assertions.assertEquals(5, treeNode.getElement());
  }

  @Test
  void addAndGetLeftChild()
  {
    //Arrange + Act
    BinaryTreeNode treeNode = new BinaryTreeNode<>(1);
    BinaryTreeNode leftChild = new BinaryTreeNode<>(5);

    treeNode.addLeftChild(leftChild);
    //Assert
    Assertions.assertEquals(leftChild, treeNode.getLeftChild());
  }

  @Test
  void addAndGetRightChild()
  {
    //Arrange + Act
    BinaryTreeNode treeNode = new BinaryTreeNode<>(1);
    BinaryTreeNode rightChild = new BinaryTreeNode<>(5);

    treeNode.addRightChild(rightChild);
    //Assert
    Assertions.assertEquals(rightChild, treeNode.getRightChild());
  }
}
