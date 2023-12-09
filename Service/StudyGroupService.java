package Service;

import Data.Student;
import Data.StudyGroup;
import Data.Teacher;
import Data.User;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    private final List<User> userList;

    public StudyGroupService() {
        this.userList = new ArrayList<>();
    }

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> studentList) {
        StudyGroup studyGroup = new StudyGroup(teacher, studentList);
        return studyGroup;
    }

    public List<User> getAllTeachers() {
        List<User> resultList = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Teacher) {
                resultList.add(user);
            }
        }
        return resultList;
    }

    public List<User> getAllStudent() {
        List<User> resultList = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student) {
                resultList.add(user);
            }
        }
        return resultList;
    }

    public List<User> getAllUsers() {
        return userList;
    }
}
