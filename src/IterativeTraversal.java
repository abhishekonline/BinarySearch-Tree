import java.awt.List;
import java.util.ArrayList;
import java.util.Stack;


public class IterativeTraversal {

	public void IterativeInorder(TreeNode root){
		Stack<TreeNode> s= new Stack<TreeNode>();
		ArrayList<Integer> answ= new ArrayList<Integer>();
		
		while(true){
			if(root!=null){
				s.push(root);
				root=root.left;
				continue;
			}else{
				if(s.size()!=0){
					TreeNode curr= s.pop();
					System.out.print(curr.val+", ");
					root=curr.right;
					continue;
				}else{
					break;
				}
			}
		}
	}
	
	public void IterativePreorder(TreeNode root){
Stack<TreeNode> s= new Stack<TreeNode>();
		
		while(true){
			if(root!=null){
				System.out.print(root.val+" ,");
				s.push(root);
				root=root.left;
				continue;
			}else{
				if(s.size()!=0){
					root=s.pop().right;
					continue;
				}else{
					break;
				}
			}
		}
	}
	
	public void IterativePostorder(TreeNode root){
		/*
		 * 	1.1 Create an empty stack
			2.1 Do following while root is not NULL
    			a) Push root's right child and then root to stack.
    			b) Set root as root's left child.
			2.2 Pop an item from stack and set it as root.
    			a) If the popped item has a right child and the right child 
       				is at top of stack, then remove the right child from stack,
       				push the root back and set root as root's right child.
    			b) Else print root's data and set root as NULL.
			2.3 Repeat steps 2.1 and 2.2 while stack is not empty.
		 */
		Stack<TreeNode> s= new Stack<TreeNode>();
		
		while(true){
			if(root!=null){
				
				s.push(root.right);
				s.push(root);
				root=root.left;
				continue;
			}else{
				if(s.size()!=0){
					TreeNode curr= s.pop();
					if(s.size()!=0)
						if(curr.right==s.peek())
						{
							root=s.pop();
							s.push(curr);
							continue;
						}
					System.out.print(curr.val+" ,");
					root=null;
				}else{
					break;
				}
			}
		}
	}
	
	
}
