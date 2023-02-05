package sergi_hibernate.services;

import sergi_hibernate.entities.Eser;
import sergi_hibernate.entities.Muze;
import sergi_hibernate.entities.Sergi;
import sergi_hibernate.repositories.SergiDao;

import java.util.Arrays;

public class SergiService {
    public static void main(String[] args) {
        save();
    }
    static SergiDao sergiDAO = new SergiDao();
    public static void save() {
        Muze muze1 = new Muze("Müze1");
        Eser eser1 = new Eser("Eser1");
        Eser eser2 = new Eser("Eser2");
        Sergi sergi1 = new Sergi("Sergi1","12.04.2023","26.04.2023","Fütüristik Eserler",muze1, Arrays.asList(eser1,eser2));
        try {
            sergiDAO.save(sergi1);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
