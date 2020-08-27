package mypackage.Aug21.Task5;

import java.sql.Connection;
import java.sql.PreparedStatement;

import mypackage.Aug21.Task2.dbConntProduct;

public class ProductDelete {
	public int deleteProductById(int ProductId){
		try 
		{
		Connection connection=dbConntProduct.getConnect();
		String sql="delete from ProductDetails where ProductID=?";
        PreparedStatement stat=connection.prepareStatement(sql);
        stat.setInt(1, ProductId);
		int res= stat.executeUpdate();
		if(res>0)
		System.out.println("Record Delete");
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		return 0;
}
}
