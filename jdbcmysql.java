import java.sql.*;

public class jdbcmysql {
    public static void main(String[] args) {
  String jdbc_driver = "com.mysql.cj.jdbc.Driver";
      String host = "com.mysql://localhost:3306/studentdb2";
        String username="root";
        String password="";
       String  create_table= """
                CREATE TABLE IF NOT EXSIST student(
                id INT PRIMARY KEY AUTO_INCREMENT,
                name VARCHAR(50),
                course VARCHAR(50),
                mark DECIMAL(10,20)
                )
                """;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver ready");
            String host;
            Connection con= DriverManager.getConnection(host,username,password);
            System.out.println("Host Ready!");
            Statement smt= con.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,//peeche bhi ja skata h agye bhi ja sakta h 2nd ready only h update nhi ho sakta
                    ResultSet.CONCUR_READ_ONLY);

            ResultSet rs= smt.executeQuery("select * from student");
          System.out.println("ID\tName\t\tCourse\t\tMarks");
            while(rs.next()){///while(rd.previous()){
            long marks=rs.getLong("marks");
                if(marks<=70){
                    rs.updateString("marks",Marks+5);
                    rs.updateRow();
                }
              int id=rs.getInt("id")

                      String  name=rs.getString("name");
              String course=rs.getString("Marks");
              System.out.println(String.format("%d\t%s\t%s\t%d",id,name,Marks,course));
          }
            smt.executeUpdate("""
                    
                    insert into student(name,course,marks )values
                    
                    ('Student1','MCA',96.5)
                    """);
            if(rowAffected>0){
                System.out.println("Recode inserted");
            }else{
                System.out.println("Record is not inserted");
            }
            smt.execute(create_table);
            System.out.println("Student table is ready");
        } catch (ClassNotFoundException e | SQLException) {
            {
                e.printStackTrace();
            }
        }
    }
}