package CRUD_JPA_Hibernate.CRUD_1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CRUD_JPA_Hibernate.CRUD_1.Model.Entity.SLC_Entity;
import CRUD_JPA_Hibernate.CRUD_1.Model.Request.SLC_Request;
import CRUD_JPA_Hibernate.CRUD_1.Repository.SLC_Repository;

@Service
public class SLC_Service {

	private final SLC_Repository SLC_Repo;
    @Autowired
	public SLC_Service(SLC_Repository sLC_Repo) {
		super();
		SLC_Repo = sLC_Repo;
	}
	
//	connect table entity with request for createData
	public SLC_Entity SLC_Create(SLC_Request req) {
		SLC_Entity add = this.SLC_Repo.save(req.requestSLC());
			return add;
	}
	
//	update data from table
	public SLC_Entity updateData(Long id, SLC_Request requ) throws Exception {

		SLC_Entity addInfo = this.SLC_Repo.findById(id).orElseThrow(() -> new Exception());
		addInfo.setChildren(requ.getChildren());
		addInfo.setGirlParent(requ.getGirlParent());
		addInfo.setBoyParent(requ.getBoyParent());
		addInfo.setBrideParent(requ.getBrideParent());
		try {
			 return this.SLC_Repo.save(addInfo);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
//	list all data from table in db
	public List<SLC_Entity> listingData(){
		List<SLC_Entity> list = this.SLC_Repo.findAll();
		return list;
	}
	
//	delete data from table in db
	public SLC_Entity deleteData(Long id) throws Exception {
		SLC_Entity dele = this.SLC_Repo.findById(id).orElseThrow(()-> new Exception());
		 this.SLC_Repo.deleteById(dele.getId());
		 return dele;
	}
	
//	find data one by one 
	public SLC_Entity findOneData(Long id) throws Exception {
		SLC_Entity find = this.SLC_Repo.findById(id).orElseThrow(() -> new Exception());
		return this.SLC_Repo.save(find);
	}
	
}
