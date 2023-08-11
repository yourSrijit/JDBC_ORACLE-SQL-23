package Student_DB;
import javax.print.attribute.standard.RequestingUserName;
import java.sql.*;
import java.util.Scanner;

public class dao {
    public static boolean add(){
        Connection con=dbconnection.getConnection();
        try{
            PreparedStatement ps = con.prepareStatement("insert into aot values(?,?,?,?)");
            System.out.println("Enter the roll no");
            ps.setInt(1,new Scanner(System.in).nextInt());
            System.out.println("Enter name");
            ps.setString(2,new Scanner(System.in).nextLine());
            System.out.println("Enter the stander");
            ps.setInt(3,new Scanner(System.in).nextInt());
            System.out.println("Enter the marks");
            ps.setInt(4,new Scanner(System.in).nextInt());
           if(ps.executeUpdate()>0) {
               System.out.println("Insertion successful");
               return true;
           }

        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    public static boolean delete(){
        Connection con =dbconnection.getConnection();
        try{
            PreparedStatement ps=con.prepareStatement("delete from aot where roll =?");
            System.out.println("Enter the roll of student ypu want to delete");
            int rol=new Scanner(System.in).nextInt();
            ps.setInt(1,rol);
            if(ps.executeUpdate()>0){
                return true;
            }
            else {
                System.out.println("Try again...");
                return false;
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    public static boolean update(){
        Connection con=dbconnection.getConnection();
        try{
            PreparedStatement ps =con.prepareStatement("update aot set name=? where roll=?");
            System.out.println("Enter the roll number you want the update");
            int roll=new Scanner(System.in).nextInt();
            System.out.println("Enter the updated name");
            String name=new Scanner(System.in).nextLine();

            ps.setInt(2,roll);
            ps.setString(1,name);

            if(ps.executeUpdate()>0){
                return true;
            }
            return false;
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return true;
    }
    public static void view(){
        Connection con=dbconnection.getConnection();
        try{
            PreparedStatement ps=con.prepareStatement("select * from aot");
            ResultSet re=ps.executeQuery();
            System.out.println();
            System.out.println("ROLL\t\tNAME\t\tSTANDARD\t\tMARKS");
            while (re.next()){
                int roll=re.getInt(1);
                String name=re.getString(2);
                int std=re.getInt(3);
                int marks=re.getInt(4);
                System.out.println();
                System.out.println(roll+"\t\t"+name+"\t\t"+std+"\t\t"+marks);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

}
