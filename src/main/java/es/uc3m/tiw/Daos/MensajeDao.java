package es.uc3m.tiw.Daos;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;


public interface MensajeDao extends JpaRepository<MensajeDao, Long>{
		ArrayList<MensajeDao> find(long IdEmisor, long IdReceptor, long IdProducto);
		
	}
