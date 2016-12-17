package es.uc3m.tiw.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.uc3m.tiw.dominios.Mensaje;

public interface MensajeRepository extends JpaRepository<Mensaje, Long>{

	//List<Mensaje> findByIdReceptor(String idReceptor);

}