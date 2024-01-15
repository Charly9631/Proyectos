package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Database;

public class UsuarioDAO implements Metodos {

	Connection con=null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	Database db = new Database();
	
	Usuario usuario = null;
	
	String resultado = null;
	
	@Override
	public Usuario obtenerUsuario(int id) {
		String query ="SELECT * FROM USUARIO WHERE ID_USUARIO= "+id;
		try {
			Class.forName(db.getDriver());
			con=DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			ps=con.prepareStatement(query);

			rs=ps.executeQuery();
			while(rs.next()) {
				usuario= new Usuario(rs.getInt(1),
						rs.getString(2));
				
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return usuario;
	}

	@Override
	public String guardar(Object ob) {
		usuario=(Usuario) ob;
		String query ="INSERT INTO USUARIO VALUES(?,?)";
		try {
			Class.forName(db.getDriver());
			con=DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			ps=con.prepareStatement(query);
			
			ps.setInt(1, usuario.getId());
			ps.setString(2, usuario.getNombre());
			
			int flag = ps.executeUpdate();
			if(flag==1) {
				resultado="1";
				System.out.println("Registro insertado correctamente");
			}else {
				resultado="0";
				System.out.println("Hubo un error");
			}
		}catch(Exception e) {
			resultado=e.getMessage();
		}
		return resultado;
		
	}

	@Override
	public String actualizar(Object ob) {
		usuario=(Usuario) ob;
		String query ="UPDATE USUARIO SET NOMBRE=? WHERE ID_USUARIO=?";
		try {
			Class.forName(db.getDriver());
			con=DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			ps=con.prepareStatement(query);
			
			ps.setString(1, usuario.getNombre());
			ps.setInt(2, usuario.getId());
			
			int flag = ps.executeUpdate();
			if(flag==1) {
				resultado="1";
				System.out.println("Registro modificado correctamente");
			}else {
				resultado="0";
				System.out.println("Hubo un error");
			}
		}catch(Exception e) {
			resultado=e.getMessage();
		}
		return resultado;
	}

	@Override
	public String eliminar(int id) {
		String query ="DELETE FROM USUARIO WHERE ID_USUARIO= "+id;
		try {
			Class.forName(db.getDriver());
			con=DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			ps=con.prepareStatement(query);
			
			int flag = ps.executeUpdate();
			if(flag==1) {
				resultado="1";
				System.out.println("Registro eliminado correctamente");
			}else {
				resultado="0";
				System.out.println("Hubo un error");
			}
		}catch(Exception e) {
			resultado=e.getMessage();
		}
			
		return resultado;
		
	}

	
}
