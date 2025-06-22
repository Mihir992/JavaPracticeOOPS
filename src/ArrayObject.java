public class ArrayObject {
    public static void main(String[] args) {
        Product[] obj = new Product[5] ;
    //create & initialize actual product objects using constructor
    obj[0] = new Product(23907,"Dell Laptop");
    obj[1] = new Product(91240,"HP 630");
    obj[2] = new Product(29823,"LG OLED TV");
    obj[3] = new Product(11908,"MI Note Pro Max 9");
    obj[4] = new Product(43590,"Kingston USB");
    //display the product object data
    System.out.println("Product Object 1:");
        obj[0].display();
    System.out.println("Product Object 2:");
        obj[1].display();
    System.out.println("Product Object 3:");
        obj[2].display();
    System.out.println("Product Object 4:");
        obj[3].display();
    System.out.println("Product Object 5:");
        obj[4].display();
    }
}
class Product {
    int productId;
    String productName;

    Product(int id, String name) {
        productId = id;
        productName = name;
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
    }
}
