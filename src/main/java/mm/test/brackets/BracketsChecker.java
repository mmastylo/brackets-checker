package mm.test.brackets;

import java.util.ArrayDeque;
import java.util.Deque;

public class BracketsChecker {

	public boolean check(String text) {
		if (text == null) {
			throw new IllegalArgumentException();
		}

		Deque<Character> stack = new ArrayDeque<>();

		for (char character : text.toCharArray()) {
			switch (character) {
			case '(':
				stack.push(')');
				break;
			case '[':
				stack.push(']');
				break;
			case ']':
			case ')':
				if (stack.isEmpty() || character != stack.pop()) {
					return false;
				}
				break;
			default:
				break;
			}
		}

		return stack.isEmpty();
	}

}