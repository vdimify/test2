import org.testng.annotations.BeforeClass
import org.testng.annotations.Test

class Exercise1Test {

    private static final PALINDROME_INPUT = "radar"
    private static final NON_PALINDROME_INPUT = "palindrome"
    private static final COUNT_WORDS_SENTENCE_INPUT = "Random gibberish text to use in web pages, site templates and in typography demos."
    private static final EXPECTED_COUNT = 14
    private static final COUNT_LETTERS_OCCURRENCES = "Random gibberish text to use in web pages, site templates and in typography demos."
    private static final NORMAL_ORDER_STRING = "I am normal sentence"
    private static final REVERSED_ORDER_STRING = "ecnetnes lamron ma I"
    private static final UPPER_AND_LOWER_CASE_CHARACRERS = "I am HEADING"

    Exercise1 ex1


    @BeforeClass
    void steUp() {
        ex1 = new Exercise1()
    }

    @Test
    void testWordIsPalindrome () {
        def result = ex1.isStringPalindrome(PALINDROME_INPUT)
        assert result == true
    }

    @Test
    void testWordIsNotAPalindrome () {
        def result = ex1.isStringPalindrome(NON_PALINDROME_INPUT)
        assert result == false
    }

    @Test
    void testCountOfWords() {
        def result = ex1.countWordsInSentence(COUNT_WORDS_SENTENCE_INPUT)
        assert result == EXPECTED_COUNT
    }

    @Test
    void testCountingOccurrences() {
        def resultA = ex1.countOccurrencesOfLetter(COUNT_LETTERS_OCCURRENCES, "a")
        def resultS = ex1.countOccurrencesOfLetter(COUNT_LETTERS_OCCURRENCES, "s")
        def resultE = ex1.countOccurrencesOfLetter(COUNT_LETTERS_OCCURRENCES, "e")
        printf("A appears %d times in \"%s\" \n", resultA, COUNT_LETTERS_OCCURRENCES)
        printf("S appears %d times in \"%s\" \n", resultS, COUNT_LETTERS_OCCURRENCES)
        printf("E appears %d times in \"%s\" \n", resultE, COUNT_LETTERS_OCCURRENCES)
        assert resultA == 5
        assert resultS == 6
        assert resultE == 9
    }


    @Test
    void testReversingString(){
        def result = ex1.reverseString(NORMAL_ORDER_STRING)
        String[] reversedWords = result.split("\\s+")
        reversedWords.each {word ->
            println(word)
        }
        assert result != NORMAL_ORDER_STRING
        assert result == REVERSED_ORDER_STRING
        assert reversedWords.size() == 4
        assert reversedWords.getAt(3) == "I"
    }

    @Test
    void testSwitchingUpperAndLowerCaseCharacters(){
        def result = ex1.switchLowerAndUpperCases(UPPER_AND_LOWER_CASE_CHARACRERS)
        println(result)
        assert result.charAt(0).isUpperCase() != UPPER_AND_LOWER_CASE_CHARACRERS.charAt(0).isUpperCase()
    }


}
