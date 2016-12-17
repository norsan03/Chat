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
		return mensaje;
	}
	
  /*  @RequestMapping(value="/listarMensajes/{idReceptor}", method=RequestMethod.GET)
    public List<Mensaje> listarMensajes(@PathVariable String IdReceptor){
    		List<Mensaje> listaMensajes = mensajeDao.findByIdReceptor(IdReceptor);
    		if (listaMensajes.isEmpty()){
    			return null;
    		}
    		return listaMensajes;
    }
    */
}
