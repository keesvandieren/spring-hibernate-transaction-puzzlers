package puzzlers.puzzler1;


import static puzzlers.TransactionStatus.*;

import org.springframework.transaction.annotation.Transactional;

public class Puzzler1TransactionalJob {

    public void jobTrigger() {
        runJob();
    }

    @Transactional
    public void runJob() {
        logTransactionStatus(Puzzler1TransactionalJob.class);
    }
}