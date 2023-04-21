package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;

public class studentDeleteQuery {
  public static void main(String[]args) {

	  // step-1 load/register driver

	  Connection connection =null;
	  try {

		  Driver driver = new Driver();

		  DriverManager.registerDriver(driver);

		  // create connection

		  String url=("jdbc:mysql://localhost:3306/view");

		  String user= "root";

		  String pass="root";

		  connection = DriverManager.getConnection(url, user, pass);

		  // create statement

		  Statement statement = connection.createStatement();

		  // execute query 

		  String deleteQuery= "DELETE FROM student WHERE ID=125";

		  int tableId=statement.executeUpdate(deleteQuery);

		  if(tableId==1) {

			  System.out.println("Data.... Deleted...");

			  }

		  else {

			  System.err.println("Id is not found");

		  }

	  }

	  catch(SQLException e){

		  e.printStackTrace();

	  } finally {

		  try {

			  connection.close();

		  }

		  catch(SQLException e){

			  e.printStackTrace();

		  }

	  }
  }
}
