 /* Implement Product, Store and Company classes and use the following class to test.
 
	Solution:
*/
class Company{
	String name;
	Store arrayStore[] = new Store[10];
	int nbStore;
	Company(String name){
		this.name = name;
	}
	void addStore(Store store){
		if(nbStore<arrayStore.length){
			arrayStore[nbStore++] = store;
		}
		else{
			System.out.println("Store is full");
		}
	}
	int searchNbofStore(String productName){
		int c = 0;
		for(int i=0;i<nbStore;i++){
			if(arrayStore[i].searchProduct(productName)){
				c++;
			}
		}
		return c;
	}
	void displayAll(){
		for(int i=0;i<nbStore;i++){
			System.out.println(arrayStore[i].getName());
		}
	}
}
class Store{
	String name;
	String location;
	Product productList[] = new Product[100];
	int nbProduct;
	Store(String name, String location){
		this.name = name;
		this.location = location;
	}
	String getName(){
		return name;
	}
	void addProduct(Product p){
		if(nbProduct<productList.length){
			productList[nbProduct++] = p;
		}
		else{
			System.out.println("Store is filled completely");
		}
	}
	boolean searchProduct(String productName){
		boolean v = false;
		for(int i=0;i<nbProduct;i++){
			if(productName.equals(productList[i].getName())){
				v = true;
			}
		}
		return v;
	}
	Product deleteProduct(String productName){
		Product d = null;
		if(searchProduct(productName)){
			for(int i=0;i<nbProduct;i++){
				if(productName.equals(productList[i].getName())){
					d = productList[i];
					for(int j = i;j<nbProduct-1;j++){
						productList[j] = productList[j+1];
					}
					productList[--nbProduct]=null;
					break;
				}
			}
		}
		return d;
	}
	void displayAll(){
		System.out.println("Present products");
		for(int i=0;i<nbProduct;i++){
			System.out.println(productList[i].getName());
		}
	}	

}
class Product{
	String name;
	int quantity;
	double price;
	Product(String name, int quantity, double price){
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	String getName(){
		return name;
	}
}
public class TestCompany { 
    public static void main(String [] args){         
        Product p1 = new Product("TV",4,34000); 
        Product p2 = new Product("Bicycle", 4, 5500); 
        Product p3 = new Product("Oven", 3,70000); 
         
        Store s1 = new Store("Makro", "Karachi");         
        Store s2 = new Store("Hypermart","Karachi"); 
        s1.addProduct(p1);
        s1.addProduct(p2);
        s1.addProduct(p3);
        s1.displayAll(); 
        Product tempProduct = s1.deleteProduct("Bicycle");
        if (tempProduct!=null) 
            System.out.println("Product "+tempProduct.getName()+ " is deleted");
        else
            System.out.println("There is no product to delete");
         s1.displayAll();
         s2.addProduct(p1);
         s2.addProduct(p2);
         s2.addProduct(p3);
         s2.displayAll(); 
         Company c1 = new Company("Unilever");
         c1.addStore(s1);
         c1.addStore(s2);
         c1.displayAll(); 
         int n= c1.searchNbofStore("TV");
         System.out.println("Number of stores have TV "+n); 
         
    } 
} 
