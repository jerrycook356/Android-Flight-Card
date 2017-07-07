/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author jerry
 */
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;
public class DerbyManip {
    List<Customer> customers;
    
    public Connection getConnection(){
        String dbURL = "jdbc:derby:c:/MyDb";
        String username = "name";
        String password = "pass";
        
        try{
            Connection con = DriverManager.getConnection(dbURL,username,password);
            return con;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error opening database");
            e.printStackTrace();
        }
        return null;
    }
    public List<Customer> getCustomers(){
        String sql = "SELECT * FROM Customers";
        try(Connection con = getConnection();
              PreparedStatement ps =  con.prepareStatement(sql))
        {
            ResultSet rs = ps.executeQuery();
            if(rs.getFetchSize() >= 5000)
            {
                customers =  new LinkedList();
            }
            if(rs.getFetchSize() < 5000)
            {
                customers = new ArrayList();
            }
            while(rs.next()){
                String email = rs.getString("Email");
                String first = rs.getString("FirstName");
                String last = rs.getString("LastName");
                
                Customer c = new Customer(email,first,last);
                customers.add(c);
            }
            
            return customers;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error retrieving Customers");
            e.printStackTrace();
        }
        return null;
    }
    public void addCustomer(Customer c){
        String sql = "INSERT INTO Customers (Email,FirstName,LastName)"+
                     "VALUES(?,?,?)";
        try(Connection con = getConnection();
                PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(1,c.getEmail());
            ps.setString(2,c.getFirstName());
            ps.setString(3,c.getLastName());
            
           ps.executeUpdate();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error adding customer to database");
            e.printStackTrace();
        }
        
    }
    public Customer getCustomer(int index){
        List<Customer> customers = getCustomers();
        Customer c = customers.get(index);
        return c;    
    }
    public void deleteCustomer(Customer c){
        String sql = "DELETE FROM Customers "+
                     "Where Email = ?";
        try(Connection con = getConnection();
                PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(1,c.getEmail());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Customer deleted");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error deleting from database");
            e.printStackTrace();
        }
    }
   public void updateCustomer(Customer c,String originalEmail){
       
       String sql ="UPDATE Customers SET "+
                   "Email = ?,"+
                   "FirstName = ?,"+
                   "LastName = ?"+
                   "WHERE Email = ?";
       
       try(Connection con = getConnection();
               PreparedStatement ps = con.prepareStatement(sql);){
           ps.setString(1,c.getEmail());
           ps.setString(2,c.getFirstName());
           ps.setString(3,c.getLastName());
           ps.setString(4,originalEmail);
           
           ps.executeUpdate();
           
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null,"Error updating database");
           e.printStackTrace();
       }
       
   }
   public void disconnect()
   {
       try{
       DriverManager.getConnection("jdbc:derby:;shutdown =true");
       }catch(SQLException e){}
   }
   public void updateCustomerList(List<Customer>newList){
       customers.clear();
       for(Customer c: newList)
           customers.add(c);
   }
}
