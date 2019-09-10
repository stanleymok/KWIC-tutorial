package sg.edu.nus.comp.cs3219.module;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class RequiredWordsFilterTest {
	@Before
	public void setUp() {
		// TODO
	}

	@Test
	public void test() {
			Set<String> ignoreWords = new HashSet<>();
			ignoreWords.add("is");
			ignoreWords.add("the");
			ignoreWords.add("of");
			ignoreWords.add("and");
			ignoreWords.add("as");
			ignoreWords.add("a");
			ignoreWords.add("after");
	}
}
