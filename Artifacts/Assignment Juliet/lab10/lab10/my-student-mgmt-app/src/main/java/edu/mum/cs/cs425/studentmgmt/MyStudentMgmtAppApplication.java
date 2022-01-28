package edu.mum.cs.cs425.studentmgmt;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.service.ClassroomService;
import edu.mum.cs.cs425.studentmgmt.service.StudentService;
import edu.mum.cs.cs425.studentmgmt.service.TranscriptService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {

	private StudentService studentService;
	private TranscriptService transcriptService;
	private ClassroomService classroomService;


	public MyStudentMgmtAppApplication(StudentService studentService, TranscriptService transcriptService, ClassroomService classRoomService){
		this.studentService = studentService;
		this.transcriptService = transcriptService;
		this.classroomService = classRoomService;
	}

	public void saveStudent(Student student){
		studentService.createStudent(student);

	}

	public void saveTranscript(Transcript transcript){
	transcriptService.createTranscript(transcript);

	}

	public void saveClassroom(Classroom classroom){
		classroomService.createClassroom(classroom);

	}
	public static void main(String[] args) {
		SpringApplication.run(MyStudentMgmtAppApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		var transcript2 = new Transcript("Bsc Agricultural Science", null);
		var transcript3 = new Transcript("Bsc Computer Science", null);
		saveTranscript(transcript2);
		saveTranscript(transcript3);

		var classroom = new Classroom("McLaughlin", "M105", null);
		saveClassroom(classroom);
		var student = new Student("000-61-0001", "Jane", "Jones", "Smith", 3.45, LocalDate.of(2019, 5, 24), transcript2, classroom);
		var student2 = new Student("000-61-0002", "Anna", "Kay", "Hilder", 3.00, LocalDate.of(2022, 1, 20), transcript3, classroom);

		var students = List.of(student, student2);
		classroom.setStudents(students);

	saveStudent(student);
	saveStudent(student2);


//	transcript2.setStudent(student);
//	transcript3.setStudent(student2);
	}
}
