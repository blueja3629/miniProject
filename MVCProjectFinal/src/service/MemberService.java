package service;

import dao.MemberDao;
import dao.MemberDaoImpl;
import model.MemberDto;

public class MemberService implements MemberServiceImpl {

	MemberDaoImpl dao = new MemberDao();

	@Override
	public boolean getId(String id) {		
		return dao.getId(id);		
	}

	@Override
	public boolean addMember(MemberDto dto) {		
		return dao.addMember(dto);		
	}
	
	@Override
	public MemberDto login(MemberDto dto) {
		return dao.login(dto);
	}
	
	
}
