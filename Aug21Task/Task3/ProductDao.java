package mypackage.Aug21.Task3;

import java.sql.Connection;
import java.sql.PreparedStatement;

import mypackage.Aug21.Task1.ProductDetails;
import mypackage.Aug21.Task2.dbConntProduct;

public class ProductDao{

public String createProduct(ProductDetails product){
try //22 Some CLG 0
{
Connection connection=dbConntProduct.getConnect();

String sql="insert into ProductDetails values(?,?,?)";
PreparedStatement stat=connection.prepareStatement(sql);

stat.setInt(1, product.getProductID());
stat.setString(2, product.getProductName());
stat.setInt(3, product.getProductPrice());

int res= stat.executeUpdate();
if(res>0)
return "Product Ordered";
else
return "Product cannot be Ordered";
}
catch (Exception e) {
e.printStackTrace();
return "Exception "+e;
}


}

}

