package solutions;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/solutions.xml")
public class HibernateKlantDaoTest {

    @Autowired
    private KlantDao dao;

    @Test
    public void zonderTransaction() {
        Klant klant = new Klant();
        klant.id=1L;
        klant.naam="PIET";

        dao.maakKlantAan(klant);
    }

    @Test
    @Transactional
    public void metTransaction() {
        Klant klant = new Klant();
        klant.id=1L;
        klant.naam="PIET";

        dao.maakKlantAan(klant);
    }
}
