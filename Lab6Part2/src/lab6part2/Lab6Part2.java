/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6part2;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Maryam
 */
public class Lab6Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
try
       {
           //loading the jdbc driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
           //get a connection to database
           Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/University","root","");
           

Scanner input=new Scanner(System.in);
System.out.println("Choose an option");
System.out.println("1.Display all records");
System.out.println("2.Delete a record");
System.out.println("3.Search a record");
int inp=input.nextInt();
//display record
//create a statement
           if(inp==1){
           Statement stmt=(Statement) myConn.createStatement();
           //execute sql query
           ResultSet rs=stmt.executeQuery("select * from Student");
           //process the result
      //     System.out.println("ID Name  Class Section");
           while(rs.next())
           {
               System.out.println(rs.getString("id")+" "+"  "+rs.getString("regno")+" "+rs.getString("name")+"    "+rs.getString("class")+"    "+rs.getString("section")+"  "+rs.getString("contact")+" "+"  "+rs.getString("address"));
           }          
       }
       if(inp==2){
       System.out.println("Enter the ID of student you want to delete:");
       int ids=input.nextInt();
       Statement stmt1=(Statement) myConn.createStatement();
           //execute sql query
                int rs=stmt1.executeUpdate("DELETE FROM Student WHERE ID='"+ids+"'");
                System.out.println("No. of Records deleted: "+rs);
       }
       if(inp==3){
        System.out.println("Enter the ID of student you want to search:");
        int id1=input.nextInt();
        Statement stmt2=(Statement) myConn.createStatement();
           //execute sql query
           ResultSet rs=stmt2.executeQuery("select * from Student where ID='"+id1+"'");
           //process the result
      //     System.out.println("ID Name  Class Section");
      
           if(!rs.isBeforeFirst()){
           System.out.println("Record not found");
           }
           while(rs.next())
           {
               System.out.println(rs.getString("id")+" "+"  "+rs.getString("regno")+" "+rs.getString("name")+"    "+rs.getString("class")+"    "+rs.getString("section")+"  "+rs.getString("contact")+" "+"  "+rs.getString("address"));
           
           }  
            
                 
       }
       
       }
       catch(SQLException e)
       {
           System.out.println(e);   
       }
       catch(Exception e)
       {
           System.out.println(e);
       }    



    }


}
    

