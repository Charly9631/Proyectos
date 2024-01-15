package com.pruebas.Dao;

import java.util.List;

import com.pruebas.Modelo.Usuario;

public interface UsuarioDAO {

	void insertarUsuario(Usuario usuario);
	Usuario obtenerUsuario(int id);
	List<Usuario> listarUsuarios();
	void actualizarUsuario(Usuario usuario);
	void eliminarUsuario(int id);
}
