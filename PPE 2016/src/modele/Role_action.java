package modele;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name ="Role_action")
public class Role_action {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_roleA;
	@Temporal (TemporalType.TIMESTAMP)
	private Date derniere_maj;
	private String modifier_par;
	@ManyToOne
	@JoinColumn(name ="Role_FK")
	private Role role;
	@ManyToOne
	@JoinColumn(name ="actionFK")
	private Action action;
	
	
	public Role_action() {
		super();
		
	}


	public Role_action(Date derniere_maj, String modifier_par) {
		super();
		this.derniere_maj = derniere_maj;
		this.modifier_par = modifier_par;
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


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public Action getAction() {
		return action;
	}


	public void setAction(Action action) {
		this.action = action;
	}


	@Override
	public String toString() {
		return "Role_action [id_roleA=" + id_roleA + ", derniere_maj=" + derniere_maj + ", modifier_par=" + modifier_par
				+ ", role=" + role + ", action=" + action + "]";
	}

	
	
}
