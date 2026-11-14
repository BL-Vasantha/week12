class Staff{
    String name;
    double baseSalary;
    Staff(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;

    }
    double getBonus(){
        return  0;
    }
    String getType(){
        return  "Staff";
    }
}
class  Teacher extends  Staff{

    Teacher(String name, double baseSalary) {
        super(name, baseSalary);
    }
    @Override
    double getBonus(){
        return  5000;
    }
    @Override
    String getType(){
        return  "Teacher";

    }
}
class LabAssistant extends  Staff{

    LabAssistant(String name, double baseSalary) {
        super(name, baseSalary);
    }
    @Override
    double getBonus(){
        return 2000;
    }
    @Override
    String getType(){
        return   "LabAssistant";

    }
}



public class CampusStaffSalary {
    public static void main(String[] args) {

    }
}
