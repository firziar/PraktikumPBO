/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presistent;

/**
 *
 * @author firzi
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();

        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Buat koneksi
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PBO", "root", "anjir123");

        // Gunakan PreparedStatement untuk query
        String query = "INSERT INTO person(name) VALUES (?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, name);

        // Eksekusi query
        ps.executeUpdate();

        // Tutup resource
        ps.close();
        con.close();
    }
}