/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
          if (root == null)
            return root;
        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);
        // root.next=null;

        while (!queue.isEmpty()) {
            int size = queue.size();
            if (size == 1) {
                root.next = null;
                Node node = queue.poll();

                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);

            } else {
                for (int i = 0; i < size; i++) {
                    Node node1 = queue.poll();
                    if (i != size - 1) {
                        Node node2 = queue.peek();
                        node1.next = node2;
                    } else if (i == size - 1) {
                        // TreeNode node2=queue.poll();
                        node1.next = null;
                    }

                    if (node1.left != null)
                        queue.offer(node1.left);
                    if (node1.right != null)
                        queue.offer(node1.right);

                }
            }
        }
            return root;
    }
}