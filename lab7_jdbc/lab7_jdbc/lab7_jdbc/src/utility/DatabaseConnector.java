/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;
import java.sql.*;
import java.util.ArrayList;
import model.Patient;
/**
 *
 * @author Harshshah
 */
public class DatabaseConnector {
      private static final String DB_URL = "jdbc:mysql://localhost:3306/medicaldb?useSSL=false";
  private static final String DB_USERNAME = "root";
  private static final String DB_PASSWORD = "";
  
  public static void addPatient(Patient p1) throws SQLException{
        String query ="INSERT INTO patient(name, gender, patient_type, age, lastname, email) VALUES (?, ?, ?, ?, ?, ?)";
      try{
          Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
          PreparedStatement stmt = conn.prepareStatement(query);
          stmt.setString(1, p1.getName());
          stmt.setString(2, p1.getGender());
          stmt.setString(3, p1.getPatientType());
          stmt.setString(4, p1.getAge());
          stmt.setString(5, p1.getLastname());
          stmt.setString(6, p1.getEmail());
//          stmt.setString(7, p1.getMessage());
          
          int rows = stmt.executeUpdate();
          System.out.println("Rows inserted:"+rows);
          conn.close();
      } catch (SQLException sqle) {
          System.out.println("SQL Exception");
          System.out.println(sqle);
      }
      
  }
  public static ArrayList<Patient> getPatients(){
      ArrayList <Patient>patients = new ArrayList();
      String query = "SELECT * FROM patient";
      try{
           Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
           Statement stmt = conn.createStatement();
           stmt.executeQuery(query);
           ResultSet rs = stmt.executeQuery(query);
           while(rs.next()){
               Patient p1= new Patient();
               p1.setId(rs.getInt("id"));
               p1.setName(rs.getString("Name"));
               p1.setPatientType(rs.getString("patient_type"));
               p1.setLastname(rs.getString("lastname"));
               p1.setGender(rs.getString("gender"));
               p1.setAge(rs.getString("age"));
               p1.setEmail(rs.getString("email"));
//               p1.setMessage(rs.getString("message"));
               patients.add(p1);
           }
           rs.close();
           conn.close();
      }catch (SQLException sqle) {
          System.out.println("SQL Exception");
          System.out.println(sqle);
      }
      
     return patients;
  }
  public static void updatePatient(Patient oldPatient, Patient updatedPatient){
      String query = "UPDATE patient SET name = ?, gender = ?, patient_type = ?, lastname = ?, age = ?, email = ? WHERE id = ?";
      try{
          Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
          PreparedStatement stmt = conn.prepareStatement(query);
          stmt.setString(1, updatedPatient.getName());
           stmt.setString(2, updatedPatient.getGender());
            stmt.setString(3, updatedPatient.getPatientType());
             stmt.setString(4, updatedPatient.getLastname());
              stmt.setString(5, updatedPatient.getAge());
               stmt.setString(6, updatedPatient.getEmail());
//                stmt.setString(7, updatedPatient.getMessage());
                stmt.setInt(7, oldPatient.getId());
                int rows = stmt.executeUpdate();
                System.out.println("Rows updated: "+rows);
           conn.close();
      } catch (SQLException sqle) {
          System.out.println("SQL Exception");
          System.out.println(sqle);
      }
  }
  public static void deletePatient(Patient p1){
      String query = "DELETE FROM patient WHERE id = ?";
     try{
         Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
         PreparedStatement stmt = conn.prepareStatement(query);
         stmt.setInt(1, p1.getId());
         int rows = stmt.executeUpdate();
         System.out.println("Rows deleted:"+rows);
         conn.close();
     } catch (SQLException sqle) {
          System.out.println("SQL Exception");
          System.out.println(sqle);
      }
  }
}
