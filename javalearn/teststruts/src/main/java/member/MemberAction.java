package member;

import java.util.Iterator;
import java.util.List;

public class MemberAction {
	private Member member;

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
public String input(){
	return "input";
}
	public String execute() {
		MemberDAO md = new MemberDAO();
		md.save(member);
		List<Member> members;
		members = md.findByProperty("username", member.getUsername());
		Iterator<Member> i = members.iterator();
		if (i.hasNext()) {
			Member m = i.next();
			System.out.println("用户名：" + m.getUsername());
			System.out.println("密码：" + m.getPassword());
		} else {
			System.out.println("数据库中不存在该用户");
		}
		return "success";
	}
}
