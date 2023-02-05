package sergi_hibernate.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Eser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String eserAdi;

    private int yapimYili;
    @ManyToOne(cascade = CascadeType.ALL)
    private Sanatci sanatci;
    @ManyToOne(cascade = CascadeType.ALL)
    private Sergi sergi;

    public Eser(String eserAdi, int yapimYili, Sanatci sanatci, Sergi sergi) {
        this.eserAdi = eserAdi;
        this.yapimYili = yapimYili;
        this.sanatci = sanatci;
        this.sergi = sergi;
    }

    public Eser(String eserAdi) {
        this.eserAdi = eserAdi;
    }
}
