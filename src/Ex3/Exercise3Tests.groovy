package Ex3

import com.sun.xml.bind.v2.TODO
import org.testng.annotations.BeforeClass
import org.testng.annotations.Test

class Exercise3Tests {

    Exercise3 ex3

    @BeforeClass
    def setup(){
        ex3  = new Exercise3()
    }

    @Test
    void testFindingSmallestNumber(){
        def result = ex3.findTheSmallestNumber(15,5,1)
        assert result == 1
    }

    @Test
    void testFindingSecondFourthAndSixthWords(){
        def result = ex3.findSecondFourthAndSixthWords("I Love writing methods so much.")
    }

    @Test
    void testSeparateWordsToList(){
        def result = ex3.countWordsInList(ex3.separateWordsInListOfStrings("Did I tell you how much I love writing methods."))
        println(result)
        assert result == 10
    }

    @Test
    void testReturnOfInvestmentCalculation(){
        def result = ex3.calculateReturnOfInvestment(10000, 5 , 10)
    }

    @Test
    void testCheckYearIsLeap(){
        //TODO cannot read from console
        println( "Enter a year")
        int year = System.in.newReader().readLine() as Integer
        def result = ex3.checkIfYearIsLeap(year)
        if(result){
            println("It is leap year")
        } else {
            println("It is NOT a leap year")
        }
    }

    @Test
    void testPasswordIsValid(){
        boolean result = ex3.isPasswordValid("Pa4des*()&^^rd12")
        println(result)
    }


    @Test
    void testGetMonthByItsNumber(){
        print(ex3.getMonthByItsNumber(4))
    }


}
