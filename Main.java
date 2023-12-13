import Controler.Controler;
import Data.StudyGroup;


public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();

        controler.createStudent("4", "4","4","4");
        controler.createTeacher("1", "1", "1", "1");
        controler.createTeacher("1", "2", "2", "1");
        controler.createStudent("2", "2","2","2");

        StudyGroup first = controler.printStudyGroup();
        System.out.println();

        controler.createStudent("1", "1","1","1");
        controler.createTeacher("1", "1", "4", "1");
        controler.createTeacher("3", "3", "3", "3");
        controler.createStudent("2", "2","2","2");

        StudyGroup second = controler.printStudyGroup();
        System.out.println();

        controler.createStudent("1", "1","1","1");

        StudyGroup third = controler.printStudyGroup();

        System.out.println();
        System.out.println(first);
    }
}