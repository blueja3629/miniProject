package dao;

import java.util.List;

import model.BbsDto;

public interface BbsDaoImpl {
	
	public List<BbsDto> getBbsList();	
	public List<BbsDto> getFindList(String fStr, String fword);
	
	public boolean writeBbs(BbsDto dto);	
	
	public BbsDto getBBS(int seq);	
	public void readCount(int seq);	
	
	public boolean bbsDelete(int seq);
	public boolean bbsUpdate(int seq, String title, String content);
}
