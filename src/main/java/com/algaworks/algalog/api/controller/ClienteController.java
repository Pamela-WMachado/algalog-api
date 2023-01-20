package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	//anotação spring com parametro clientes
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Casimiro da Silveiraaaaa");
		cliente1.setEmail("casi@email.com");
		cliente1.setTelefone("21 96584-8897");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Raíssa Pereira");
		cliente2.setEmail("pereira@email.com");
		cliente2.setTelefone("48 78977-8899");
		
		return Arrays.asList(cliente1, cliente2);
		
	}
}
