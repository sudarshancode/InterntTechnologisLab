import java.sql.*;

/*
    Write a program using jdbc api to create a table 'student' in the database .
    Insert 5 records in the table 'student'. Display all the records.
 */
public class Program_010 {
    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3306/exam";
        String username="root";
        String password="";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                Connection conn= DriverManager.getConnection(url,username,password);
                System.out.println("Connection created successfully");
                Statement stm=conn.createStatement();

                //Table Create
                String createTable="CREATE TABLE IF NOT EXISTS STUDENT("
                        +"ID INT PRIMARY KEY,"
                        +"NAME VARCHAR(30),"
                        +"AGE INT,"
                        +"GRADE CHAR(10)"
                        +");";
                stm.executeUpdate(createTable);
                System.out.println("Create table successfully");

                //Insert data into table
                String insertData="INSERT INTO STUDENT (ID,NAME,AGE,GRADE) VALUES "
                        +"(1,'SUDARSHAN',21,'A'),"
                        +"(2,'RAKESH',20,'B'),"
                        +"(3,'AKASH',29,'C'),"
                        +"(4,'BIJAY',27,'A'),"
                        +"(5,'KIMILA',17,'C'),"
                        +"(6,'KURUK',28,'B')";
               stm.executeUpdate(insertData);
               System.out.print("inserted successfully.");

                String select="SELECT * FROM STUDENT;";
                ResultSet resultSet=stm.executeQuery(select);

                while(resultSet.next()){
                    System.out.println("Id:"+resultSet.getInt("ID")+" " +
                            "Name:"+resultSet.getString("NAME")+" AGE:"
                            +resultSet.getInt("AGE")+" GRADE:"+resultSet.
                            getString("GRADE"));
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
