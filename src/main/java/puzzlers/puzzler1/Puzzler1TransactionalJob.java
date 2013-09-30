package puzzlers.puzzler1;


import static puzzlers.TransactionStatus.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

public class Puzzler1TransactionalJob {

    private static final Logger LOG = LoggerFactory.getLogger(Puzzler1TransactionalJob.class);

    /**
     * Gets called by Spring Trigger.
     */
    public void runJob() {
        LOG.info("Job started");
        executeJob();
        LOG.info("Job completed normally.");
    }

    @Transactional
    public void executeJob() {
        logTransactionStatus(Puzzler1TransactionalJob.class);
    }
}