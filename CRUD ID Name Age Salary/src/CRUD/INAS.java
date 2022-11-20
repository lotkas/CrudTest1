package CRUD;

public class INAS {
    public String id;
    public String Name;
    public String Age;
    public String Salary;

    INAS(String id , String Name , String Age , String Salary) {
        this.id= id;
        this.Name= Name;
        this.Age= Age;
        this.Salary= Salary;
    }
    public String Info(){
        return this.id + this.Name + this.Age + this.Salary;
    }
}
