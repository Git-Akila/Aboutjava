import java.sql.*;
public class jdbc{
public static void main(String args[]){
String url="jdbc:mysql://localhost:3306/jdbc_con";
        String username="root";
        String password="akila";
        String query="select*from jdbc";
        Connection con=DriverManager.getConnection(url,username,password);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        while(rs.next())
        {
            System.out.println("ID is:"+rs.getInt(1));
            System.out.println("Name is:"+rs.getString(2));
            System.out.println("Salary is:"+rs.getInt(3));
            
        }
        con.close();
}
}
