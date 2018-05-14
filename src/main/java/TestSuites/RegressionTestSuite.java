package TestSuites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testcase.LoginTestCase;

@RunWith(Suite.class)
@SuiteClasses({
	//adiciona classes de testes criadas
	LoginTestCase.class
})
public class RegressionTestSuite {
	@BeforeClass
	public static void init() {
		System.out.print("Iniciando execu��o..");
	}
	
	@AfterClass
	public static void end() {
		System.out.print("Finalizada execu��o");
	}
}