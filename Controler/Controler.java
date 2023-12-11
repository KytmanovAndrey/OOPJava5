package Controler;

import Data.*;
import Service.DataService;
import Service.StudyGroupService;
import View.StudentView;
import View.StudyGroupView;

import java.util.List;

public class Controler {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudyGroupService studyGroupService = new StudyGroupService();
    private final StudyGroupView studyGroupView = new StudyGroupView();

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName,
                              String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.TEACHER);
    }

    public void getAllStudent() {
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            studentView.printOnConsole((Student) user);
        }
    }

    public void getStudyGroup(Teacher teacher, List<Student> studentList) {
        studyGroupService.createStudyGroup(teacher, studentList);
    }

    public void getAllUser() {
        List<User> userList = service.getAllUser();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    public void printStudyGroup() {
        studyGroupService.setStudyGroup(service.getUserList());
        List<User> userList = studyGroupService.printStudyGroup();
        for (User user : userList) {
            System.out.println(user);
        }
    }

}
