package Ex2

class Employee {

    private String id
    private String department
    private String firstName
    private String lastName
    private Double salary

    Employee(String department, String firstName, String lastName, Double salary) {
        this.id = UUID.randomUUID().toString()
        this.department = department
        this.firstName = firstName
        this.lastName = lastName
        this.salary = salary
    }

    def getDepartment() {
        return department
    }

    void setDepartment(department) {
        this.department = department
    }

    def getFirstName() {
        return firstName
    }

    void setFirstName(firstName) {
        this.firstName = firstName
    }

    def getLastName() {
        return lastName
    }

    void setLastName(lastName) {
        this.lastName = lastName
    }

    def getSalary() {
        return salary
    }

    void setSalary(salary) {
        this.salary = salary
    }

    def String getId() {
        return id
    }

    def getAnnualSalary(){
        return (this.salary * 12)
    }

    def raiseSalary(int increasePercent) {
        def newSalary = this.salary + this.salary*(increasePercent/100)
        setSalary(newSalary)
        return newSalary
    }

    @Override
    String toString() {
        return getId() + " $department  $firstName $lastName " + getAnnualSalary() + " \n"
    }

}

