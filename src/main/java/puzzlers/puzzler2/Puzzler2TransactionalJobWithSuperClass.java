package puzzlers.puzzler2;

import static puzzlers.TransactionStatus.*;

public class Puzzler2TransactionalJobWithSuperClass extends Puzzler2SuperClass {

    @Override
    public void runJob() {
        logTransactionStatus(Puzzler2TransactionalJobWithSuperClass.class);
    }
}
