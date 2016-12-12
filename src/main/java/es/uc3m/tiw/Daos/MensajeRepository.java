package es.uc3m.tiw.Daos;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;


public interface MensajeRepository extends JpaRepository<MensajeRepository, Long>{
		ArrayList<MensajeRepository> find(long IdEmisor, long IdReceptor, long IdProducto);
		
	}
