package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private String nombre;
  private String apellido;
  private int telefono;
  private String email;
  private String direccion;
  
  private List<Usuario>usuarios=new ArrayList<>();
  public Usuario() {
  Usuario usuario1 =new Usuario("pepe","lopez",633254215,"pepe@gmail.com","Mula");
  usuarios.add(usuario1);
  Usuario usuario2 =new Usuario("susana","rosa",623658475,"susana@gmail.com","Murcia");
  usuarios.add(usuario2);
  }
public Usuario(String nombre, String aoellido, int telefono, String email, String direccion) {
	super();
	this.nombre = nombre;
	this.apellido = aoellido;
	this.telefono = telefono;
	this.email = email;
	this.direccion = direccion;
	this.usuarios=usuarios;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getAoellido() {
	return apellido;
}
public void setAoellido(String aoellido) {
	this.apellido = aoellido;
}
public int getTelefono() {
	return telefono;
}
public void setTelefono(int telefono) {
	this.telefono = telefono;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public List<Usuario> getUsuarios() {
	return usuarios;
}
public void setUsuarios(List<Usuario> usuarios) {
	this.usuarios = usuarios;
}
@Override
public String toString() {
	return "nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", email=" + email
			+ ", direccion=" + direccion ;
}
  
  
}
