package Ex3

import javax.xml.crypto.Data

class Exercise3 {


    def findTheSmallestNumber(int a, int b, int c){
        int smaller = Math.min(a, b)
        int smallest = Math.min(smaller,c)
        println(smallest)
        return smallest
    }

    def findSecondFourthAndSixthWords(String s) {
        def listOfWords = s.split(' |\\.')
        def evenWordsList = [listOfWords[1], listOfWords[3],listOfWords[5]]
        evenWordsList.each {word ->
            println(word)
        }
        return evenWordsList
    }

    def separateWordsInListOfStrings(String s) {
        List<String> listOfWords = s.split(' |\\.').toList()
        return listOfWords
    }

    def countWordsInList(List<String> words) {
        return words.size()
    }

    def calculateReturnOfInvestment(int investedSum, int interestRate, int years) {
        def interest = 0
        (1..years).each {year ->
            interest +=  (interestRate/100) * (investedSum + interest)
            println("Interest for $year year $interest")
        }
    }

    def  checkIfYearIsLeap(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        int result = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return result == 29
    }
}
