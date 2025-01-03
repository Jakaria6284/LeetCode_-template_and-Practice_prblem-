/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {

       

        List<List<Integer>> result = new ArrayList<>();
         if(root==null)
        {
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        // result.add(root.val);

        while (!queue.isEmpty()) {

            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                list.add(node.val);
                for (Node child : node.children) {
                    if(child!=null)
                    {
                      queue.offer(child);
                    }
                   
                    // list.add(child.val);
                }
            }

            result.add(list);
        }
        return result;

    }
}