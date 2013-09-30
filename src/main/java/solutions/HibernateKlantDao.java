package solutions;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.support.TransactionSynchronizationManager;

class GenericDaoSupport<Type> {

    private HibernateTemplate template;

    public GenericDaoSupport(HibernateTemplate template) {
        this.template = template;
    }

    public final void save(Type type) {
        assertWritableTransactionActive();

        template.saveOrUpdate(type);
    }

    private static void assertWritableTransactionActive() {
        boolean active = TransactionSynchronizationManager.isActualTransactionActive();

        boolean readOnly = TransactionSynchronizationManager.isCurrentTransactionReadOnly();

        if (!(active && !readOnly)) {
            throw new IllegalStateException("There must be an active, not-readonly transaction.");
        }
    }
}

public class HibernateKlantDao extends GenericDaoSupport<Klant> implements  KlantDao {

    @Autowired
    public HibernateKlantDao(HibernateTemplate template) {
        super(template);
    }

    @Override
    public void maakKlantAan(Klant klant) {
        save(klant);
    }
}
