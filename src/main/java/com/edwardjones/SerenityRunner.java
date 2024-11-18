package com.edwardjones;

import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;

public class SerenityRunner extends Runner {
    @Override
    public Description getDescription() {
        return null;
    }

    /**
     * Run the tests for this runner.
     *
     * @param notifier will be notified of events while tests are being run--tests being
     *                 started, finishing, and failing
     */
    @Override
    public void run(RunNotifier notifier) {

    }
}
