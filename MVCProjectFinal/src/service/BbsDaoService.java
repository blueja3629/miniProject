package service;

import java.util.List;

import dao.BbsDao;
import dao.BbsDaoImpl;
import model.BbsDto;

public class BbsDaoService implements BbsDaoServiceImpl {

	BbsDaoImpl dao = new BbsDao();
	
	@Override
	public List<BbsDto> getBbsList() {		
		return dao.getBbsList();
	}

	@Override
	public List<BbsDto> getFindList(String fStr, String fword){		
		return dao.getFindList(fStr, fword);		
	}

	@Override
	public BbsDto getBBS(int seq) {		
		return dao.getBBS(seq);		
	}

	@Override
	public void readCount(int seq) {
		dao.readCount(seq);		
	}

	@Override
	public boolean writeBbs(BbsDto dto) {		
		return dao.writeBbs(dto);		
	}

	@Override
	public boolean bbsDelete(int seq) {		
		return dao.bbsDelete(seq);		
	}

	@Override
	public boolean bbsUpdate(int seq, String title, String content) {		
		return dao.bbsUpdate(seq, title, content);		
	}

}
