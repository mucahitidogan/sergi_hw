package sergi_hibernate.repositories;

import org.hibernate.Session;
import sergi_hibernate.entities.Ziyaretci;
import sergi_hibernate.utils.HibernateUtil;

public class ZiyaretciDao implements ICrud<Ziyaretci>{
    @Override
    public void save(Ziyaretci ziyaretci) {
        try (Session session = HibernateUtil.getSessionFactory().openSession();) {
            session.beginTransaction();
            session.save(ziyaretci);
            session.getTransaction().commit();
            System.out.println("Ziyaretçi is added");
            session.close();
        }catch (Exception e) {
            e.getStackTrace();
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void getAll() {

    }

    @Override
    public void getById(int id) {

    }

    @Override
    public void update(Ziyaretci ziyaretci) {

    }

    @Override
    public void delete(int id) {

    }
}
