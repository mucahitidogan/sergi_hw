package sergi_hibernate.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Sergi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String sergiAdi;

    private String baslangicTarihi;

    private String bitisTarihi;

    private String sergiKonusu;
    @ManyToOne(cascade = CascadeType.ALL)
    private Muze muze;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Eser> eserler;

    public Sergi(String sergiAdi, String baslangicTarihi, String bitisTarihi, String sergiKonusu, Muze muze, List<Eser> eserler) {
        this.sergiAdi = sergiAdi;
        this.baslangicTarihi = baslangicTarihi;
        this.bitisTarihi = bitisTarihi;
        this.sergiKonusu = sergiKonusu;
        this.muze = muze;
        this.eserler = eserler;
    }

    public Sergi(String sergiAdi) {
        this.sergiAdi = sergiAdi;
    }

    public Sergi(Integer id) {
        this.id = id;
    }
}
