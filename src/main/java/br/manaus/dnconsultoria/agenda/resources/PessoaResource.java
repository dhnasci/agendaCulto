package br.manaus.dnconsultoria.agenda.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/produtos")
public class PessoaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		
		return "REST está funcionando";
	}

}
