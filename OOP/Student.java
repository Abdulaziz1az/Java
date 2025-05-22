public class Student  extends Person implements Indentifiable, Role{
    private String major;

    // Constructor
    public Student(String name, int age, String major)
    {
        super(name, age);
        this.major =  major;
    }
    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Major: " + major);
        System.out.println();
    }

    // Change major method 
    void changeMajor(String newMajor)
    {
        this.major = newMajor;
        System.out.println(getName() + " change major to " + newMajor);
    }

    // Getters 
    public String getMajor()
    {
        return major;
    }

    public void setMajor(String major)
    {
        this.major = major;
    }

      public void printRole()
    {
        System.out.println("I am a student.");
    }

    public void printID()
    {
        String name = getName();
        if(name != null && name.length() >= 2)
        {
              System.out.println("Student Id: S-" + getName().substring(0,1).toUpperCase() + "001");
        } else {
            System.out.println("Student ID: UNKNOWN");
        }
    }

}

