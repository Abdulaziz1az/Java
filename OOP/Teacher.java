public class Teacher extends Person{
    private String subject;
    
    public Teacher(String name, int age, String subject)
    {
        super(name, age);
        this.subject = subject;
    }

    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println();
    }

      public void printRole()
    {
        System.out.println("I am a teacher.");
    }
}
