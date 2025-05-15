public class Student {
    private String name;
    private int age;
    private String grade;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age)
    {
        if (age >= 0)
        {
            this.age = age;
        }
    }

    public int getAge()
    {
        return age;
    }

    public void setGrade(String grade)
    {
        this.grade = grade;
    }

    public String getGrade()
    {
        return grade;
    }
}
