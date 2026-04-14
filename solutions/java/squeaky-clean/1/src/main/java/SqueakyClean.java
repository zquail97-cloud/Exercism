class SqueakyClean {
    static String clean(String identifier) {

		// Declare StringBuilder to reconstruct our char array
		StringBuilder sb = new StringBuilder();

		// Convert input to Char array
		char[] idenArray = identifier.toCharArray();

		// Flag to capitalise letters
		boolean makeNextUpper = false;

		// Fore to break our input into individual characters
		for (char c : idenArray) {

			// If pointer is on a blank space, replace it with '_' and skip
			if (c == ' ') {
				sb.append('_');
				continue;
			}

			// Switch statement to convert L33TSp5Ak numbers into basic letters
			// Converted characters are processed as outChar
			char outChar = switch (c) {
			case '4' -> 'a';
			case '3' -> 'e';
			case '0' -> 'o';
			case '1' -> 'l';
			case '7' -> 't';
			default -> c;

			};

			// checks if there are any '-' and flags makeNextUpper as true
			if (outChar == '-') {
				makeNextUpper = true;

				// If makeNextUpper is true, current character is capitalised and flag is
				// consumed
			} else if (makeNextUpper) {
				sb.append(Character.toUpperCase(outChar));
				makeNextUpper = false;

				// If the current character is not a letter, skip it
			} else if (!Character.isAlphabetic(outChar)) {
				continue;

				// Else append the current letter
			} else {
				sb.append(outChar);
			}

		}

		// Return our reconstructed builtString
		return sb.toString();

	}
}
