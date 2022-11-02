package interview.one_mg.prep;

/** Driving class */
public class KeyInsertIntoBinaryTree {
    public static void main(String[] args) {
        CustomBinaryTree bt = new CustomBinaryTree(3);
    }
}

class CustomBinaryTree{

    private int T;
    private Node root;

    /** Tree Constructor */
    public CustomBinaryTree(int t) {
        T = t;
        root = new Node();
        root.n = 0;
        root.leaf = true;
    }

    /** Split */
    public void split(Node x, int pos, Node y){
        Node z = new Node();
        z.leaf = y.leaf;
        z.n = T - 1;
        
    }

    /** Node class impl */
    class Node{
        int n;
        int key[] = new int[2 * T - 1];
        Node child[] = new Node[2 * T];
        boolean leaf = true;

        public int find(int k){
            for (int i = 0; i < this.n; i++) {
                if(key[i] == k)
                    return i;
            }
            return -1;
        }

    }
}
