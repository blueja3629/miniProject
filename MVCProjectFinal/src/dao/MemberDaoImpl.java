package dao;

import model.MemberDto;

public interface MemberDaoImpl {

	public boolean getId(String id);	
	public boolean addMember(MemberDto dto);
	
	public MemberDto login(MemberDto dto);

}
