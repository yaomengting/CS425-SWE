package edu.mum.cs.cs425.studentmgmt.service.impl;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.repository.ClassroomRepository;
import edu.mum.cs.cs425.studentmgmt.service.ClassroomService;
import org.springframework.stereotype.Service;

@Service
public class ClassroomServiceImpl implements ClassroomService {
    private ClassroomRepository classroomRepository;

    public ClassroomServiceImpl(ClassroomRepository classroomRepository){
        this.classroomRepository = classroomRepository;
    }
    @Override
    public Classroom createClassroom(Classroom classroom) {
        return classroomRepository.save(classroom);
    }
}
