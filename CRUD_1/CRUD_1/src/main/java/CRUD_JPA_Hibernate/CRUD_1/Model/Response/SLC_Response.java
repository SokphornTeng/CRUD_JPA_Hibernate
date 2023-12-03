package CRUD_JPA_Hibernate.CRUD_1.Model.Response;

import java.io.Serializable;

import CRUD_JPA_Hibernate.CRUD_1.Model.Entity.SLC_Entity;

public class SLC_Response implements Serializable {

	private Long id;
	private String children;
	private String girlParent;
	private String boyParent;
	private String brideParent;
	
	public SLC_Response(Long id, String children, String girlParent, String boyParent, String brideParent) {
		super();
		this.id = id;
		this.children = children;
		this.girlParent = girlParent;
		this.boyParent = boyParent;
		this.brideParent = brideParent;
	}

	public static SLC_Response responseSLC(SLC_Entity SLCResponses) {
		return new SLC_Response(
				SLCResponses.getId(),
				SLCResponses.getChildren(), 
				SLCResponses.getGirlParent(),
				SLCResponses.getBoyParent(),
				SLCResponses.getBrideParent()
				);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
