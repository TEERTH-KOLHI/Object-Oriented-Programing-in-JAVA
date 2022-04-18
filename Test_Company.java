/* A company manages many stores. Each Store contains many Products. The UML diagram of this company system is represented as follow. 
 
Class Store: 
Attribute: name, location, productList, nbProduct Constructor: Store (name: String, location: String): Method: 
addProduct() that adds a new product. Maximum 100 products can be added. searchProduct() that accepts the name of product and return True if exist, False otherwise. deleteProduct() that accepts the name of product that has to be deleted and returns the deleted object. 
displayAll() prints the name of products available in store. 
Class Company: 
Attribute: name, arrayStore, nbStore Constructor: Company (name: string): Method: 
addStore() that adds a new Store. Maximum 10 stores can be added. 
searchNbofStore()  that accepts the name of product and returns the number of stores containing the product. displayAll() prints the name of stores belongs to company. 

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
public class Test_Company{
	public static void main(String...args){
		
	}
}
