import java.sql.*;
public class JDBCDemo {
    public static void main(String args[])throws Exception{
       // readjdbc();
       // insert();
        //prepare();
        //update();
        delete();
    }
    public static void readjdbc()throws Exception{
        String url="jdbc:mysql://localhost:3306/jdbc_con";
        String username="root";
        String password="akila";
        String query="select*from jdbc";
        Connection con=DriverManager.getConnection(url,username,password);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        while(rs.next()){
            System.out.println("Id is:"+rs.getInt(1));
            System.out.println("Name is:"+rs.getString(2));
            System.out.println("Salary:"+rs.getInt(3));
        }con.close();
    }
    public static void insert()throws Exception{
        String url="jdbc:mysql://localhost:3306/jdbc_con";
        String username="root";
        String password="akila";
        String query="insert into jdbc values(5,'akilaa',9000)";
        Connection con=DriverManager.getConnection(url,username,password);
        Statement st=con.createStatement();
        int rows=st.executeUpdate(query);
        System.out.println("Number of row is:"+rows);
        con.close();

    }
    //Variable through INPUT
    public static void prepare()throws Exception{

        String url="jdbc:mysql://localhost:3306/jdbc_con";
        String username="root";
        String password="akila";
        String query="insert into jdbc values(?,?,?);";
        int id=7;
        String name="Ak";int Salary=40000;
        Connection con=DriverManager.getConnection(url,username,password);
        PreparedStatement pst=con.prepareStatement(query);
        pst.setInt(1,id);
        pst.setString(2,name);
        pst.setInt(3,Salary);
        int rows=pst.executeUpdate();
        System.out.println("The Rows:"+rows);
        con.close();
    }
    public static void delete()throws Exception {
        String url = "jdbc:mysql://localhost:3306/jdbc_con";
        String username = "root";
        String password = "akila";
        int id=5;
        String query="delete from jdbc where id="+id;
        Connection con=DriverManager.getConnection(url,username,password);
        Statement st=con.createStatement();
        int rows =st.executeUpdate(query);
        System.out.println("Successfully Deleted"+rows);

    }
    //Update
    public static void update()throws Exception{
        String url="jdbc:mysql://localhost:3306/jdbc_con";
        String username="root";
        String password="akila";
        String query="Update jdbc set salary=1500 where id=4";
        Connection con=DriverManager.getConnection(url,username,password);
        Statement st=con.createStatement();
        int rows=st.executeUpdate(query);
        System.out.println("Updated:"+rows);

    }


}
