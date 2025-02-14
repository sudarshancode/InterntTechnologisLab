import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
    Write a program using jdbc api to delete some records form 'student' table created
    previously in database system.
 */
public class Program_011 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String url="jdbc:mysql://localhost:3306/exam";
        String username="root";
        String password="";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                Connection connection= DriverManager.getConnection(url,username,password);

                //Delete particular row
                String deleteRow="DELETE FROM STUDENT WHERE ID=?";
                PreparedStatement preparedStatement=connection.prepareStatement(deleteRow);

                //Take input from user
                System.out.print("Enter id which want to you delete:");
                int id=sc.nextInt();

                preparedStatement.setInt(1,id);

                int rowEffected=preparedStatement.executeUpdate();

                if(rowEffected>0){
                    System.out.print("Row deleted successfully");
                }else{
                    System.out.print("Row is not deleted");
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
