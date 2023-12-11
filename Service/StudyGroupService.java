package Service;

import Data.*;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService extends DataService {
    private final List<User> studyGroupList;

    public StudyGroupService() {
        this.studyGroupList = new ArrayList<>();
    }

    public void setStudyGroup(List<User> someList) {
        userList = someList;
    }

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> studentList) {
        return new StudyGroup(teacher, studentList);
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

    public List<User> printStudyGroup() {
        List<User> resultList = new ArrayList<>();
        boolean flag = false;
        for (User user : userList) {
            if (user instanceof Teacher && !studyGroupList.contains(user) && !flag) {
                studyGroupList.add(user);
                flag = true;
                resultList.add(user);
            }
            if (user instanceof Student && !studyGroupList.contains(user)) {
                studyGroupList.add(user);
                resultList.add(user);
            }
        }
        return resultList;
    }
}
