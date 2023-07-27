package JDBC;

/*import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.sql.*;*/
import java.sql.*;
import java.util.Scanner;
//import JDBC.emp;

//import JDBC.dbconnection;;
public class dao {
	
	 public static boolean add()
	 {
		 Connection con = dbconnection.getConnection();
		 try 
			{
				PreparedStatement ps = con.prepareStatement("insert into emp1 values(?,?,?)");
				System.out.println("Enter your id :");
				int id = new Scanner(System.in).nextInt();
				
				
				ps.setInt(1, id);
				
				System.out.println("Enter name :");
				ps.setString(2,new Scanner(System.in).nextLine());
				
				System.out.println("Enter salary :");
				int sal = new Scanner(System.in).nextInt();
				ps.setInt(3,sal);

			
				
				int result = ps.executeUpdate();
				
				if(result > 0)
					return true;
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			return false;
	 }
	 
	 
	 
	 public static void view()
		{
			
		
		  //  ArrayList<emp> a =new ArrayList<emp>();
		    
			Connection con = dbconnection.getConnection();
			try 
			{
				PreparedStatement ps = con.prepareStatement("select * from emp1 ");
				ResultSet rs = ps.executeQuery();
				System.out.println();
				System.out.println("ID\t\tNAME\t\tSALARY");
				while(rs.next())
				{
					int id = rs.getInt(1);
					String name  = rs.getString(2);
					int salary = rs.getInt(3);
					System.out.println();
					
					System.out.println(id+"\t\t"+name+"\t\t"+salary);
					
					
					//emp e = new emp(id , name, salary);
				//	a.add(e);
					//Employee e = new Employee(id , name, email , addr , cont_no , address);
					//al.add(e);
				}
				
				//return a;
				
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			//return a;
		}
	 public static boolean delete()
		{
			Connection con = dbconnection.getConnection();
			
			try 
			{
				int h;
				PreparedStatement ps = con.prepareStatement("delete from emp1 where id = ?");
				Scanner kb = new Scanner(System.in);
				System.out.println("Enter ID to delete employee :");
				int id = kb.nextInt();
				System.out.println("do you want to delete??\nPress<1> for Yes <2> for NO :");
				h=kb.nextInt();
				if(h==1)
				{
				
					ps.setInt(1, id);
					int result = ps.executeUpdate();
					if(result > 0)
					{
						return true;
					}
				}
				else
					System.out.println("Try again...");
			} 
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
			
		}
	 public static boolean update()
		{
			
			Connection con =dbconnection.getConnection();
			try 
			{
				PreparedStatement ps = con.prepareStatement("update emp1 set salary = ? where id =?");
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter ID for update detail :");
				int id = scan.nextInt();
				System.out.println("Enter new salary :");
				int sal = scan.nextInt();
				
				ps.setInt(2, id);
				ps.setInt(1, sal);
				
				int result = ps.executeUpdate();
				if(result>0)
					return true;
				
			}
			catch (SQLException e)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
			{
				e.printStackTrace();
			}
			
			
			
			return false;
		}

}

