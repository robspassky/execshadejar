package com.aol.fad.execshadejar;

import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple SampleClass.
 */
public class SampleClassTest {

    @BeforeClass
        static public void oneTimeSetup() {
        }

    @AfterClass
        static public void oneTimeTearDown() {
        }

    @Before
        public void setup() {
        }

    @After
        public void after() {
        }

    @Test
        public void testTheAdd() {
            SampleClass smp = new SampleClass(5);
            int result = smp.add(10);
            assertEquals(15, result);
        }

    @Ignore("Takes too long to run")
        @Test
        public void testLongRunningTask() {
            assertTrue(false);
        }

    @Test(timeout=1000)
        public void timesOutInOneSecond() {
            assertTrue(true);
        }

    @Test(expected=ArithmeticException.class)
        public void testThrowsException() {
            throw new ArithmeticException("Some kind of exception this is.");
        }
}
