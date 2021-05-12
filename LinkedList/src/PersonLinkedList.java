public class PersonLinkedList {
	private Node head;
	public PersonLinkedList (Person person) {
		head = new Node();
		head.person = person;
		head.link = null;
	}
	
	public boolean insertItem(Person person) {
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
		n.person = person;
		n.link = null;
		new_node.link = n;
		return true;
	}
	
	public boolean deleteItem(String name) {
		if (name.equals(head.person.getName())) {
			head = head.link;
			return true;
		}else {
			Node y = head;
			Node z = head.link;
			while(z!=null) {
				if(name.equals(z.person.getName())) {
					y.link = z.link;
					return true;
				}
				y = y.link;
				z = z.link;
			}
			return false;
		}
	}
		
	public void printList() {
		Node z = head.link;
		while(z != null) {
			System.out.println(z.person.toString());
			z = z.link;
		}
	}
	class Node {
		private Person person;
		private Node link;
	}
}
