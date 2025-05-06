package src;

import java.sql.*;
import java.util.Scanner;

class DBInsertUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/your_database"; // update db name
        String user = "root";
        String pass = "your_password";

        try {
            Connection con = DriverManager.getConnection(url, user, pass);

            System.out.print("Enter student ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter student Name: ");
            String name = sc.nextLine();

            String insertQuery = "INSERT INTO students (id, name) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(insertQuery);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.executeUpdate();
            System.out.println("Record Inserted!");

            System.out.print("Enter new name for update: ");
            String newName = sc.nextLine();
            String updateQuery = "UPDATE students SET name=? WHERE id=?";
            PreparedStatement ps2 = con.prepareStatement(updateQuery);
            ps2.setString(1, newName);
            ps2.setInt(2, id);
            ps2.executeUpdate();
            System.out.println("Record Updated!");

            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
