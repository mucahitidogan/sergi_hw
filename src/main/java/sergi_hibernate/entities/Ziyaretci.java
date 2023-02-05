package sergi_hibernate.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Ziyaretci {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String ziyaretciAdi;

    private int yas;

    private String telNo;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Eser> eserler;

    public Ziyaretci(String ziyaretciAdi, int yas, String telNo, List<Eser> eserler) {
        this.ziyaretciAdi = ziyaretciAdi;
        this.yas = yas;
        this.telNo = telNo;
        this.eserler = eserler;
    }

    public Ziyaretci(Integer id) {
        this.id = id;
    }
}
