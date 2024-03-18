class person
{
int age;
String name;

person(String name, int age)
{
    this.name = name;
    this.age = age;

}
}

class employee extends person{
    int empid;
    int empsal;

    employee(String name, int age, int id, int salary){
        super(name, age);
        empid = id;
        empsal= salary;
    }

    void printDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(empid);
        System.out.println(empsal);
    }
}


public class emp {

    public static void main(String[] args) {
        employee emp =  new employee("Dhanuush", 12, 3, 120000);

        emp.printDetails();   
    }

   
}