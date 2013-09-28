package puzzlers.puzzler4;

import static puzzlers.TransactionStatus.logTransactionStatus;

public class Puzzler4TransactionalJob extends TransactionalSuperClass {

    public void runJob() {
        logTransactionStatus(Puzzler4TransactionalJob.class);
        jobCalled = true;
    }

    private boolean jobCalled;

    public boolean jobCalled() {
        return jobCalled;
    }

}
