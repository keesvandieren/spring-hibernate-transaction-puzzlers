package puzzlers.puzzler3;


import org.springframework.transaction.annotation.Transactional;

public abstract class Puzzler3SuperClass {

    @Transactional
    public final void runJob() {
        runJobInTransaction();
    }

    protected abstract void runJobInTransaction();
}
