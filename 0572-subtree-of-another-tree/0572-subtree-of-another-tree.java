class Solution {
    public boolean isSubtree(TreeNode r, TreeNode s) {
      if(r==null || s==null)  
      {
        return false;
      }

    if(r.val==s.val && Check(r,s))
    {
        return true;
    }

        return isSubtree(r.left,s) || isSubtree(r.right,s);
        
    }

    public boolean Check(TreeNode r,TreeNode s)
    {
        if(r==null && s==null)
        {
            return true;
        }
        if(r==null || s==null || r.val!=s.val)
        {
            return false;
        }


        return Check(r.left,s.left)&&Check(r.right,s.right);
    }
}