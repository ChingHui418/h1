package tw.hui.hi.tutor;

import java.util.List;
import java.util.Scanner;

import tw.hui.h1.dao.SCDao;
import tw.hui.h1.entity.Course;
import tw.hui.h1.entity.Student;

public class Hui16 {

	public static void main(String[] args) {
		SCDao dao = new SCDao();
		Student s1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Student ID: ");
		long sid = scanner.nextLong();
		
		s1 = dao.getStudentById(sid);
		System.out.printf("Welcome, %s\n", s1.getSname());
		
		List<Course> courses = dao.getAllCourse();
		for(Course course : courses) {
			System.out.printf("%d. %s\n", course.getId(), course.getCname());
		}
		System.out.println("--------");
		System.out.println("Which? ");
		long cid = scanner.nextLong();
		
		s1.addCourse(dao.getCourseById(cid));
		dao.update(s1);
		
	}

}
