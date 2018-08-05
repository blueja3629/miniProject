package View;

import java.awt.Color;
import java.awt.Label;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Board extends JFrame {

	
	private JLabel BookMainNameLabel;
	
	private JPanel photo;
	
	private JLabel BookNLabel;
	private JLabel FieldLabel;
	private JLabel AuthorLabel;
	private JLabel PublisherLabel;
	private JLabel YearLabel;
	private JLabel BookContentLabel;
	
	private JLabel BookNLabelM;
	private JLabel FieldLabelM;
	private JLabel AuthorLabelM;
	private JLabel PublisherLabelM;
	private JLabel YearLabelM;
	private JTextArea BookContentTAM;
	
	private JButton BookreservationBtn;
	private JButton MainViewBtn;
	
	private JLabel BookCheck;
	
	private JLabel IDCommentLabel;
	private JLabel CommentLabel;
	
	
	public Board() {
		super("책 게시판");
		setLayout(null);
		
		// 메인위치
		BookMainNameLabel = new JLabel("[문학] 해리 : 공지영 장편소설");
		BookMainNameLabel.setBounds(31, 30, 160, 15);
		add(BookMainNameLabel);
		
		//책 사진
		photo = new JPanel();
		photo.setBounds(61, 80, 140, 180);
		photo.setBackground(new Color(255, 255, 255));
		add(photo);
		
		// 예약중인지 아닌지.
		BookCheck = new JLabel("비치중");
		BookCheck.setBounds(90, 210, 140, 180);
		add(BookCheck);
		
		// 제목
		BookNLabel = new JLabel("제목 :");
		BookNLabel.setBounds(220, 80, 60, 15);
		add(BookNLabel);
		
		BookNLabelM = new JLabel("해리");
		BookNLabelM.setBounds(260, 80, 160, 15);
		add(BookNLabelM);
		
		// 책 분야
		FieldLabel = new JLabel("분야 : ");
		FieldLabel.setBounds(220, 110, 60, 15);
		add(FieldLabel);
		
		FieldLabelM = new JLabel("문학");
		FieldLabelM.setBounds(260, 110, 160, 15);
		add(FieldLabelM);
		
		// 저자
		AuthorLabel = new JLabel("저자 : ");
		AuthorLabel.setBounds(220, 140, 60, 15);
		add(AuthorLabel);
		
		AuthorLabelM = new JLabel("공지영");
		AuthorLabelM.setBounds(260, 140, 80, 15);
		add(AuthorLabelM);
		
		// 출판사
		PublisherLabel = new JLabel("출판사 : ");
		PublisherLabel.setBounds(350, 140, 70, 15);
		add(PublisherLabel);
		
		PublisherLabelM = new JLabel("해냄");
		PublisherLabelM.setBounds(400, 140, 60, 15);
		add(PublisherLabelM);
		
		// 발행년도
		YearLabel = new JLabel("발행연도 : ");
		YearLabel.setBounds(220, 170, 80, 15);
		add(YearLabel);
		
		YearLabelM = new JLabel("2018");
		YearLabelM.setBounds(285, 170, 60, 15);
		add(YearLabelM);
		
		// 책 내용
		BookContentLabel = new JLabel("책 소개");
		BookContentLabel.setBounds(220, 200, 60, 15);
		add(BookContentLabel);
		
		BookContentTAM = new JTextArea();
		BookContentTAM.setBounds(230, 230, 290, 100);
		BookContentTAM.setBackground(new Color(145,163,176));
		BookContentTAM.enable(false);
		add(BookContentTAM);
		
		// 예약 버튼
		BookreservationBtn = new JButton("예약");
		BookreservationBtn.setBounds(270, 360, 100, 50);
		add(BookreservationBtn);
		
		// 목록 버튼
		MainViewBtn = new JButton("목록으로");
		MainViewBtn.setBounds(390, 360, 100, 50);
		add(MainViewBtn);
		
		IDCommentLabel = new JLabel("ID");
		IDCommentLabel.setBounds(91, 420, 100, 50);
		add(IDCommentLabel);
		
		CommentLabel = new JLabel("한줄평");
		CommentLabel.setBounds(180, 420, 100, 50);
		add(CommentLabel);
		
		
		
				
		setBounds(100, 100, 800, 600);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
