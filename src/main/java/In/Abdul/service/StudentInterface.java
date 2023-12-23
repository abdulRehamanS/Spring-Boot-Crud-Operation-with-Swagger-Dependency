package In.Abdul.service;

import In.Abdul.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentInterface {

    // add a new student
    Student addStudent(Student student);

    // retrieve all students
    List<Student> getAllStudent();

    //get student by id
    Optional<Student> getStudentById(Integer id);


    //update student by id
    /*
    Student updateStudent(Integer id, Student student);
     */
    String updateStudentById(Student student);

    //delete student by id
    String deleteStudentById(Integer id);

}
