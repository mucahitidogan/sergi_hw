package sergi_hibernate.repositories;

import org.hibernate.Session;
import sergi_hibernate.entities.Eser;
import sergi_hibernate.entities.Sanatci;
import sergi_hibernate.utils.HibernateUtil;

public class EserDao implements ICrud<Eser>{

    @Override
    public void save(Eser eser) {
        try (Session session = HibernateUtil.getSessionFactory().openSession();) {
            session.beginTransaction();
            session.save(eser);
            session.getTransaction().commit();
            System.out.println("Eser is added");
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
    public void update(Eser eser) {

    }

    @Override
    public void delete(int id) {

    }
}
