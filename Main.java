import Controler.Controler;

public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();

        controler.createStudent("4", "4","4","4");
        controler.createTeacher("1", "1", "1", "1");
        controler.createTeacher("1", "2", "2", "1");
        controler.createStudent("2", "2","2","2");

        controler.printStudyGroup();

        System.out.println();

        controler.createStudent("1", "1","1","1");
        controler.createTeacher("1", "1", "4", "1");
        controler.createTeacher("3", "3", "3", "3");
        controler.createStudent("2", "2","2","2");

        controler.printStudyGroup();

        System.out.println();

        controler.createStudent("1", "1","1","1");

        controler.printStudyGroup();
    }
}