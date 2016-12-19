package es.uc3m.tiw.controladores;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import es.uc3m.tiw.daos.MensajeRepository;
import es.uc3m.tiw.dominios.Mensaje;

@RestController
public class Controlador {
	
	@Autowired
	private MensajeRepository mensajeDao;
	
	
	@RequestMapping(value = "/guardarMensaje/{idEmisor}/{idReceptor}", method = RequestMethod.POST)
	public Mensaje guardarMensaje(@RequestBody Mensaje mensaje, @PathVariable String idEmisor,@PathVariable String idReceptor){
	
		mensaje.setIdEmisor(idEmisor);
		mensaje.setIdReceptor(idReceptor);
		mensajeDao.save(mensaje);
		
		if (mensajeDao.findAll() == null) return null;
		return mensaje;
	}
	
	@RequestMapping(value="/bandejaEntrada/{id}", method=RequestMethod.GET)
    public @ResponseBody List<Mensaje> MensajesRecibidos(@PathVariable int id){
			
		//String idString = Integer.toString(id);
		List<Mensaje> BandejaEntrada = mensajeDao.findAll();
		
		
		return BandejaEntrada;
    }
    
}