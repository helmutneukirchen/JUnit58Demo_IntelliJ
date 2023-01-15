package junit5Demo.moneyTest;
import org.junit.platform.suite.api.*; // Needs at least JUnit 5.8.0

@Suite
@SelectClasses({ MoneyTest.class, MoneyTestWithFixture.class})
public class AlltestsUsingSelectClasses { // Class name uses by intention lower case "test" to avoid being included by .*Test.* pattern!
	// The class remains completely empty,
	// being used only as a holder for the above annotations
}
