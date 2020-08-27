package mypackage.Aug21.Task1;

public class ProductDetails  {
private int ProductID;
private String ProductName;
private int ProductPrice;
public int getProductID() {
	return ProductID;
}
public void setProductID(int productID) {
	ProductID = productID;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public int getProductPrice() {
	return ProductPrice;
}
public void setProductPrice(int productPrice) {
	ProductPrice = productPrice;
}
public ProductDetails(int productID, String productName, int productPrice) {
	super();
	ProductID = productID;
	ProductName = productName;
	ProductPrice = productPrice;
}
public ProductDetails() {
}
public ProductDetails(int i) {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "ProductDetails [ProductID=" + ProductID + ", ProductName=" + ProductName + ", ProductPrice=" + ProductPrice
			+ "]";
}

}