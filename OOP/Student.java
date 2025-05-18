public class Student  extends Person{
    private String name;
    private int age;
    private String major;

    // Constructor
    public Student(String name, int age, String major)
    {
        super(name, age);
        this.major =  major;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Major: " + major);
        System.out.println();
    }

    // Change major method 
    void changeMajor(String newMajor)
    {
        this.major = newMajor;
        System.out.println(name + " change major to " + newMajor);
    }

    // Getters 
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getMajor()
    {
        return major;
    }

    // Setter wtih validation
    public void  setAge(int age)
    {
        if(age > 0 && age <= 120)
            this.age = age;
        
            else{
                System.out.println("Invalid age. Age must be between 1 and 120.");
            }
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setMajor(String major)
    {
        this.major = major;
    }

      public void printRole()
    {
        System.out.println("I am a student.");
    }
}

