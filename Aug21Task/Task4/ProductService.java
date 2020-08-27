package mypackage.Aug21.Task4;

import java.util.ArrayList;

import mypackage.Aug21.Task1.ProductDetails;
import mypackage.Aug21.Task3.ProductDao;
import mypackage.Aug21.Task5.ProductDelete;
import mypackage.Aug21.Task6.ProductDAO;

public class ProductService {
public static void main(String[] args) {
ProductDetails product=new ProductDetails(1015,"Bun",500);
ProductDao dao=new ProductDao();
System.out.println(dao.createProduct(product));
ProductDetails product1=new ProductDetails(1013,"Bread",100);
ProductDao dao1=new ProductDao();

System.out.println(dao1.createProduct(product1));
ProductDelete delete1=new ProductDelete();
delete1.deleteProductById(1012);

ProductDAO DAO=new ProductDAO();
ArrayList<ProductDetails> ProductList= DAO.getProductDetails();
for(ProductDetails PDT:ProductList)
{
System.out.println(PDT);
}
}
}