public class Employee {
    private String employeeCode;
    private String name;
    private String lastName;
    private Vacation[] vacations;
    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Vacation[] getVacations() {
        if (vacations == null){
            vacations = new Vacation[10];
        }
        return vacations;
    }

    public void setVacations(Vacation[] vacations) {
        this.vacations = vacations;
    }
    public void addVacation(Vacation v){
        if (vacations == null){
            vacations = new Vacation[10];
        }
        for (Integer index = 0;index < this.vacations.length;index++){
            if (vacations[index] == null){
                vacations[index] = v;
                break;
            }
        }
    }
}
