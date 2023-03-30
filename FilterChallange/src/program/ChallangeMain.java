package program;

public class ChallangeMain {
	public static void main(String[] args) {
		Store store = new Store();
		store.put("Lapis", 1.50);
		store.put("Caneta", 2.00);
		store.put("Notebook", 2000.0);
		store.put("NotebookGamer", 3000.0);
		
		store.products.stream()
			.filter(e -> e.getPrice() < 1000)
			.forEach(e -> System.out.println(e.getName()));
		
		System.out.println("✔-----✔");
		
		store.products.stream()
			.filter(e -> e.getPrice() > 1000)
			.forEach(e -> System.out.println(e.getName()));
		
	}
}
