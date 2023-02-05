package sergi_hibernate.repositories;

import org.hibernate.Session;
import sergi_hibernate.entities.Sanatci;
import sergi_hibernate.utils.HibernateUtil;

public class SanatciDao implements ICrud<Sanatci> {
    @Override
    public void save(Sanatci sanatci) {
        try (Session session = HibernateUtil.getSessionFactory().openSession();) {
            session.beginTransaction();
            session.save(sanatci);
            session.getTransaction().commit();
            System.out.println("Sanatçı is added");
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
    public void update(Sanatci sanatci) {

    }

    @Override
    public void delete(int id) {

    }
}
