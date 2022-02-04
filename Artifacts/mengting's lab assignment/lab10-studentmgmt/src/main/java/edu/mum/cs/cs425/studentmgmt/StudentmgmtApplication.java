package edu.mum.cs.cs425.studentmgmt;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.service.ClassroomService;
import edu.mum.cs.cs425.studentmgmt.service.StudentService;
import edu.mum.cs.cs425.studentmgmt.service.TranscriptService;

@SpringBootApplication
public class StudentmgmtApplication implements CommandLineRunner {
	@Autowired
	private StudentService studentService;
	@Autowired
	private TranscriptService transcriptService;
	@Autowired
	private ClassroomService classroomService;
	public static void main(String[] args) {
		SpringApplication.run(StudentmgmtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Classroom c1 = new Classroom("McLaughlin building", "M105");
	//	Classroom c2 = new Classroom("Verial Hall building", "V29");
		classroomService.save(c1);
		Transcript t1 = new Transcript("BS Computer Science");
		Transcript t2 = new Transcript("MS Art");
		transcriptService.save(t1);
		transcriptService.save(t2);
		Student s1 = new Student("000-61-0001","Anna", "Lynn", "Smith", 3.45, LocalDate.of(2019,5,24), t1, c1);
		Student s2 = new Student("000-61-0002","Lucy", "Yao", "Smith", 3.75, LocalDate.of(2020,5,24), t2, c1);
		t1.setStudent(s1);
		t2.setStudent(s2);
		s1.setTranscript(t1);
		s2.setTranscript(t2);
		studentService.save(s1);
		studentService.save(s2);
	}

	

}
