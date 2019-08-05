package edu.mum.cs425.eregistrar.service.serviceimpl;

import edu.mum.cs425.eregistrar.model.Student;
import edu.mum.cs425.eregistrar.repository.StudentRepository;
import edu.mum.cs425.eregistrar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student getStudentById(Long studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    @Override
    public Page<Student> getAllStudentsPaged(int pageNum) {
        return studentRepository.findAll(PageRequest.of(pageNum,5, Sort.by("firstname")));
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long studentId) {
        studentRepository.deleteById(studentId);
    }
}
