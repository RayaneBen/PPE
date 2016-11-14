package modele;

import java.util.Date;

import javax.annotation.Generated;
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
@Table(name ="Role_Utilisateur")
public class Role_utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_roleU;
	@Temporal (TemporalType.TIMESTAMP)
	private Date derniere_maj;
	private String modifier_par;
	@ManyToOne
	@JoinColumn(name ="Utilisateur_FK")
	private Utilisateur utilisateur;
	@ManyToOne
	@JoinColumn(name ="Role_FK")
	private Role role;
	
	public Role_utilisateur() {
		super();
	
	}

	public Role_utilisateur(Date derniere_maj, String modifier_par, Utilisateur utilisateur, Role role) {
		super();
		this.derniere_maj = derniere_maj;
		this.modifier_par = modifier_par;
		this.utilisateur = utilisateur;
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

	

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Role_utilisateur [id_roleU=" + id_roleU + ", derniere_maj=" + derniere_maj + ", modifier_par="
				+ modifier_par + ", user=" + utilisateur + ", role=" + role + "]";
	}
	
}
