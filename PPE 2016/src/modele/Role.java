package modele;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name ="Role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_role;
	private String role;
	@Temporal (TemporalType.TIMESTAMP)
	private Date derniere_maj;
	private String modifier_par;
	private String Description;
	@OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
	private List<Role_utilisateur> role_U = new ArrayList<>();
	@OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
	private List<Role_action> role_A = new ArrayList<>();
	
	
	public void ajoutRoles(Role_action nouveau){
		role_A.add(nouveau);
		nouveau.setRole(this);
		
	}
	public void ajoutRoles2(Role_utilisateur nouveau){
		role_U.add(nouveau);
		nouveau.setRole(this);
	}
	
	public Role() {
		super();
		
	}
	
	

	public Role(String role, Date derniere_maj, String modifier_par, String description) {
		super();
		this.role = role;
		this.derniere_maj = derniere_maj;
		this.modifier_par = modifier_par;
		Description = description;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	public List<Role_utilisateur> getRole_U() {
		return role_U;
	}

	public void setRole_U(List<Role_utilisateur> role_U) {
		this.role_U = role_U;
	}

	public List<Role_action> getRole_A() {
		return role_A;
	}

	public void setRole_A(List<Role_action> role_A) {
		this.role_A = role_A;
	}

	@Override
	public String toString() {
		return "Role [id_role=" + id_role + ", role=" + role + ", derniere_maj=" + derniere_maj + ", modifier_par="
				+ modifier_par + ", Description=" + Description + ", role_U=" + role_U + ", role_A=" + role_A + "]";
	}
	
	
	
}
