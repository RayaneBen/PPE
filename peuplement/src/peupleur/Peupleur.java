package peupleur;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modele.Action;
import modele.Role;
import modele.Utilisateur;

public class Peupleur {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("peuplement");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Utilisateur user = new Utilisateur("dupont.pierre@gmail.com", "dupontp", "Dupont", "Pierre", new Date(),
				"Martin");
		Role role = new Role("magasin", "un magasin du réseau national", new Date(), "Martin");
		Action action = new Action("vendre", "vendre une guitare", new Date(), "Martin");
		role.ajoutAction(action);
		role.ajoutUtilisateur(user);
		em.persist(role);
		// ------------------------------------------------------------------------------------------------------------------------
		Utilisateur user2 = new Utilisateur("kariime.92@hotmail.fr", "karimdamad", "Damad", "Karim", new Date(),
				"MomoDu92");
		Role role2 = new Role("garage", "reparation de vehicules toutes marque", new Date(), "MomoDu92");
		Action action2 = new Action("reparer", "reparation du vehicule", new Date(), "MomoDu92");
		role.ajoutAction(action2);
		role.ajoutUtilisateur(user2);
		em.persist(role2);
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}