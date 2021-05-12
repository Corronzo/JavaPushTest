
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntLinkedList list = new IntLinkedList();
		list.insertItem(5);
		list.insertItem(2);
		list.insertItem(8);
		list.printList();
		list.sortList();
		System.out.println();
		list.printList();
		//list.deleteItem(2);
		//list.printList();
	}

}
