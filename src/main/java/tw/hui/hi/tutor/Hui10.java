package tw.hui.hi.tutor;

import java.util.List;

import tw.hui.h1.dao.MemberDao;
import tw.hui.h1.entity.Member;
import tw.hui.h1.entity.MemberInfo;

public class Hui10 {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		
		List<Member> members = dao.findAll();
		for(Member member : members) {
			System.out.printf("%d .%s(%s)\n", member.getId(), member.getName(), member.getEmail());
			MemberInfo mi = member.getMemberinfo();
			if(mi != null) {
				System.out.printf("\t%s:%s\n", mi.getBirthday(), mi.isMale()?"Male":"Female");
			}
		}
		
	}

}
