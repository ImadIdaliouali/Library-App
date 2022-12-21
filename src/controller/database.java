package controller;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class database {
   Connection con;
   Statement stm;
   ResultSet rst;
   ResultSet rstcopy;

   public database() {
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/java", "root", "");
         stm = con.createStatement();
         System.out.println("Connexion au DB bien établie");
      } catch (Exception e) {
         System.out.println("Erreur de chargement de pilote:" + e);
      }
   }

   public int login(String uname, String password){
      try{
         String query = "select count(*) from users where username='" + uname + "' and password = '" + password + "'";
         rst = stm.executeQuery(query);
         int res = 0;
         while(rst.next()) res++;
         return res;
      }
      catch(Exception e){
         System.out.println("Erreur:" + e);
      }
      return 0;
   }

   public void register(String fname,String username, String lname, String email, String password) {
      try {
         String query = "INSERT INTO users VALUES ( null ,'" + username + "','" + password + "', null, '" + fname + "','" + lname + "','" + email +"')";
         stm.executeUpdate(query);
         JOptionPane.showMessageDialog(null, "User added Successfully.....");

      } catch (Exception e) {
         System.out.println("Erreur:" + e);
      }
   }

   public void addbook(int uid, int bid){
      try {
         String query = "update table users set id_books = " + bid + "where id = " + uid;
         stm.executeUpdate(query);
         JOptionPane.showMessageDialog(null, "Book added Successfully to cart.....");

      } catch (Exception e) {
         System.out.println("Erreur:" + e);
      }
   }
   
   public void removebooks(int uid, int bid){
      try {
         String query = "update table users set id_books = null where id = " + uid;
         stm.executeUpdate(query);
         JOptionPane.showMessageDialog(null, "Book removed Successfully from cart.....");
      } catch (Exception e) {
         System.out.println("Erreur:" + e);
      }
   }

   public void deleteuser(int uid, int did) {
      try {
         int admin = stm.executeUpdate("select count(*) from users where id = " + uid + " and admin = 1");
         if(admin!=0){
            int test = stm.executeUpdate("DELETE FROM users where id=" + did);
            if (test != 0) {
               JOptionPane.showMessageDialog(null, "User Deleted Successfully.....");
            } else {
               JOptionPane.showMessageDialog(null, "User not found!!");
            }
         }
      } catch (Exception e) {
         System.out.println("Erreur:" + e);
      }
   }

   public void deletebook(int uid, int bid) {
      try {
         int admin = stm.executeUpdate("select count(*) from users where id = " + uid + " and admin = 1");
         if(admin!=0){
            int test = stm.executeUpdate("DELETE FROM books where id=" + bid);
            if (test != 0) {
               JOptionPane.showMessageDialog(null, "Book Deleted Successfully.....");
            } else {
               JOptionPane.showMessageDialog(null, "Book not found!!");
            }
         }
      } catch (Exception e) {
         System.out.println("Erreur:" + e);
      }
   }

   public void newbook(int uid, String title, String author, String Description, int Stock, String Cathegory) {
      try {
         int admin = stm.executeUpdate("select count(*) from users where id = " + uid + " and admin = 1");
         if(admin!=0){
            stm.executeUpdate("insert into books values ( null,'" + title + "','"+author+"','"+Description + "',"+Stock+",'"+Cathegory+ "')");
            JOptionPane.showMessageDialog(null, "Book Added Successfully.....");
         }
      } catch (Exception e) {
         System.out.println("Erreur:" + e);
      }
   }


   public void chercher(String title) {
      try {
         String query = "select * from books where Title='" + title + "'";
         rst = stm.executeQuery(query);
         rst.last();
         int nbrRow = 0;
         nbrRow = rst.getRow();
         System.out.println(nbrRow);
         if (nbrRow != 0)
            System.out.println("Book Found\t" + nbrRow);
         else
            System.out.println("Book not Found");
      } catch (Exception e) {
         System.out.println("Erreur:" + e);
      }
   }

   public void quitter() {
      try {
         this.stm.close();
         this.con.close();

         System.exit(0);
         System.out.println("Deconnexion du systeme");

      } catch (SQLException ex) {
         Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
      }
   }
}