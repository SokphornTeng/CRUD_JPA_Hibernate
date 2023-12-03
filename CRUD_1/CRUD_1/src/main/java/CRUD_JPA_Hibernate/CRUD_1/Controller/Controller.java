package CRUD_JPA_Hibernate.CRUD_1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CRUD_JPA_Hibernate.CRUD_1.Model.Entity.SLC_Entity;
import CRUD_JPA_Hibernate.CRUD_1.Model.Request.SLC_Request;
import CRUD_JPA_Hibernate.CRUD_1.Model.Response.SLC_Response;
import CRUD_JPA_Hibernate.CRUD_1.Service.SLC_Service;

@RestController
@RequestMapping("/api/slc")
public class Controller {

	private final SLC_Service SLC_Serv;
    @Autowired
	public Controller(SLC_Service sLC_Serv) {
		super();
		SLC_Serv = sLC_Serv;
	}
	
//	Create data to add into table in db
    @PostMapping
    public ResponseEntity<SLC_Response> createData(@RequestBody SLC_Request requ) throws Exception{
    	SLC_Entity addNew = this.SLC_Serv.SLC_Create(requ);
    		return ResponseEntity.ok(SLC_Response.responseSLC(addNew));	
    }
    
//    update data route
    @PutMapping("/{id}")
    public ResponseEntity<SLC_Response> updates(@PathVariable Long id, @RequestBody SLC_Request req) throws Exception{
    	SLC_Entity upd = this.SLC_Serv.updateData(id, req);
    	return ResponseEntity.ok(SLC_Response.responseSLC(upd));
    }
    
//    listing data
    @GetMapping
    public ResponseEntity<List<SLC_Response>> listing(){
    	List<SLC_Response> listeAll = this.SLC_Serv.listingData().stream().map(SLC_Response::responseSLC).toList();
    	return ResponseEntity.ok(listeAll);
    }
    
//    delete data from table
    @DeleteMapping("/{id}")
    public ResponseEntity<SLC_Response> deleteField(@PathVariable Long id) throws Exception{
    	SLC_Entity deleAll = this.SLC_Serv.deleteData(id);
    	return ResponseEntity.ok(SLC_Response.responseSLC(deleAll));
    }
    
//    find data one by one
    @GetMapping("/{id}")
    public ResponseEntity<SLC_Response> findDataByOne(@PathVariable Long id) throws Exception{
    	SLC_Entity findOne = this.SLC_Serv.findOneData(id);
    	return ResponseEntity.ok(SLC_Response.responseSLC(findOne));
    }
}
