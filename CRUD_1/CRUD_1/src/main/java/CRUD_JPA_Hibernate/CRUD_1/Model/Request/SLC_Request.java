package CRUD_JPA_Hibernate.CRUD_1.Model.Request;

import java.io.Serializable;

import CRUD_JPA_Hibernate.CRUD_1.Model.Entity.SLC_Entity;
import jakarta.persistence.Column;

public class SLC_Request implements Serializable {
	
	private String children;
	private String girlParent;
	private String boyParent;
	private String brideParent;
	
	public SLC_Request(String children, String girlParent, String boyParent, String brideParent) {
		super();
		this.children = children;
		this.girlParent = girlParent;
		this.boyParent = boyParent;
		this.brideParent = brideParent;
	}

	public SLC_Entity requestSLC() {
		SLC_Entity newReq = new SLC_Entity();
		newReq.setChildren(this.children);
		newReq.setGirlParent(this.girlParent);
		newReq.setBoyParent(this.boyParent);
		newReq.setBrideParent(this.brideParent);
		return newReq;
	}

	public String getChildren() {
		return children;
	}

	public void setChildren(String children) {
		this.children = children;
	}

	public String getGirlParent() {
		return girlParent;
	}

	public void setGirlParent(String girlParent) {
		this.girlParent = girlParent;
	}

	public String getBoyParent() {
		return boyParent;
	}

	public void setBoyParent(String boyParent) {
		this.boyParent = boyParent;
	}

	public String getBrideParent() {
		return brideParent;
	}

	public void setBrideParent(String brideParent) {
		this.brideParent = brideParent;
	}

	
}
