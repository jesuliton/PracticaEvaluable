package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppPedido {

	@Autowired
	private UserServicio userServicio;

	@GetMapping("/pedidosAll")
	public Map<Long, Pedido> getAllPedidos() {
		return userServicio.getAllPedidos();
	}

	@PostMapping("/crearPedido")
	public Pedido crearPedido(@RequestBody Pedido order) {
		return userServicio.CrearPedido(order);

	}

	@GetMapping("/buscarPedidoId")
	public Pedido buscarPedidoId(@PathVariable long id) {
		return userServicio.BuscarPedidoId(id);
	}

	@PutMapping("/procesarPedido")
	public Pedido procesarPedido(@PathVariable Long id, @RequestParam EstadoPedido status) {
		return userServicio.ProcesarPedido(id, status);
	}

	@DeleteMapping("/borrarPedido")
	public void borrarPedido(@PathVariable Long id) {
		userServicio.BorrarPedido(id);
	}

}
