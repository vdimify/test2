package Ex2

import org.testng.annotations.Test

class Exercise2Tests {

    @Test
    void testCreatingEmployees(){
        def employeeList = [new Employee("QA", "Nadezhda", "Dimitrova", 1000),
                        new Employee("Dev", "Mitko", "Dimitrov", 2000),
                        new Employee("QA", "Nina", "Dimitrova", 1500),
                        new Employee("QA", "Viktoria", "Ivanova", 2000),
                        new Employee("QA", "Rosen", "Petrov", 1000),
                        new Employee("Dev", "Lilia", "Mihova", 3000),
                        new Employee("Dev", "Dragan", "Danailov", 1500),
                        new Employee("QA", "Denitsa", "Dimitrova", 2000),
                        new Employee("Mng", "Dimitur", "Borisov", 5000),
                        new Employee("Mng", "Daesislava", "Yordanova", 4000)]
        def boss = new Boss()
        boss.setEmployeeList(employeeList)
        boss.printEmployeeList()
        println("---------------QA RAISE------------------")
        boss.raiseSalaries(25, "QA")
        boss.printEmployeeList()
        println("------------CHANGE DEPARTMENT------------")
        boss.getEmployeeList().get(1).setDepartment("QA")
        boss.getEmployeeList().get(9).setDepartment("QA")
        boss.printEmployeeList()
        println("---------------NEW RAISE-------------")
        boss.raiseFreshRecruitmentsSalaries(15, "QA")
        boss.printEmployeeList()

    }
}
