package Ex2

class Boss {

    private def employeeList = new ArrayList<Employee>()
    private def employeeWithRaise = new ArrayList<Employee>()

    def getEmployeeList() {
        return employeeList
    }

    void setEmployeeList(employeeList) {
        this.employeeList = employeeList
    }

    def addEmployee(Employee newEmployee) {
        employeeList.add(newEmployee)
    }

    def raiseSalaries(Integer increasePercent, String department) {
        employeeList.each{ Employee employee ->
            if(employee.getDepartment() == department) {
                employee.raiseSalary(increasePercent)
                employeeWithRaise.add(employee)
            }
        }
    }

    def raiseFreshRecruitmentsSalaries(Integer increasePercent, String department) {
        employeeList.each{ Employee employee ->
            if(employee.getDepartment() == department && !employeeWithRaise.contains(employee)){
                employee.raiseSalary(increasePercent)
                employeeWithRaise.add(employee)
            }
        }
    }

    def printEmployeeList(){
        employeeList.each { Employee employee ->
            print(employee.toString())
        }
    }
}
