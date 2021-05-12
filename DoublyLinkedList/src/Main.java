
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DList list = new DList(2);
		list.insertItem(3);
		list.insertItem(6);
		list.printList();
		System.out.println();
		list.deleteItem(3);
		list.printList();
	}

}
