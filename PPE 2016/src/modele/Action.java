package modele;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="action")
public class Action {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_action;
	private String action;
	private Date derniere_maj;
	private String modifier_par;
	private String Description;
	@OneToMany(mappedBy = "action", cascade = CascadeType.ALL)
	private List<Role_action> roles = new ArrayList<>();
	
	public void ajoutRoles(Role_action nouveau){
		roles.add(nouveau);
		nouveau.setAction(this);
		
		
	}
	
	public Action() {
		super();
		
	}

	public Action(String action, Date derniere_maj, String modifier_par, String description) {
		super();
		this.action = action;
		this.derniere_maj = derniere_maj;
		this.modifier_par = modifier_par;
		Description = description;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Date getDerniere_maj() {
		return derniere_maj;
	}

	public void setDerniere_maj(Date derniere_maj) {
		this.derniere_maj = derniere_maj;
	}

	public String getModifier_par() {
		return modifier_par;
	}

	public void setModifier_par(String modifier_par) {
		this.modifier_par = modifier_par;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public List<Role_action> getRole() {
		return roles;
	}

	public void setRole(List<Role_action> role) {
		this.roles = role;
	}

	@Override
	public String toString() {
		return "Action [id_action=" + id_action + ", action=" + action + ", derniere_maj=" + derniere_maj
				+ ", modifier_par=" + modifier_par + ", Description=" + Description + ", role=" + roles + "]";
	}

	
	
	
}
