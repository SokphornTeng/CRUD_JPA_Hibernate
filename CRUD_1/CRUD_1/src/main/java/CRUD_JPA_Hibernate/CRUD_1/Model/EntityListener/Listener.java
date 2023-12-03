package CRUD_JPA_Hibernate.CRUD_1.Model.EntityListener;

import java.util.logging.Logger;

import CRUD_JPA_Hibernate.CRUD_1.Model.Entity.SLC_Entity;
import jakarta.persistence.PostLoad;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PostRemove;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreRemove;
import jakarta.persistence.PreUpdate;

public class Listener {
  
	private final Logger log = Logger.getLogger(this.getClass().getName());
	
	@PrePersist
	public void beforeAddData(SLC_Entity slc) {
	 log.info("this lot to see info" + 
	slc.getId() +
	slc.getChildren() +
	slc.getBrideParent()+
	slc.getBoyParent()+
	slc.getGirlParent()
	  );
	}
	@PostPersist
	public void AfterAddData(SLC_Entity slc) {
	 log.info("this lot to see info" + 
	slc.getId() +
	slc.getChildren() +
	slc.getBrideParent()+
	slc.getBoyParent()+
	slc.getGirlParent()
	  );
	}
	@PreUpdate
	public void beforeUpdate(SLC_Entity slc) {
	 log.info("this lot to see info" + 
	slc.getId() +
	slc.getChildren() +
	slc.getBrideParent()+
	slc.getBoyParent()+
	slc.getGirlParent()
	  );
	}
	@PostPersist
	public void AfterUpdate(SLC_Entity slc) {
	 log.info("this lot to see info" + 
	slc.getId() +
	slc.getChildren() +
	slc.getBrideParent()+
	slc.getBoyParent()+
	slc.getGirlParent()
	  );
	}
	@PreRemove
	public void beforRemove(SLC_Entity slc) {
	 log.info("this lot to see info" + 
	slc.getId() +
	slc.getChildren() +
	slc.getBrideParent()+
	slc.getBoyParent()+
	slc.getGirlParent()
	  );
	}
	@PostRemove
	public void afterRemove(SLC_Entity slc) {
	 log.info("this lot to see info" + 
	slc.getId() +
	slc.getChildren() +
	slc.getBrideParent()+
	slc.getBoyParent()+
	slc.getGirlParent()
	  );
	}
	
	@PostLoad
	public void loadData(SLC_Entity slc) {
		 log.info("list all and check condition of listing data" + 
		slc.getId() +
		slc.getChildren() +
		slc.getBrideParent()+
		slc.getBoyParent()+
		slc.getGirlParent()
		  );
		}
}
