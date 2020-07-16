class Exercise1 {

    static def isStringPalindrome = { String string ->
        StringBuilder stringBuilder = new StringBuilder(string);
        String reversedString = stringBuilder.reverse().toString()
        return string == reversedString
    }

    static def countWordsInSentence = {String string ->
        String[] words = string.split("\\s+");
        return words.size()
    }
}
