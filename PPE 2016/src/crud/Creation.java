package crud;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modele.Utilisateur;




public class Creation {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PPE");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Utilisateur u1 = new Utilisateur("Ben Messaoud", "rayane", "rayane.benmessaoud@outlook.fr", new Date(), "Rayy");
		Action a1
		
		em.persist(u1);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}