public class Student {
    String name;
    int age;
    String major;

    // Constructor
    public Student(String name, int age, String major)
    {
        this.name = name;
        this.age = age;
        this.major = major;
    }
    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
    }

    // Change major method 
    void changeMajor(String newMajor)
    {
        this.major = newMajor;
        System.out.println(name + " change major to " + newMajor);
    }
}

