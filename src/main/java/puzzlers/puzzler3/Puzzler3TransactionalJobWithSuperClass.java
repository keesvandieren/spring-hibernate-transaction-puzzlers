package puzzlers.puzzler3;

import static puzzlers.TransactionStatus.*;

public class Puzzler3TransactionalJobWithSuperClass extends Puzzler3SuperClass  {

    @Override
    protected void runJobInTransaction() {
        logTransactionStatus(Puzzler3TransactionalJobWithSuperClass.class);
    }
}
