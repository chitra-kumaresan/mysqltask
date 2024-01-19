import java.sql.*;

public class jdtask1 {
    public static void main(String[] args) throws Exception {
     //createTable();
        insertValue();
    }
//method to create a table employeee
    public static void createTable() throws Exception {
        String url = "jdbc:mysql://localhost:3306/program";
        String userName = "root";
        String passWord = "root3306";
        String query = "create table employeee(empcode int,empname varchar(20),empage int,empsalary int)";
        try (Connection con = DriverManager.getConnection(url, userName, passWord)) {

            Statement st = con.createStatement();
            st.executeUpdate(query);
            System.out.println("table created");
        }
    }
    //Method to insert multiple values into table
    public static void insertValue() throws Exception {
        String url = "jdbc:mysql://localhost:3306/program";
        String userName = "root";
        String passWord = "root3306";

        try (Connection con = DriverManager.getConnection(url, userName, passWord)) {
            Statement st = con.createStatement();
        String insert1= "insert into employeee values(101,'Jenny',25,10000) ";
        String insert2= "insert into employeee values(102,'Jacky',30,20000) ";
        String insert3= "insert into employeee values(103,'Joe',20,40000) ";

        String insert4= "insert into employeee values(104,'John',40,80000) ";

        String insert5= "insert into employeee values(105,'Shameer',25,90000) ";
        st.addBatch(insert1);
        st.addBatch(insert2);
        st.addBatch(insert3);
        st.addBatch(insert4);
        st.addBatch(insert5);
        st.executeBatch();
            System.out.println("values are inserted");
        }


    }
}


