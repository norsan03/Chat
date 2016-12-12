package es.uc3m.tiw.Controladores;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.uc3m.tiw.Daos.MensajeRepository;
import es.uc3m.tiw.Dominios.Mensaje;

@RestController
public class Controlador {
	
	@Autowired
	private MensajeRepository mensajeDao;
	
	
			
	
}
