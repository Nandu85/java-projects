public class Employee {
    public int EmpId;
    public String Name;
    public double Rating;
    public Employee(int Id, String name, double rate){
        this.EmpId=Id;
        this.Name=name;
        this.Rating=rate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmpId=" + EmpId +
                ", Name='" + Name + '\'' +
                ", Rating=" + Rating +
                '}';
    }
}
