import java.util.*;

class lab7{
    public static void main(String [] args){
        BalancedTree tree = new BalancedTree();
        tree.add(2);
        tree.add(1);
        tree.add(-3);
        tree.add(5);
        tree.add(-2);
        tree.print();
        System.out.println();

        Change minus = (num) -> num - 1;
        Change multiply = (num) -> num * 10;
        System.out.println("Left part before: ");
        BalancedTree tree_l = new BalancedTree(tree.start.left);
        tree_l.print();
        System.out.println("\nRight part before: ");
        BalancedTree tree_r = new BalancedTree(tree.start.right);
        tree_r.print();

        tree_l.forAll(minus);
        tree_r.forAll(multiply);

        System.out.println("\nLeft part after: ");
        tree_l.print();
        System.out.println("\nRight part after: ");
        tree_r.print();

        System.out.println("\nFull tree after: ");
        tree.print();
    }

    static class BalancedTree{
        static class TreeNode{
            public Integer value;
            public TreeNode left;
            public TreeNode right;
            public int leftSize;
            public int rightSize;
            TreeNode(Integer val){
                value = val;
                left = null;
                right = null;
                leftSize = 0;
                rightSize = 0;
            }
        }

        private TreeNode start;
        public int size;
        BalancedTree(){
            start = null;
            size = 0;
        }

        BalancedTree(TreeNode node){
            start = node;
            size = 1 + start.leftSize + start.rightSize;
        }

        public TreeNode getStart(){
            return start;
        }

        private boolean contains(Integer val, TreeNode node){
            if(node == null)
                return false;
            else if(node.value == val)
                return true;
            else if(contains(val, node.right))
                return true;
            else
                return contains(val, node.left);
        }

        public boolean contains(Integer val){
            if(start == null)
                return false;
            if(start.value == val)
                return true;
            else if(contains(val, start.right))
                return true;
            else
                return contains(val, start.left);
        }

        private void add(Integer val, TreeNode node){
            if(node.leftSize <= node.rightSize){
                node.leftSize++;
                if(node.left == null){
                    node.left = new TreeNode(val);
                    return;
                }else{
                    add(val, node.left);
                }
            }else{
                node.rightSize++;
                if(node.right == null){
                    node.right = new TreeNode(val);
                    return;
                }else{
                    add(val, node.right);
                }
            }
            
        }

        public void add(Integer val){
            if(contains(val))
                return;
            size++;
            if(start == null){
                start = new TreeNode(val);
                return;
            }
            add(val, start);
        }

        private void forAll(Change func, TreeNode node){
            if(node == null)
                return;
            node.value = func.process(node.value);
            forAll(func, node.left);
            forAll(func, node.right);
        }

        public void forAll(Change func){
            if(start == null)
                return;
            start.value = func.process(start.value);
            forAll(func, start.left);
            forAll(func, start.right);
        }

        private void print(TreeNode node){
            if(node == null)
                return;
            System.out.print(node.value + " ");
            print(node.left);
            print(node.right);
        }

        public void print(){
            if(start == null)
                return;
            System.out.print(start.value + " ");
            print(start.left);
            print(start.right);
        }

    }

    interface Change{
        Integer process(Integer num);
    }
}