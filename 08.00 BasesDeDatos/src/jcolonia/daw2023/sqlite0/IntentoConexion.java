package jcolonia.daw2023.sqlite0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class IntentoConexion {
	public static void main(String[] args) {
		String fuente = "jdbc:sqlite:ejemplo001.db";
		try {
			Connection conexión = DriverManager.getConnection(fuente);
			Statement sentenciaSQL = conexión.createStatement();
			//Conexión
			
			sentenciaSQL.setQueryTimeout(5);
			
			sentenciaSQL.executeUpdate("DROP TABLE IF EXISTS Personal");
			sentenciaSQL.executeUpdate(
					"CREATE TABLE Personal (Id INTEGER PRIMARY KEY, Nombre TEXT NOT NULL)");
			//Inserciones
			sentenciaSQL.setQueryTimeout(5);
			
			PreparedStatement preparaciónSQL;
			
			int ids[] = {1,2,3,4,5};
			String nombres[] = { "África", "Björn", "Cristina", "Delfín", "Elena" };
			
			preparaciónSQL = conexión.prepareStatement("INSERT INTO Personal values(?,?)");
			
			for (int i = 0; i < ids.length; i++) {
				preparaciónSQL.setInt(1, ids[i]);
				preparaciónSQL.setString(2, nombres[i]);
				preparaciónSQL.setQueryTimeout(5);
				preparaciónSQL.executeUpdate();
				}
			
			sentenciaSQL.setQueryTimeout(5);
			
			//Consultas
			preparaciónSQL = conexión.prepareStatement("SELECT * from Personal");
			preparaciónSQL.setQueryTimeout(5);
			ResultSet loteDatos = preparaciónSQL.executeQuery();
			
			while (loteDatos.next()) {
				int id = loteDatos.getInt("Id");
				String nombre = loteDatos.getString("Nombre");
				System.out.printf("id= %s, nombre = %s%n", id, nombre);
				}	
			
		} catch (SQLException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
		
			
	}

}
