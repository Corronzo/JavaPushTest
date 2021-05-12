public class IntLinkedList {
	private Node head;
	public IntLinkedList () {
		head = new Node();
		head.value = 0;
		head.link = null;
	}
	
	public boolean insertItem(int Item) {
		Node n = new Node();
		//n.value = Item;
		//n.link = head;
		//head = n;
		//return true;
		
		Node new_node = new Node();
		new_node = head;
		while(new_node.link != null) {
			new_node = new_node.link;
		}
		n.value = Item;
		n.link = null;
		new_node.link = n;
		return true;
	}
	
	public boolean deleteItem(int item) {
		if (head.value == item) {
			head = head.link;
			return true;
		}else {
			Node y = head;
			Node z = head.link;
			while(z!=null) {
				if(z.value == item) {
					y.link = z.link;
					return true;
				}
				y = y.link;
				z = z.link;
			}
			return false;
		}
	}
	
	public void sortList() {
		Node a = head.link;
		int c = 0;
		while(a.link != null) {
			Node b = head.link;
			while(b.link!=null) {
				if (b.value < b.link.value) {
					c = b.value;
					b.value = b.link.value;
					b.link.value = c;
				}
				b = b.link;
			}
			a = a.link;
		}
	}
	
	public void printList() {
		Node z = head.link;
		while(z != null) {
			System.out.println(z.value);
			z = z.link;
		}
	}
	class Node {
		private int value;
		private Node link;
	}
}
