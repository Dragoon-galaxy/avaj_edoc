import java.util.*;

public class practhree {
    public static void main(String[] args) {
        Employee Ash = new Employee(1, "(21,ImperialHeights,440001)", 100000, "Ash");
        Employee Max = new Employee(2, "(22,CapitolHeights,440002)", 200000, "Max");
        Employee Kai = new Employee(3, "(23,EmpressCity,440003)", 300000, "Kai");
        Employee Tyson = new Employee(4, "(24,BloomDale,440004)", 400000, "Tyson");
        Employee Brooklyn = new Employee(5, "(25,JayantiNagari,440005)", 500000, "Brooklyn");
        Employee Richie = new Employee(6, "(26,TwinTower,440006)", 600000, "Richie");
        Employee Alex = new Employee(7, "(27,Antilia,440007)", 400000, "Alex");
        Employee Alexa = new Employee(8, "(28,skyLine,440008)", 200000, "Alexa");
        Employee Robin = new Employee(9, "(29,Rockwell,440009)", 120000, "Robin");
        Employee Sherlock = new Employee(10, "(30,AakarHeights,440010)", 140000, "Sherlock");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(Ash);
        employees.add(Max);
        employees.add(Kai);
        employees.add(Tyson);
        employees.add(Brooklyn);
        employees.add(Richie);
        employees.add(Alex);
        employees.add(Alexa);
        employees.add(Robin);
        employees.add(Sherlock);
        Calculations f = new Calculations(employees);
        Display z = new Display(employees);
        System.out.println("Details of 10 Employees: ");
        z.getDisplay();
    }
}

 class Calculations {
    public Calculations(ArrayList<Employee> employees) {
        for (Employee employee : employees) {
            employee.setPer((float) 0.2 * (employee.getBS()));
            employee.setHRA((float) (employee.getPer()));
        }
        for (Employee employee : employees) {
            employee.setPer2((float) 0.45 * (employee.getBS()));
            employee.setDA((float) (employee.getPer2()));
        }
        for (Employee employee : employees) {
            employee.setPer3((float) 0.07 * (employee.getBS()));
            employee.setPT((float) (employee.getPer3()));
        }
        for (Employee employee : employees) {
            employee.setPer4((employee.getBS()) + employee.getHRA() + employee.getDA());
            employee.setTS((float) (employee.getPer4()));
        }
        for (Employee employee : employees) {
            employee.setPer5((employee.getTS()) - employee.getPT());
            employee.setTHS((float) (employee.getPer5()));
        }
    }
}

 class Display {
    ArrayList<Employee> employees;

    public Display(ArrayList<Employee> employees) {
        this.employees = employees;
    }

 public void getDisplay(){ 
 for (Employee employee : employees){ 
 System.out.println("Name: " + employee.getName()+ ", Employee ID: " 
 + employee.getEmpId() + ", Address: " + employee.getAddress()+ ", BasicSalary: " + employee.getBS()+ 
 ",HRA: " + employee.getHRA() + 
",DA: " + employee.getDA()+ ",Ptax: " + employee.getPT()+ 
",TotalSalary: " + employee.getTS() 
 + ", TakeHomeSalary: " + employee.getTHS()); 
 } 
 }
}

 class Employee {
    int EmpId, BS;
    String name, address;
    float HRA, DA, PT, TS, THS;
    float per, per2, per3, per4, per5;

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        this.EmpId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBS() {
        return BS;
    }

    public void setBS(int BS) {
        this.BS = BS;
    }

    public Employee(int EmpId, String address, int BS, String name) {
        this.EmpId = EmpId;
        this.address = address;
        this.name = name;
        this.BS = BS;
    }

    public float getHRA() {
        return HRA;
    }

    public void setHRA(float HRA) {
        this.HRA = HRA;
    }

    public float getDA() {
        return DA;
    }

    public void setDA(float DA) {
        this.DA = DA;
    }

    public float getPT() {
        return PT;
    }

    public void setPT(float PT) {
        this.PT = PT;
    }

    public float getTS() {
        return TS;
    }

    public void setTS(float TS) {
        this.TS = TS;
    }

    public float getTHS() {
        return THS;
    }

    public void setTHS(float THS) {
        this.THS = THS;
    }

    public float getPer() {
        return per;
    }

    public void setPer(float per) {
        this.per = per;
    }

    public float getPer2() {
        return per2;
    }

    public void setPer2(float per2) {
        this.per2 = per2;
    }

    public float getPer3() {
        return per3;
    }

    public void setPer3(float per3) {
        this.per3 = per3;
    }

    public float getPer4() {
        return per4;
    }

    public void setPer4(float per4) {
        this.per4 = per4;
    }

    public float getPer5() {
        return per5;
    }

    public void setPer5(float per5) {
        this.per5 = per5;
    }
}