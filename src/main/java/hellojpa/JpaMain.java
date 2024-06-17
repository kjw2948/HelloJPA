package hellojpa;

import jakarta.persistence.*;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

            //비영속 상태
            Member member = new Member();
            member.setId(100L);
            member.setName("HelloJPA");

            //엔티티 영속
            System.out.println("==== BEFORE =====");
            em.persist(member);  // 영속 상태가 됨 --> Entity Manager를 통해 member를 관리함
            System.out.println("==== AFTER =====");

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        //code
        emf.close();
    }
}
