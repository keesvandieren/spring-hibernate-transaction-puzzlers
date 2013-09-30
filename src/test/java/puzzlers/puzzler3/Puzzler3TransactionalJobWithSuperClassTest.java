package puzzlers.puzzler3;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/puzzler3-context.xml")
public class Puzzler3TransactionalJobWithSuperClassTest {

    @Autowired
    private Puzzler3TransactionalJobWithSuperClass job;

    /**
     * Niet Transactioneel: final method.
     */
    @Test
    public void runJobRuns() {
        job.runJob();
    }



//    @Autowired
//    private Puzzler3TransactionalJobInterface jobInterface;
//
//    @Test
//    public void runJobInterface() {
//        jobInterface.runJob();
//
//    }


}
