package CRUD_JPA_Hibernate.CRUD_1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import CRUD_JPA_Hibernate.CRUD_1.Model.Entity.SLC_Entity;
import CRUD_JPA_Hibernate.CRUD_1.Model.Request.SLC_Request;

@Repository
public interface SLC_Repository extends JpaRepository<SLC_Entity, Long> {

	boolean existsByChildren(String children);
	
}
