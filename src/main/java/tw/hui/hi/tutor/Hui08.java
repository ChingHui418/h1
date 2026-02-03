package tw.hui.hi.tutor;

import tw.hui.h1.dao.MemberDao;
import tw.hui.h1.entity.Member;
import tw.hui.h1.entity.MemberInfo;

public class Hui08 {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		
		Member m1 = dao.findById(10);
		if(m1 != null) {
			MemberInfo i1 = m1.getMemberinfo();
			if(i1 != null) {
				System.out.printf("%d. %s : %s\n", m1.getId(), m1.getName(), i1.getBirthday());
				i1.setBirthday("1999-06-06");
			}else {
				i1 = new MemberInfo();
				i1.setBirthday("1997-03-03");
				i1.setMale(true);
				m1.setMemberinfo(i1);				
			}
			dao.updateMember(m1);
		}else {
			System.out.println("ID NOT FOUND!");
		}
	}

}
