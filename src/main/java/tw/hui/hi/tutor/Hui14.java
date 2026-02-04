package tw.hui.hi.tutor;

import tw.hui.h1.dao.SCDao;
import tw.hui.h1.entity.Student;

public class Hui14 {

	public static void main(String[] args) {
		SCDao dao = new SCDao();
		dao.save(new Student("Hui"));
		dao.save(new Student("Jenny"));
		dao.save(new Student("Mark"));
		dao.save(new Student("Luka"));
		dao.save(new Student("Fread"));
	}

}
