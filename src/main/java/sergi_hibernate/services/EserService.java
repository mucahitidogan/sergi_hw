package sergi_hibernate.services;

import sergi_hibernate.entities.Eser;
import sergi_hibernate.entities.Sanatci;
import sergi_hibernate.entities.Sergi;
import sergi_hibernate.repositories.EserDao;

import java.util.Arrays;

public class EserService {
    public static void main(String[] args) {
        save();
    }
    static EserDao sanatciDao = new EserDao();
    public static void save() {
        Sanatci sanatci1 = new Sanatci("Sanatci1");
        Sergi sergi1 = new Sergi("Sergi7");
        Eser eser1 = new Eser("Eser3",1996,sanatci1,sergi1);
        try {
            sanatciDao.save(eser1);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
