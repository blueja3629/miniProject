package model;

public class ReplyDto {
	
	int repnum;
	String comment;
	String repdate;
	
	public int getRepnum() {
		return repnum;
	}
	public void setRepnum(int repnum) {
		this.repnum = repnum;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getRepdate() {
		return repdate;
	}
	public void setRepdate(String repdate) {
		this.repdate = repdate;
	}
	
	public ReplyDto(int repnum, String comment, String repdate) {
		super();
		this.repnum = repnum;
		this.comment = comment;
		this.repdate = repdate;
	}

	
}
