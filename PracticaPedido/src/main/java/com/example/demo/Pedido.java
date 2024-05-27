package com.example.demo;

import java.sql.Date;
import java.time.LocalDate;

enum EstadoPedido{
	CREADO,PROCESADO,BORRADO,ENVIADO ;
}
public class Pedido {
  private long id;
  private double precio;
  private EstadoPedido estadodelpedido;
  private Date fecha;
  private Usuario usuario;

  
  public Pedido(long id, double precio, EstadoPedido estadodelpedido, Date fecha, Usuario usuario) {
	super();
	this.id = id;
	this.precio = precio;
	this.estadodelpedido = estadodelpedido;
	this.fecha = fecha;
	this.usuario = usuario;
}


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public double getPrecio() {
	return precio;
}


public void setPrecio(double precio) {
	this.precio = precio;
}


public EstadoPedido getEstadodelpedido() {
	return estadodelpedido;
}


public void setEstadodelpedido(EstadoPedido estadodelpedido) {
	this.estadodelpedido = estadodelpedido;
}


public Date getFecha() {
	return fecha;
}


public void setFecha(Date fecha) {
	this.fecha = fecha;
}


public Usuario getUsuario() {
	return usuario;
}


public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}


@Override
public String toString() {
	return "id=" + id + ", precio=" + precio + ", estadodelpedido=" + estadodelpedido + ", fecha=" + fecha
			+ ", usuario=" + usuario;
}
  
  
  
}
