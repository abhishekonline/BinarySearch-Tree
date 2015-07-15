import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class BST implements BSTInterface {
	private Node root;

	public boolean find(int key) {
		if (root == null)
			return false;
		Node current = root;

		while (current.key != key) {
			if (key > current.key)
				current = current.right;
			else
				current = current.left;
			if (current == null)
				return false;
		}
		return true;
	}

	public void insert(int key, double data) {

		Node n = new Node(key, data);

		if (root == null) // tree was empty
		{
			root = n;
			System.out.println("Inserted " + n.data + " as root ");
		} else {
			Node current = root;
			Node parent;

			while (true) {
				if (key == current.key) // element already exists
					return;
				parent = current;
				if (key > current.key) {
					current = current.right;
					if (current == null) // parent has no right, right place to
											// insert
					{
						parent.right = n;
						System.out.println("Inserted " + n.data
								+ " to right of " + parent.data);
						return;
					}

				} else {
					current = current.left;
					if (current == null) {
						parent.left = n;
						System.out.println("Inserted " + n.data
								+ " to left of " + parent.data);
						return;
					}

				}

			}

		}

	}

	public void traverce(int order) {
		if (order == 0) {

			inorder(root);

		} else if (order == 1) {
			ptorder(root);
		} else {
			prorder(root);
		}

	}

	private void inorder(Node n) {

		if (n != null) {
			inorder(n.left);
			System.out.print(n.data + ",");
			inorder(n.right);
		}

	}

	private void prorder(Node n) {

		if (n != null) {

			System.out.print(n.data + ",");
			prorder(n.left);
			prorder(n.right);
		}

	}

	private void ptorder(Node n) {

		if (n != null) {

			ptorder(n.left);
			ptorder(n.right);
			System.out.print(n.data + ",");
		}

	}

	public int height() {

		return height(root);

	}

	private int height(Node p) {
		if (p == null)
			return 0;
		else
			return 1 + Math.max(height(p.left), height(p.right));
	}

	public void delete(int key) {

	}

	public class Node {
		private int key;
		private double data;
		private Node left, right;

		public Node(int key, double value) {
			this.key = key;
			this.data = value;
			right = left = null;
		}
	}

	public int numofnodes() {

		return calnode(root);
	}

	private int calnode(Node n) {
		if (n == null)
			return 0;
		return 1 + calnode(n.right) + calnode(n.left);
	}

	public List<Integer> leftSideView() {
		List<Integer> result = new ArrayList<Integer>();
		Queue<Node> que = new LinkedList<Node>();
		Node curr = root;
		if (curr == null)
			return result;
		que.add(curr);
		while (que.size() > 0) {

			int size = que.size();

			for (int i = 0; i < size; i++) {
				Node top = que.remove();
				if (i == 0)
					result.add((int) top.data);
				if (top.left != null) {
					que.add(top.left);
				}
				if (top.right != null) {
					que.add(top.right);
				}

			}

		}

		return result;
	}

	public List<Integer> rightSideView() {
		List<Integer> result = new ArrayList<Integer>();
		Queue<Node> que = new LinkedList<Node>();
		Node curr = root;
		if (curr == null)
			return result;
		que.add(curr);
		while (que.size() > 0) {

			int size = que.size();

			for (int i = 0; i < size; i++) {
				Node top = que.remove();
				if (i == 0)
					result.add((int) top.data);
				if (top.right != null) {
					que.add(top.right);
				}
				if (top.left != null) {
					que.add(top.left);
				}

			}

		}

		return result;
	}

	public void BFS() {
		Queue<Node> que = new LinkedList<Node>();
		Node curr = root;
		que.add(curr);
		System.out.print(curr.data + " ");
		while (que.size() > 0) {

			Node n = que.remove();
			if (n.left != null) {
				System.out.print(n.left.data + " ");
				que.add(n.left);

			}
			if (n.right != null) {
				System.out.print(n.right.data + " ");
				que.add(n.right);
			}

		}

	}

	
	public int getSuccessor(int key) {
		Node current=root;
		Node LastLeft=root;
		/*
		 * case 1. Node has right child.Find minimum in right sub tree.
		 * case 2. Node do not have right child. Find where was last left turn was taken
		 * 
		 */
		//case 1
		while(current.key!=key)
		{
			if(current.key>key){
				LastLeft=current;
				current=current.left;
			}
			else{
				current=current.right;
			}
		}
		
		if(current.right!=null)
			return getMinimun(current);
		else return LastLeft.key;
	}

	private int getMinimun(Node current) {
		Node successor=current;
		Node successorParent=current;
		Node curr=current.right;
		
		while(curr!=null){
			successorParent=successor;
			successor=curr;
			curr=curr.left;
		}
		return successor.key;
	}

	public void BFSwithLine() {
		Queue<Node> que= new LinkedList<Node>();
		que.add(root);
		System.out.print("	"+root.data);
		while(que.size()>0){
			int size= que.size();
			for(int i=0;i<size;i++){
				Node curr= que.remove();
				if(i==0)
					System.out.println();
					if(curr.left!=null){
						que.add(curr.left);
						System.out.print("	"+curr.left.data);
					}
					if(curr.right!=null)
					{
						que.add(curr.right);
						System.out.print("	"+curr.right.data);
					}
				
			}
		}
		
	}

	
	

}
