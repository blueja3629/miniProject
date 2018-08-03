package service;

import dao.MemberDao;
import dao.MemberDaoImpl;
import model.MemberDto;

public class MemberService implements MemberServiceImpl {
	
	MemberDaoImpl dao = new MemberDao();

	@Override
	public MemberDto login(MemberDto dto) {
		return dao.login(dto);
	}

}
