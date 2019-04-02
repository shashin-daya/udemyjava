package edu.shashin.junit.junit5features;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

public class RulesAnnotation implements AfterEachCallback, BeforeEachCallback {

	@Override
	public void beforeEach(ExtensionContext context) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterEach(ExtensionContext context) throws Exception {
		// TODO Auto-generated method stub

	}

	// JUnit4
	// @Rule
	// public final TemporaryFolder folder = new TemporaryFolder();
	//
	// @Test
	// public void testUsingTempFolder() throws IOException {
	// System.out.println("running test");
	// // File createdFile = folder.newFile("myfile.txt");
	// // File createdFolder = folder.newFolder("subfolder");
	// }
	//
	// @Override
	// public Statement apply(Statement base, Description description) {
	// return new Statement() {
	// @Override
	// public void evaluate() throws Throwable {
	// System.out.println("Applying rule");
	// System.out.println(base.toString());
	// System.out.println(description.toString());
	// }
	// };
	// }
	//
	// @Rule
	// public RulesAnnotation traceRuleTests = new RulesAnnotation();
}

@RunWith(JUnitPlatform.class)
@ExtendWith(RulesAnnotation.class)
class RuleExampleTest {

	@Test
	public void whenTracingTests() {
		/* ... */
	}
}
