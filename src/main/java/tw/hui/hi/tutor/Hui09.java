package tw.hui.hi.tutor;

import tw.hui.h1.dao.MemberDao;
import tw.hui.h1.entity.Member;

public class Hui09 {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		
		Member member = dao.findById(16);
		if(member != null) {
			System.out.printf("%d. %s : %s\n", 
					member.getId(), member.getEmail(),
					member.getMemberinfo()!=null?member.getMemberinfo():"NO INFO");
			dao.delMember(member);
			System.out.println("Delete Success");
		}else {
			System.out.println("ID NOT FOUND");
		}
	}

}
