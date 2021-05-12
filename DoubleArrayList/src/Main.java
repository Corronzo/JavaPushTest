import java.util.*;



public class Main {



	public static void main(String[] args) {

		

		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		List<List<Integer>> arr2 = new ArrayList<List<Integer>>();
		
		
		List<Integer> rollno = new ArrayList<>();
		rollno.add(1);
		rollno.add(2);
		
		List<Integer> studentno = new ArrayList<>();
		studentno.add(1);
		studentno.add(2);
		
		arr2.add(rollno);
		arr2.add(studentno);
		
		for(int i = 0; i < arr2.size(); i++) {
			for(int j = 0; j < arr2.get(i).size(); j++) {
				System.out.println(arr2.get(i).get(j));
			}
		}
		System.out.println(arr2);

		ArrayList<String> bakeryList = new ArrayList();

		bakeryList.add("pasta");

		bakeryList.add("garlic bread");

		bakeryList.add("donuts");

		

		ArrayList<String> produceList = new ArrayList();

		produceList.add("tomatoes");

		produceList.add("zucchini");

		produceList.add("peppers");

		

		ArrayList<String> drinksList = new ArrayList();

		drinksList.add("soda");

		drinksList.add("coffee");

		

		groceryList.add(bakeryList);

		groceryList.add(produceList);

		groceryList.add(drinksList);

		

		System.out.println(groceryList.get(0).get(0));

		Map<String,ArrayList<String>> adjList = new HashMap<>();
		
		adjList.put("dog", new ArrayList<String>());
		
		adjList.get("dog").add("cat");
		adjList.get("dog").add("horse");
		
		System.out.println(adjList);
		
		

	}

}