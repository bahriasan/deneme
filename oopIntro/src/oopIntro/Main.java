package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 =new Product(1,"Lenovo V14",15000, "16 GB RAM"); //Referans olu?turma, instance olu?turma

		
		Product product2 =new Product(); //Referans olu?turma, instance olu?turma
		product2.id=2;
		product2.name="Lenovo V15";
		product2.unitPrice=15000;
		product2.detail="16 GB Ram";
		
		Product product3 =new Product(); //Referans olu?turma, instance olu?turma
		product3.id=3;
		product3.name="Lenovo V16";
		product3.unitPrice=15000;
		product3.detail="16 GB Ram";
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {			
			System.out.println(product.name);
		}
		
		
		System.out.println(products.length);
		
		Category category1=new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		Category category2=new Category();
		category2.id=2;
		category2.name="Ev_Bah?e";
		
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);

	}

}
