package es.uc3m.tiw.Daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.uc3m.tiw.Dominios.Mensaje;


public interface MensajeRepository extends JpaRepository<MensajeRepository, Long>{

		void save(Mensaje mensaje);
		
		List<Mensaje> findByIdReceptor(String idReceptor);
		
	}
