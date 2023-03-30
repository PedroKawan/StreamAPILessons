package program;

public class ChallangeMain {
	public static void main(String[] args) {
		//Creating a store and its products
		Store store = new Store();
		store.put("Lapis", 1.50);
		store.put("Caneta", 2.00);
		store.put("Keyboard", 324.99);
		store.put("Mouse", 300.00);
		store.put("Notebook", 2000.00);
		store.put("NotebookDell", 3000.00);
		
		//Print products over $1,000 in the 'console'
		store.products.stream()
			.filter(e -> e.getPrice() < 1000)
			.forEach(e -> System.out.println(e.getName()));
		
		System.out.println("✔-----✔");
		
		//Print products under $1,000 in the 'console'
		store.products.stream()
			.filter(e -> e.getPrice() > 1000)
			.forEach(e -> System.out.println(e.getName()));
		
	}
}
