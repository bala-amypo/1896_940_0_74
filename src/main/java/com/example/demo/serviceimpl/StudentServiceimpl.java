package com.example.demo.Serviceimpl;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
@service
public class StudentServiceImp1e implements StudentService{
   private final StudentRepository studentRepository;
   public StudentServiceImp1e(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
   }
   public Student saveStudent(Student student){
        return studentRepository.save(student);
    }    
}