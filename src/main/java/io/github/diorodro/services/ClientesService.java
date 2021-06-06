package io.github.diorodro.services;

import org.springframework.stereotype.Service;

import io.github.diorodro.models.Cliente;
import io.github.diorodro.repositories.ClientesRepository;

@Service
public class ClientesService {

	private ClientesRepository repository;
	
	public ClientesService(ClientesRepository repository) {
		this.repository = repository;
	}
	
	public void  salvarCliente(Cliente cliente) {
		validarCliente(cliente);
		this.repository.persistir(cliente);
	}

	private void validarCliente(Cliente cliente) {
		// valida cliente
	}
	
}
