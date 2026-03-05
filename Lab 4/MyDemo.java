public class MyDemo{
	public static void main(String[] args){
		Product p1 = new Product("iPhone 15 (128GB)", "Apple", "Smartphone", 799.00, 8, 12);
        	Product p2 = new Product("Galaxy A15 (128GB)", "Samsung", "Smartphone", 179.99, 15, 12);

		String p1_id = p1.getId();
		String p1_name = p1.getName();
		String p2_id = p2.getId();
		String p2_name = p2.getName();

		if(p1_id.equals(p2_id) && p1_name.equals(p2_name) )
            		System.out.println("Both objects are equal");
        	else
            		System.out.println("Objects are not equal");
		 
	}
}