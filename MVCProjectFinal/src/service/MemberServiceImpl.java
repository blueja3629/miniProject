package service;

import model.MemberDto;

public interface MemberServiceImpl {

	public boolean getId(String id);	
	public boolean addMember(MemberDto dto);
	
	public MemberDto login(MemberDto dto);
}
