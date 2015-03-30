/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaw
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(44);
        tree.insert(17);
        tree.insert(88);
        tree.insert(8);
        tree.insert(32);
        tree.insert(65);
        tree.insert(97);
        tree.insert(28);
        tree.insert(54);
        tree.insert(82);
        tree.insert(93);
        tree.insert(21);
        tree.insert(29);
        tree.insert(76);
        tree.insert(68);
        tree.insert(80);
        PrintTree.printTree(tree);
        
        //You can call your method whatever you want, just make it return a boolean
        System.out.println(tree.isBST() + "\n");
        
        //Remove this if you build your trees in a different fashion than I suggest
        tree.modify(17, 20);
        
        PrintTree.printTree(tree);
        System.out.println(tree.isBST() + "\n");
    }
}
