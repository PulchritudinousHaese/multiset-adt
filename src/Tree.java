import java.util.Collection;
import java.util.TreeSet;

public class Tree {
    private static Object root;

    /*A recursive tree data structure, which provides services required of the
           MultiSet ADT. See TreeMultiSet, which is the next class defined.
           This is a simplified version of the Tree data structure
           adapted from CSC148.
        */
    // === Private Attributes ===
    public static <root, subtree> void main(String[] args, Collection<? extends root> root) {
        //The item stored at this tree's root, or None if the tree is empty.
        TreeSet<root> set = new TreeSet<>(root);
        //The list of all subtrees of this tree.
        TreeSet<subtree> subtrees = new TreeSet<subtree>;
    }
    /* === Representation Invariants ===
     - If self._root is None then self._subtrees is an empty list.
     This setting of attributes represents an empty tree.
            #
            #   Note: self._subtrees may be empty when self._root is not None.
            #   This setting of attributes represents a tree consisting of just one node.*/

}
