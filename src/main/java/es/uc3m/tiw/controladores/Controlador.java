package es.uc3m.tiw.controladores;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.uc3m.tiw.daos.MensajeRepository;
import es.uc3m.tiw.dominios.Mensaje;

@RestController
public class Controlador {
	
	@Autowired
	private MensajeRepository mensajeDao;
	
	@RequestMapping(value = "/guardarMensaje", method = RequestMethod.POST)
	public Mensaje guardarMensaje(@RequestParam Mensaje mensaje){
		mensajeDao.save(mensaje);
		if (mensajeDao.findAll() == null) return null;
		return mensaje;
	}
	
   @RequestMapping(value="/bandejaEntrada/{idReceptor}", method=RequestMethod.GET)
    public List<Mensaje> MensajesRecibidos(@PathVariable String emailReceptor){
    		List<Mensaje> MensajesRecibidos = mensajeDao.findByIdReceptor(emailReceptor);
    		if (MensajesRecibidos.isEmpty()) return null;
    		return MensajesRecibidos;
    }
    
}