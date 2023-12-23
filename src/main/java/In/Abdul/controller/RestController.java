package In.Abdul.controller;

import In.Abdul.entity.Student;
import In.Abdul.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private StudentService service;

    @GetMapping("/")
    public String name() {
        return "rest application is available";
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    @GetMapping("/getAllStudent")
    public List<Student> getAllStudent() {
        return service.getAllStudent();
    }

    @GetMapping("/get/{id}")
    public Optional<Student> getById(@PathVariable Integer id) {
        return service.getStudentById(id);
    }

    @PostMapping("/update/{id}")
    public String updateStudent(Student student) {
        return service.updateStudentById(student);
    }


    /*
   @PostMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployeeById(@PathVariable Integer id, @RequestBody Employee updateEmployee) {
        Employee employee = repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Employee Obj is not found" + id));

        employee.setFirstName(updateEmployee.getFirstName());
        employee.setLastName(updateEmployee.getLastName());
        employee.setEmail(updateEmployee.getEmail());

        Employee save = repository.save(employee);
        return ResponseEntity.ok(save);
    }

     */

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Integer id) {
        return service.deleteStudentById(id);
    }

}
