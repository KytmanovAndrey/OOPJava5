import Controler.Controler;
import Data.Student;
import Data.Teacher;
import Service.DataService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();
        controler.createStudent("4", "4","4","4");

        controler.createTeacher("1", "1", "1", "1");
        controler.createTeacher("1", "2", "2", "1");
        controler.createStudent("2", "2","2","2");

//        List<Student> opa = new ArrayList<>();
//        Student opaa = new Student("1","2", "3", "4", 5);
//        opa.add(opaa);
//        controler.getAllStudent();
//        System.out.println();
//        controler.getAllUser();
//        controler.getStudyGroup(new Teacher("1", "2", "3", "4", 5), opa);
//        System.out.println();

        controler.printStudyGroup();
        System.out.println();
        controler.createStudent("1", "1","1","1");
        controler.createTeacher("1", "1", "4", "1");
        controler.createTeacher("3", "3", "3", "3");
        controler.createStudent("2", "2","2","2");

        controler.printStudyGroup();
    }
}