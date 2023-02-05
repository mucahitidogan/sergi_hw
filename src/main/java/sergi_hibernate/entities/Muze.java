package sergi_hibernate.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Muze {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String muzeAdi;

    private String sehir;

    private String acilisSaati;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Sergi> sergiler;

    public Muze(String muzeAdi, String sehir, String acilisSaati, List<Sergi> sergiler) {
        this.muzeAdi = muzeAdi;
        this.sehir = sehir;
        this.acilisSaati = acilisSaati;
        this.sergiler = sergiler;
    }

    public Muze(String muzeAdi) {
        this.muzeAdi = muzeAdi;
    }

    public Muze(Integer id) {
        this.id = id;
    }
}
