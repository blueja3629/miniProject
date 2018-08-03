package model;

public class BookDto {
	
	int booknum;
	String publisher;
	String isbn;
	String writer;
	String gerne;
	String publishdate;
	String status;
	String rentdate;
	int recommand;
	
	public int getBooknum() {
		return booknum;
	}
	public void setBooknum(int booknum) {
		this.booknum = booknum;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getGerne() {
		return gerne;
	}
	public void setGerne(String gerne) {
		this.gerne = gerne;
	}
	public String getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(String publishdate) {
		this.publishdate = publishdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRentdate() {
		return rentdate;
	}
	public void setRentdate(String rentdate) {
		this.rentdate = rentdate;
	}
	public int getRecommand() {
		return recommand;
	}
	public void setRecommand(int recommand) {
		this.recommand = recommand;
	}
	
	public BookDto(int booknum, String publisher, String isbn, String writer, String gerne, String publishdate,
			String status, String rentdate, int recommand) {
		super();
		this.booknum = booknum;
		this.publisher = publisher;
		this.isbn = isbn;
		this.writer = writer;
		this.gerne = gerne;
		this.publishdate = publishdate;
		this.status = status;
		this.rentdate = rentdate;
		this.recommand = recommand;
	}
	
	

}
