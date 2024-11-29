class Solution {
    public boolean isCompleteTree(TreeNode root) {
       Queue<TreeNode>queue=new LinkedList<>();
       queue.offer(root);

       while(!queue.isEmpty())
       {
        int size=queue.size();
        for(int i=0;i<size;i++)
        {
            TreeNode temp=queue.poll();
            if(temp==null && queue.peek()!=null)return false;
            if(temp!=null)
            {
                queue.offer(temp.left);
                queue.offer(temp.right);
            }
        }
       }

       return true;
    }
}