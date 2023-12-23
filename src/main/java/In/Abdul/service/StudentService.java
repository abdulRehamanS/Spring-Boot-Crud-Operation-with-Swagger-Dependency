package In.Abdul.service;

import In.Abdul.entity.Student;
import In.Abdul.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements StudentInterface {


    @Autowired
    StudentRepository repository;

    @Override
    public Student addStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return repository.findAll();

    }

    @Override
    public Optional<Student> getStudentById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public String updateStudentById(Student student) {
        if (repository.existsById(student.getId())) {
            repository.save(student);
            return " student updated successfully";
        } else return "Student not found with id in repository ";
    }


    /*
    @Override
    public Student updateStudentById(Integer id, Student student) {
        Student stu = repository.findById(id).orElseThrow(() -> new RuntimeException("Student not found " + id + "in repository"));

        stu.setName(student.getName());
        stu.setDesignated(student.getDesignated());
        return repository.save(stu);

    }
                    or
     */

    @Override
    public String deleteStudentById(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Student is deleted" + id;
        } else return "Student is not in repository with id " + id;
    }
}
