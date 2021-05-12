
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStack intStack = new IntStack();
		if(!intStack.isFull()) {
			intStack.push(2);
			intStack.push(4);
			intStack.push(6);
			intStack.push(9);
		}
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());		
	}

}
