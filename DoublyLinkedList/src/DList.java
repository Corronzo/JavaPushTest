public class DList {
	private Node head;
	public DList (int item) {
		head = new Node();
		head.value = item;
		head.next = null;
		head.prev = null;
	}
	
	public boolean insertItem(int Item) {
		Node n = new Node();
		n.value = Item;
		n.prev = null;
		head.prev = n;
		n.next = head;
		head = n;
		return true;
	}
	
	public boolean deleteItem(int item) {
		if (head.value == item) {
			head = head.next;
			return true;
		}else {
			Node y = head;
			Node z = head.next;
			while(z!=null) {
				if(z.value == item) {
					y.next = z.next;
					return true;
				}
				y = y.next;
				z = z.next;
			}
			return false;
		}
	}
	
	public void printList() {
		Node z = head.next;
		while(z != null) {
			System.out.println(z.value);
			z = z.next;
		}
	}
	class Node {
		private int value;
		private Node next;
		private Node prev;
	}
}
