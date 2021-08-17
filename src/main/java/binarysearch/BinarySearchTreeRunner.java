package binarysearch;

public class BinarySearchTreeRunner {

    public static void main(String[] args) {

        BinarySearchOperation binary = new BinarySearchOperation();
        // Inserting data.
        binary.insert(56);
        binary.insert(30);
        binary.insert(70);
        binary.insert(25);
        binary.insert(55);
        binary.insert(18);
        binary.insert(66);
        binary.insert(16);
        binary.insert(63);
        binary.insert(100);
        binary.insert(44);
        binary.insert(69);
        binary.insert(67);

        // Displaying the Binary tree.
        binary.inorderTraversal(binary.root);

        // checking if 63 exists in BST.
        boolean flag = binary.search(63);
        System.out.println("\nElement exits: " + flag);


    }

}
