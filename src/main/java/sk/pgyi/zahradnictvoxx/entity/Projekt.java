package sk.pgyi.zahradnictvoxx.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="projekty")
@Data
public class Projekt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="klient_id", updatable = false)
    private Integer klientId;

    @Column(name="nazov")
    private String nazov;

    @Column(name="popis")
    private String popis;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(name="datum")
    private Date datum;

    @Column(name="adresaprojektu")
    private String adresaprojektu;

    @Column(name="ukoncene")
    private boolean ukoncene;
}
