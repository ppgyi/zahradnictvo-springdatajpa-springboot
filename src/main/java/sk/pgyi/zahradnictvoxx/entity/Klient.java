package sk.pgyi.zahradnictvoxx.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="klienti")
@Getter
@Setter
public class Klient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="meno")
    private String meno;

    @Column(name="priezvisko")
    private String priezvisko;

    @Column(name="adresa")
    private String adresa;

    @Column(name="telefon")
    private String telefon;

    @Column(name="email")
    private String eMail;
}
