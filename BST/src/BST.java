public class BST {
	private Node root;
	
	public BST() {
		root = null;
	}
	public Node getRoot() {
		return this.root;
	}
	public boolean insertPerson(BST tree, Person z) {
		Node n = new Node();
		n.data = z;
		n.lc = null;
		n.rc = null;
		
		Node p = null;
		Node c = tree.root;
		
		while(c!=null) {
			p=c;
			if(z.getName().compareTo(c.data.getName()) < 0) {
				c = c.lc;
			} else {
				c = c.rc;
			}
		}
		
		//Empty Tree
		if(p == null) {
			root = n;
			return true;
		}
		else if (z.getName().compareTo(p.data.getName()) < 0) {
			p.lc = n;
			return true;
		}
		else {
			p.rc = n;
			return true;
		}	
	}
	
	public Node treeSearch(Node root, String key) {
		if(root == null || key.equals(root.data.getName())){
			return root;
		}
		if (key.compareTo(root.data.getName())<0) {
			return treeSearch(root.lc, key);
		} else return treeSearch(root.rc,key);
	}
	
	public void printAll(Node n) {
		
		Node p = n;
		if(p!=null) {
			System.out.println(" " + p.getData());
			printAll(p.lc);
			printAll(p.rc);
		}
	}
	
	public class Node {
		private Node lc;
		private Node rc;
		private Person data;
		
		public String getData() {
			return this.data.getName();
		}
	}
}