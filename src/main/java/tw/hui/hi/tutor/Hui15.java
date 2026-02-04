package tw.hui.hi.tutor;

import tw.hui.h1.dao.SCDao;
import tw.hui.h1.entity.Course;

public class Hui15 {

	public static void main(String[] args) {
		SCDao dao = new SCDao();
		dao.save(new Course("Java"));
		dao.save(new Course("Tomcat"));
		dao.save(new Course("Hibernate"));
		dao.save(new Course("Spring"));
		dao.save(new Course("JDBC"));
	}

}
