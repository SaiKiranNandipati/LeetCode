/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Q_Node{
    TreeNode node;
    String str; 
    public Q_Node(TreeNode node,String str )
    {
        this.node=node;
        this.str=str;
    }
 }

class Solution {
    
    public String getDirections(TreeNode root, int startValue, int destValue) {

        Queue<Q_Node> q=new LinkedList<>();
        String start="";
        String des="";
        Q_Node head=new Q_Node(root,"");
        q.add(head);
        while(!q.isEmpty())
        {
            Q_Node temp=q.poll();
            if(temp.node.val==startValue)
            {
                start=temp.str;
            }
            if(temp.node.val==destValue)
            {
                des=temp.str;
            }
            if(temp.node.left!=null)
            q.add(new Q_Node(temp.node.left,temp.str+"L"));
            if(temp.node.right!=null)
            q.add(new Q_Node(temp.node.right,temp.str+"R"));
        }
       StringBuilder str1=new StringBuilder(start);
       StringBuilder str2=new StringBuilder(des);
       int i=0;
       int count=0;
       if(str1.length()!=0&&str2.length()!=0)
       {
        while(i<str1.length()&&i<str2.length())
        {
             char a=str1.charAt(i);
             char b=str2.charAt(i);
             if(a==b)
             count++;
             else
             {
                break;
             }
             i++;
       }
       str1.delete(0,count);
       str2.delete(0,count);
       }
       String result="";
       for(int j=0;j<str1.length();j++)
       {
              result+="U";
       }
     result+=str2.toString();
     return result;

    
   
    }
}