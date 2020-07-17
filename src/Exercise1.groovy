class Exercise1 {

    def isStringPalindrome = { String string ->
        return string == reverseString(string)
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
        return string.reverse()
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

    def printEmails() {
        for(int i in 1..100){
            printf("viktoriya.dimitrova+%03d@mentormate.com\n", i)
        }
    }

    def printEmailWithDate(Date date) {
        //if DD - shows day of the year, not of the month
        def formattedDate = date.format("YYYY/MM/dd/HH/mm")
        printf("viktoriya.dimitrova+"+ formattedDate + "@mentormate.com")
    }

    def findRepeatedCharacters(String s) {
        def alphaNumericString  = s.replaceAll("\\W","")
        def map = [:]
        alphaNumericString.each {letter ->
            if(!map.containsKey(letter)){
                map.put(letter,alphaNumericString.findAll(letter).size())
            }
        }
        map.each {key, val ->
            if(val > 1 ){
                println(key)
            }
        }
    }


    def countAllLettersNumbersAndSpecialCharacters(String s) {
        def alphaNumericString  = s.replaceAll("\\s","")
        def countOfAllSymbols = alphaNumericString.size()
        return countOfAllSymbols
    }
}
