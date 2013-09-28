package puzzlers;


import org.slf4j.LoggerFactory;
import org.springframework.transaction.support.TransactionSynchronizationManager;

public class TransactionStatus {

    public static void logTransactionStatus(Class<?> clazz) {

        boolean active = TransactionSynchronizationManager.isActualTransactionActive();

        boolean readOnly = TransactionSynchronizationManager.isCurrentTransactionReadOnly();

        LoggerFactory.getLogger(clazz).info("Is Transaction active? {}, readOnly? {}", active, readOnly);
    }

}
