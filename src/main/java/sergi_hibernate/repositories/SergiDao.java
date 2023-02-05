package sergi_hibernate.repositories;

import org.hibernate.Session;
import sergi_hibernate.entities.Sergi;
import sergi_hibernate.utils.HibernateUtil;

public class SergiDao implements ICrud<Sergi>{
    @Override
    public void save(Sergi sergi) {
        try (Session session = HibernateUtil.getSessionFactory().openSession();) {
            session.beginTransaction();
            session.save(sergi);
            session.getTransaction().commit();
            System.out.println("Sergi is added");
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
    public void update(Sergi sergi) {

    }

    @Override
    public void delete(int id) {

    }
}
