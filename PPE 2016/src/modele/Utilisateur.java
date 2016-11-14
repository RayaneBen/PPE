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
@Table (name="UTILISATEUR")
public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_uti;
	private String nom;
	private String prenom;
	private String email;
	@Temporal (TemporalType.TIMESTAMP)
	private Date derniere_maj;
	private String modifier_par;
	@OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL)
	private List<Role_utilisateur> roles = new ArrayList<>();
	
	public void ajoutRole (Role_utilisateur role) {
		roles.add(role);
		role.setUtilisateur(this);
	}
  	
	public Utilisateur() {
		super();
		
	}

	public Utilisateur(String nom, String prenom, String email, Date derniere_maj, String modifier_par) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.derniere_maj = derniere_maj;
		this.modifier_par = modifier_par;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public List<Role_utilisateur> getRoles() {
		return roles;
	}

	public void setRoles(List<Role_utilisateur> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Utilisateur [id_uti=" + id_uti + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", derniere_maj=" + derniere_maj + ", modifier_par=" + modifier_par + ", roles=" + roles + "]";
	}

	

	
	}
	
	

