class Exercise1 {

    def isStringPalindrome = { String string ->
        def reverseString = reverseString(string)
        return string == reverseString
    }

    def countWordsInSentence = { String string ->
        String[] words = string.split("\\s+");
        return words.size()
    }

    def countOccurrencesOfLetter(String string, String let) {
        def counter = 0
        string.each { letter ->
            if (letter == let)
                counter++
        }
        return counter
    }

    def reverseString(def string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        String reversedString = stringBuilder.reverse().toString()
        return reversedString
    }

    def switchLowerAndUpperCases(String s) {
        char[] ch = s.toCharArray();
        ch.eachWithIndex {letter, index->
            if (Character.isLowerCase(letter)) {
                ch[index] = letter.toUpperCase()
            } else {
                ch[index] = letter.toLowerCase()
            }
        }
        return new String(ch)
    }

}
