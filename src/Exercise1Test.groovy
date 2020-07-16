import org.testng.annotations.Test

class Exercise1Test {


    private static final PALINDROME_INPUT = "radar"
    private static final NON_PALINDROME_INPUT = "palindrome"
    private static final COUNT_WORDS_SENTENCE_INPUT = "Random gibberish text to use in web pages, site templates and in typography demos."
    private static final EXPECTED_COUNT = 14

    @Test
    void testWordIsPalindrome () {
        def result = Exercise1.isStringPalindrome(PALINDROME_INPUT)
        assert result == true
    }

    @Test
    void testWordIsNotAPalindrome () {
        def result = Exercise1.isStringPalindrome(NON_PALINDROME_INPUT)
        assert result == false
    }

    @Test
    void testCountOfWords() {
        def result = Exercise1.countWordsInSentence(COUNT_WORDS_SENTENCE_INPUT)
        assert result == EXPECTED_COUNT
    }
}
