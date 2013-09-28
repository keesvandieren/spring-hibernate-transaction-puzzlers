package puzzlers.puzzler2;

import org.springframework.transaction.annotation.Transactional;

public abstract class Puzzler2SuperClass {

    @Transactional
    public abstract void runJob();
}
