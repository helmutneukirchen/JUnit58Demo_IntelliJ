package allTests;
import org.junit.platform.suite.api.*; // Needs at least JUnit 5.8.0

import exceptionTest.DivisionByZeroTest;

@Suite
@SelectClasses({ junit5Demo.moneyTest.AlltestsUsingSelectClasses.class, DivisionByZeroTest.class })
public class AlltestsUsingSelectClasses { // Class name uses by intention lower case "test" to avoid being included by .*Test.* pattern!
	// The class remains completely empty,
	// being used only as a holder for the above annotations
}
