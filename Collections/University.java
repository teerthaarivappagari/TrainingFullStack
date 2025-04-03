import java.util.*;

class Course {
    private String courseCode;
    private String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Course{Code='" + courseCode + "', Name='" + courseName + "'}";
    }
}

public class UniversityEnrollment {
    public static void main(String[] args) {
        LinkedList<Course> courseList = new LinkedList<>();

        courseList.add(new Course("CS101", "Data Structures"));
        courseList.add(new Course("CS102", "Algorithms"));
        courseList.add(new Course("CS103", "Operating Systems"));
        courseList.add(new Course("CS104", "Database Systems"));

        System.out.println("Course Enrollment List (Using Iterator):");
        Iterator<Course> iterator = courseList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nIterating in Reverse Order (Using ListIterator):");
        ListIterator<Course> listIterator = courseList.listIterator(courseList.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        System.out.println("\nRemoving the First Course and Displaying Updated List:");
        courseList.removeFirst();
        for (Course course : courseList) {
            System.out.println(course);
        }
    }
}
