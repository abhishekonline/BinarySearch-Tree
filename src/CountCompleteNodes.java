
public class CountCompleteNodes {
	int completnode=0;
	boolean stop=false;
	public int countNodes(TreeNode root) {
		
		int h= height(root);
		System.out.println("h= "+h);
		count(root,h);
		if(!stop)
		{
			System.out.println("in if");
			return perfectNodes(h);
		}
		else{
			System.out.println("in else");
			return perfectNodes(h-1)+completnode;
			}
    }

	private int perfectNodes(int h) {
		if(h == 0) return 0;
        if(h == 1) return 1;
        return (int)Math.pow(2, h) - 1;
	}

	private void count(TreeNode root, int h) {
		System.out.println("count called "+root.val);
		if(root==null) return;
		if(stop) return ;
		if(h==2){
			if(root.right!=null)
			{
				completnode+=2;
			}
			else{
				stop=true;
				if(root.left!=null)
					completnode+=1;
			}
			
			return;
		}
		count(root.left,h-1);
		count(root.right,h-1);
		
	}

	private int height(TreeNode root) {
		if(root==null) return 0;
		else return 1+height(root.left);
	}
}
