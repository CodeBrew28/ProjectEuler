import java.util.ArrayList;

public class treeNode {
	private int myroot;
	private treeNode myleft;
	private treeNode myright;
	
	private ArrayList<treeNode> mychildren;
	private ArrayList<Integer> myparents;
	
	//constructor
	public treeNode(int root, treeNode parent) {
		myroot = root;
		mychildren= new ArrayList<treeNode>();	
		myparents = new ArrayList<Integer>();
		myparents.add(root);
	}
	
	//getter methods below
	public int getRoot() {
		return myroot;
	}
	public ArrayList getParents() {
		return myparents;
	}
	public ArrayList<treeNode> getChildren() {
		return mychildren;
	}

	//setters methods
	public void addparents(ArrayList<Integer> parents) {
		for (int parent: parents) {
			myparents.add(parent);
		}
	}
	public void addChildren(treeNode child) {
		mychildren.add(child);
		child.addparents(myparents);
	}

}
