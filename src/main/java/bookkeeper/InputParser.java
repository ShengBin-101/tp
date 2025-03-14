package bookkeeper;

public class InputParser {

    public static String[] extractCommandArgs(String input) throws IllegalArgumentException {
        return input.trim().split(" ", 2);
    }

    public static String[] extractXXXX(String input) {
        // Copy and Add Implementation
        return null;
    }

    public static String[] extractAddBook(String input) {
        String[] commandArgs = new String[5];

        String[] splitInput = input.trim().split("( a/)|( cat/)|( cond/)", 4);
        // Strip each element in the array
        for (int i = 0; i < splitInput.length; i++) {
            splitInput[i] = splitInput[i].trim();
        }

        commandArgs[0] = "add-book";
        commandArgs[1] = splitInput[0];
        commandArgs[2] = splitInput[1];
        commandArgs[3] = splitInput[2];
        commandArgs[4] = splitInput[3];

        return commandArgs;
    }

    /**
     * Extracts the arguments for the add-loan command.
     * <p>
     * The expected input format is: BOOK_TITLE n/BORROWER_NAME d/RETURN_DATE
     * Example: "The Great Gatsby n/John Doe d/2023-12-01"
     *
     * @param input The user input for the add-loan command.
     * @return An array of strings containing the arguments for the add-loan command:
     *      [0] - Book title
     *      [1] - Borrower's name
     *      [2] - Return date
     * @throws IllegalArgumentException if the input format is invalid.
     */
    public static String[] extractAddLoanArgs(String input) {
        String[] splitInput = input.trim().split("( n/)|( d/)", 3);
        if (splitInput.length < 3) {
            throw new IllegalArgumentException("Invalid format for add-loan. " +
                    "Expected format: add-loan BOOK_TITLE n/BORROWER_NAME d/RETURN_DATE");
        }
        return splitInput;
    }
}
