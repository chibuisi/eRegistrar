package edu.mum.cs425.eregistrar.service;

import edu.mum.cs425.eregistrar.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentService{
    //public abstract Iterable<Student> getAllStudents();
    public abstract Student getStudentById(Long studentId);
    public abstract Page<Student> getAllStudentsPaged(int pageNum);
    public abstract Student saveStudent(Student student);
    public abstract void deleteStudentById(Long studentId);
}
