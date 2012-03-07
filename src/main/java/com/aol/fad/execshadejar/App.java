package com.aol.fad.execshadejar;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

/**
 * Hello world!
 *
 */
public class App {

    @Parameter(names = "-value", description = "Value to add")
    private int value;

    @Parameter(names = "-base", description = "Base value")
    private int base;

    public static void main( String[] args ) {
        App app = new App();
        new JCommander(app, args);

        SampleClass smp = new SampleClass(app.base);

        System.out.println( "Hello World!" + smp.add(app.value) );
    }
}
