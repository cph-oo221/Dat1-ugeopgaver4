package Task1;

import java.util.ArrayList;

public class Student
{
    private String name;
    private ArrayList<Course> courses;

    public Student(String name)
    {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public ArrayList<Course> getCourses()
    {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses)
    {
        this.courses = courses;
    }

    public void addCourse(Course courses)
    {
        getCourses().add(courses);

    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
