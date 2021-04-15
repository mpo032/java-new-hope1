import model.Course;
import model.Student;
import model.enums.CourseName;

import java.util.List;

public class LoopsAndModel {
    public static void main(String[] args) {
        Course java = new Course(CourseName.JAVA, 15);

        System.out.println("This course is: " + java.getName());

        java.addStudent(new Student("Darja", "Ag.", "dasha@inbox.lv"));
        java.addStudent(new Student("Nikolajs", "Gr.", "niki@inbox.lv"));
        java.addStudent(new Student("Natalia", "Na", "nata@inbox.lv"));
        java.addStudent(new Student("Kara", "Kr", "kara@inbox.lv"));
        java.addStudent(new Student("Jurijs", "Te", "jurijs@inbox.lv"));

//       System.out.println(java.getStudents().size());
//       System.out.println(java.getStudents().get(1).getFirstName());

        List<Student> students = java.getStudents();

        //FOR cikl
        for (int i = 0; i < students.size(); i++) { // i++ -> i=i+1
            System.out.println(students.get(i).getFullName());

        }

        System.out.println("---------------------");

        // FOREACH cikl
        for (Student s : students) {
            //    System.out.println(s.getFullName());
            if (s.getFirstName().startsWith("N")) {
                //true
                System.out.println(s.getFullName());
            } else {
                //false
                System.out.println("This name is not starting from N");
            }
            //statement ? true : false
            System.out.println(s.getFirstName().startsWith("N") ? s.getFullName() : "This name is not starting from N");
        }

        System.out.println("-----------------");

        int i = 0;
        while (i < 3) {
            System.out.println(students.get(i).getFullName());
            i++;
        }

//           boolean isNatalyFound = false
//           while (!isNatalyFound) {                   //!true = false           !false = true
//              for (Student s : students) {
//                 System.out.println(s.getFirstName());
//                   if (s.getFirstName().equals("Natalia")) {
//                       System.out.println(s.getFullName()).;
//                       isNatalyFound = true;
//                       break;
//                  }
//              }
//          }
    }
}
