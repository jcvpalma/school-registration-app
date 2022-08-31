package br.com.jcvpalma.studentapi.domain.service;

import br.com.jcvpalma.studentapi.domain.dto.StudentDTO;

import java.util.List;

public interface StudentService {

    public List<StudentDTO> getAllStudents();
    
    public StudentDTO getOneStudent(Long studentId);
    
    public StudentDTO updateStudent(StudentDTO student, Long studentId);
    
    public StudentDTO insertStudent(StudentDTO student);
    
    public Boolean deleteStudent(Long studentId);

}
