public class Teacher extends Person implements Indentifiable, Role{
    private String subject;
    
    public Teacher(String name, int age, String subject)
    {
        super(name, age);
        this.subject = subject;
    }

    public void displayInfo()
    {
        System.out.println("Name: "+ getName());
        System.out.println("Age: " + getAge());
        System.out.println("Subject: " + subject);
        System.out.println();
    }

    public void printID()
    {
        System.out.println("Teacher ID: T-" + getName().substring(0,2).toUpperCase()+ "101");
    }

    public void printRole()
    {
        System.out.println("I am a teacher.");
    }

}
