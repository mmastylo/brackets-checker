package mm.test.brackets;

import static org.junit.Assert.*;

import org.junit.Test;

import mm.test.brackets.BracketsChecker;

public class BracketsCheckerTest {

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionWhenGivenNull() {
		// given
		BracketsChecker bracketsChecker = new BracketsChecker();
		String text = null;

		// when
		bracketsChecker.check(text);
	}

	@Test
	public void shouldReturnTrueWhenGivenBalancedBrackets() {
		// given
		BracketsChecker bracketsChecker = new BracketsChecker();
		String text = "(([34[34]])234)";

		// when
		boolean result = bracketsChecker.check(text);

		// then
		assertTrue(result);
	}

	@Test
	public void shouldReturnTrueWhenGivenNotBalancedBracketsInTheMiddle() {
		// given
		BracketsChecker bracketsChecker = new BracketsChecker();
		String text = "([6)";

		// when
		boolean result = bracketsChecker.check(text);

		// then
		assertFalse(result);
	}

	@Test
	public void shouldReturnTrueWhenGivenNotBalancedBracketsAtTheEnd() {
		// given
		BracketsChecker bracketsChecker = new BracketsChecker();
		String text = "([(123)])(";

		// when
		boolean result = bracketsChecker.check(text);

		// then
		assertFalse(result);
	}

}