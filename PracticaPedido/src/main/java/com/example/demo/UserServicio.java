package com.example.demo;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserServicio {
	
 private Map<Long,Pedido> pedidos=new HashMap<>();
 public UserServicio() {
  Pedido pedido = new Pedido(1L,352.0, EstadoPedido.ENVIADO,new Date(2024/02/23),null);
  pedidos.put(pedido.getId(), pedido);
  pedido = new Pedido(2L,260.0, EstadoPedido.CREADO,new Date(2023/12/13), null);
  pedidos.put(pedido.getId(), pedido);
  pedido = new Pedido(3L,154.0, EstadoPedido.BORRADO,new Date(2024/03/06), null);
  pedidos.put(pedido.getId(), pedido);
 }

	
	
 public Map<Long,Pedido> getAllPedidos() {
  return pedidos;
 }

	

 public Pedido CrearPedido(Pedido order){
 pedidos.put(order.getId() , order);
     return order;
}
   
   
   public Pedido BuscarPedidoId(long id){
    return pedidos.get(id);
 }
 
 public Pedido ProcesarPedido(long id , EstadoPedido estadodelpedido){
     Pedido pedido;
     pedido= pedidos.get(id);
     pedido.setEstadodelpedido(estadodelpedido);
     return pedido;   
     }
 
 public Pedido BorrarPedido(long id){
     Pedido pedido = pedidos(id);
     if(pedido.getEstadodelpedido() != EstadoPedido.PROCESADO){
         pedidos.remove(id);
     }
	return pedido;
 }



private Pedido pedidos(long id) {
	// TODO Auto-generated method stub
	return null;
}
}