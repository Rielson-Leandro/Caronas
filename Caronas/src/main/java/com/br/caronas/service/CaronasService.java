package com.br.caronas.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

//http://localhost:8080/Caronas/rest/caronas
@Path("caronas")
public class CaronasService {
	
	@GET
	public String exibir(){
		return "Testanto o RestFull(Aprendendo)";
	}

}
