package relationships;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("book_author_pu");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // Create authors
        Author author1 = new Author("J.K. Rowling");
        Author author2 = new Author("Stephen King");

        // Create books
        Book book1 = new Book("Harry Potter");
        Book book2 = new Book("The Shining");

        // Establish relationships
        book1.addbook(author1);
        book2.addbook(author2);

        // Persist entities
        em.persist(author1);
        em.persist(author2);
        em.persist(book1);
        em.persist(book2);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
