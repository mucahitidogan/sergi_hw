package sergi_hibernate.services;

import sergi_hibernate.entities.Eser;
import sergi_hibernate.entities.Ziyaretci;
import sergi_hibernate.repositories.ZiyaretciDao;

import java.util.Arrays;

public class ZiyaretciService {
    public static void main(String[] args) {
        save();
    }
    static ZiyaretciDao ziyaretciDao = new ZiyaretciDao();
    public static void save() {
        Eser eser1 = new Eser("Eser5");
        Eser eser2 = new Eser("Eser6");
        Eser eser3 = new Eser("Eser7");
        Ziyaretci ziyaretci1 = new Ziyaretci("Ziyaretci1",25,"05555555555", Arrays.asList(eser1,eser2,eser3));
        try {
            ziyaretciDao.save(ziyaretci1);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
