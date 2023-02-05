package sergi_hibernate.services;

import sergi_hibernate.entities.Eser;
import sergi_hibernate.entities.Sanatci;
import sergi_hibernate.repositories.SanatciDao;

import java.util.Arrays;

public class SanatciService {
    public static void main(String[] args) {
        save();
    }
    static SanatciDao sanatciDao = new SanatciDao();
    public static void save() {
        Eser eser1 = new Eser("Eser8");
        Eser eser2 = new Eser("Eser9");
        Sanatci sanatci1 = new Sanatci("Sanatçı3",1965,2009, Arrays.asList(eser1,eser2));
        try {
            sanatciDao.save(sanatci1);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
