public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		BST tree = new BST();
		Person A = new Person("Adam", "1");
		Person B = new Person("Ben", "2");
		Person C = new Person("Alex", "3");
		Person D = new Person("Felix","4");
		Person E = new Person("Deen", "5");
		
		tree.insertPerson(tree, A);
		tree.insertPerson(tree, B);
		tree.insertPerson(tree, C);
		tree.insertPerson(tree, D);
		tree.insertPerson(tree, E);
		
		
		tree.printAll(tree.treeSearch(tree.getRoot(), "Ben"));
		
		//System.out.println(((tree.treeSearch(tree.getRoot(),"Ben")).getData()));
		
		
	}


}
