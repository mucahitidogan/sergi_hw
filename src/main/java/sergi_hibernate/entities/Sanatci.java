package sergi_hibernate.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Sanatci {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String sanatciAdi;

    private int dogumYili;

    private int olumYili;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Eser> eserler;

    public Sanatci(String sanatciAdi, int dogumYili, int olumYili, List<Eser> eserler) {
        this.sanatciAdi = sanatciAdi;
        this.dogumYili = dogumYili;
        this.olumYili = olumYili;
        this.eserler = eserler;
    }

    public Sanatci(String sanatciAdi, int dogumYili, List<Eser> eserler) {
        this.sanatciAdi = sanatciAdi;
        this.dogumYili = dogumYili;
        this.eserler = eserler;
    }

    public Sanatci(String sanatciAdi) {
        this.sanatciAdi = sanatciAdi;
    }

    public Sanatci(Integer id) {
        this.id = id;
    }
}


