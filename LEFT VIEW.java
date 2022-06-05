/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
        int data;
        TreeNode<T> left;
        TreeNode<T> right;
 
        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

import java.util.ArrayList;
import java.util.*;
public class Solution 
{
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        //    Write your code here.
        if(root==null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        ArrayList<Integer> ans = new ArrayList<>();
        while(!queue.isEmpty())
        {
            int size = queue.size();
            int counter=0;
            while(size>0)
            {
                TreeNode<Integer> curr = queue.poll();
                if(counter==0)
                    ans.add(curr.data);
                counter++;
                if(curr.left!=null)
                    queue.offer(curr.left);
                if(curr.right!=null)
                    queue.offer(curr.right);
                size--;
            }
        }
        return ans;
        
    }
}

