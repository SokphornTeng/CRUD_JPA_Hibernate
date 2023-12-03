package CRUD_JPA_Hibernate.CRUD_1.Model.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SLC_Center")
public class SLC_Entity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="kid", length = 30, unique = true)
	private String children;
	@Column(name="Girl_Parent", length = 50)
	private String girlParent;
	@Column(name="Boy_Parent", length = 50)
	private String boyParent;
	@Column(name="Bride_Parent", length = 50)
	private String brideParent;
	
	
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
