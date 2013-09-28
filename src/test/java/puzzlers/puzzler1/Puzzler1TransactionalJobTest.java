package puzzlers.puzzler1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/puzzler1-context.xml")
public class Puzzler1TransactionalJobTest {

    @Autowired
    private Puzzler1TransactionalJob job;

    /**
     * Job zal niet transactioneel zijn.
     *
     * <p>De @Transactional annotation zorgt er voor, dat aangeroepen methode Transactioneel wordt. Onder water wordt
     * dit gerealiseerd door AOP Interceptor. Interceptors werken met een runtime, door Spring gegenereerde Proxy.</p>
     * <p>Deze proxy proxied calls tussen beans.</p>
     * <p>Een call naar een methode binnen dezelfde bean, waarbij de aanroepende methode een @Transactional annotation heeft, zal
     * dus niet Transactioneel worden.</p>
     *
     */
    @Test
    public void voerTriggerUit() throws InterruptedException {
        job.jobTrigger();
    }

    /**
     * Test klasse roept rechtstreeks de Transactionele methode aan.
     */
    @Test
    public void callingTransactionalMethodWorks() {
        job.runJob();
    }
}
