package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String naam;
    private String klas;

    public Student(){
    }

    public Long getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public String getKlas() {
        return klas;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setKlas(String klas) {
        this.klas = klas;
    }

    public Student(Long id, String naam, String klas){}

}
