package solutions;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Klant {

    @Id
    public Long id;

    @Column(unique = true)
    public String naam;

}
