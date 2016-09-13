import java.util.ArrayList;


public class LexicographicalPermutation {
	static int[] numbers = {0,1,2, 3, 4, 5, 6, 7, 8, 9};
	static ArrayList<String> permutations = new ArrayList<String>();
	
	//constructs a tree of all permutations with a given root
	public static treeNode buildTree(treeNode mytree, int[] numbers) {
		for (int n:numbers) {
			if (!mytree.getParents().contains(n)) {
				treeNode child = new treeNode(n, mytree);
				mytree.addChildren(child);
				buildTree(child, numbers);
			}
		}
		return mytree;
	}
	
	//adds all the possible permutations with a given root to the ArrayList
	static void addpermutations(treeNode t) {
			if (t.getParents().size() == numbers.length) {
				String s = "";
				for (int i = t.getParents().size() - 1; i >=0; i--) {
					s += t.getParents().get(i);
				}
				permutations.add(s);
			}
			for (treeNode child: t.getChildren()) {
				addpermutations(child);
			}
	}
	
	
	public static void main (String[] args) {
		for (int i:numbers) {
			treeNode mytree = new treeNode(i, null);
			treeNode t = buildTree(mytree, numbers);
			addpermutations(t);
		}
		int i = 1000000 % permutations.size();
		System.out.println(permutations.get(i - 1));

		
	}
	

}
