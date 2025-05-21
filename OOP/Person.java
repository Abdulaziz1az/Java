public abstract class  Person {
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        setAge(age);
    }

    public abstract void displayInfo();

    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        if (age > 0 && age <= 120)
        {
            this.age = age;
        } else{
            System.out.println("Invalid age: ");
        }
    }

    public abstract void printRole();
}
