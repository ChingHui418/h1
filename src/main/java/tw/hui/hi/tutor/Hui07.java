package tw.hui.hi.tutor;

import tw.hui.h1.dao.MemberDao;
import tw.hui.h1.entity.Member;
import tw.hui.h1.entity.MemberInfo;
import tw.hui.h1.utils.BCrypt;

public class Hui07 {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		
		Member member = new Member();
		member.setEmail("gin@iii.tw");
		member.setName("琴");
		member.setPasswd(BCrypt.hashpw("12345678", BCrypt.gensalt()));
		
		MemberInfo info = new MemberInfo();
		info.setBirthday("2000-05-02");
		info.setMale(false);
		
		member.setMemberinfo(info);
		dao.addMember(member);
		
	}

}
