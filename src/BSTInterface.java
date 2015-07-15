import java.util.List;

import javax.swing.tree.TreeNode;



public interface BSTInterface {

	boolean find(int key);

	void insert(int key, double data);

	void traverce(int order);

	int height();

	void delete(int key);

	int numofnodes();

	List<Integer> rightSideView();
	
	List<Integer> leftSideView();

	void BFS();
	
	int getSuccessor(int key);
	
	void BFSwithLine();
	

}
