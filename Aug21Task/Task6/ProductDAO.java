package mypackage.Aug21.Task6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import mypackage.Aug21.Task1.ProductDetails;
import mypackage.Aug21.Task2.dbConntProduct;

public class ProductDAO{

public ArrayList<ProductDetails> getProductDetails(){
try
{
Connection connection=dbConntProduct.getConnect();
String sql="select * from ProductDetails";
PreparedStatement stat=connection.prepareStatement(sql);
ArrayList<ProductDetails> ProductList=new ArrayList<>();
ResultSet res= stat.executeQuery();
if(res.next())
{
do{
int ProductID= res.getInt(1);
String ProductName= res.getString(2);
int ProductPrice= res.getInt(3);
ProductDetails product=new ProductDetails(ProductID, ProductName, ProductPrice);
ProductList.add(product);
}
while(res.next());
}
return ProductList;
}
catch (Exception e) {
e.printStackTrace();
}
return null;
}
public int UpdateProduct(int productId, ProductDetails product){
	try
	{
	Connection connection=dbConntProduct.getConnect();
	ProductDetails existingproduct= getProductID(productId);
	String sql="update ProductDetails set ProductName=? , ProductPrice=? where ProductID=?";
	PreparedStatement stat=connection.prepareStatement(sql);

	if(product.getProductName()!=null)
	{
	existingproduct.setProductName(product.getProductName());
	}
	if(product.getProductPrice()!=0)
	{
	existingproduct.setProductPrice((product.getProductPrice()));
	}
	stat.setString(1, existingproduct.getProductName());
	stat.setInt(2, existingproduct.getProductPrice());
	stat.setInt(3, productId);
	int res= stat.executeUpdate();
	if(res>0){
	return res;
	}

	}
	catch (Exception e) {
	e.printStackTrace();
	}
	return 0;
	}
private ProductDetails getProductID(int productId) {
	// TODO Auto-generated method stub
	return null;
}
}