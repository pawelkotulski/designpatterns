package com.kot.templatemethod;

public abstract class TestRunner {

    public void run() {
        setUp();
        runTest();
        checkAssertion();
        tearDown();
    }

    protected abstract void tearDown();

    protected abstract void checkAssertion();

    protected abstract void runTest();

    protected abstract void setUp();
}
