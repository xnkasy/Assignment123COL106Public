// Class: Height balanced AVL Tree
// Binary Search Tree

public class AVLTree extends BSTree {
        
    private int height;  // The height of the subtree
        
    public AVLTree() { 
        super();
        this.height = -1;
    }

    public AVLTree(int address, int size, int key) { 
        super(address, size, key);
        this.height = 0;
    }

    // Implement the following functions for AVL Trees.
    // You need not implement all the functions. 
    // Some of the functions may be directly inherited from the BSTree class and nothing needs to be done for those.
    // Remove the functions, to not override the inherited functions.
    
    public AVLTree Insert(int address, int size, int key) 
    { 
        return null;
    }

    public boolean Delete(Dictionary e)
    {
        return false;
    }
        
    public AVLTree Find(int k, boolean exact)
    { 
        return null;
    }

    public AVLTree getFirst()
    { 
        return null;
    }

    public AVLTree getNext()
    {
        return null;
    }

    public boolean sanity()
    { 
        return false;
    }
}


