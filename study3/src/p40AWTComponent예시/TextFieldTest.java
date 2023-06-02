package p40AWTComponent예시;

//import java.awt.Button;
//import java.awt.FlowLayout;
//import java.awt.Frame;
//import java.awt.Label;
//import java.awt.TextField;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//
// 
//public class TextFieldTest implements ActionListener{
//    public static void main(String[] args) {
//        Frame f = new Frame("Login");
//        f.setSize(400, 150);
//        f.setLayout(new FlowLayout());
// 
//        Label lid = new Label("ID : ", Label.RIGHT);
//        Label lpwd = new Label("Password : ", Label.RIGHT);
//
//        Button b= new Button("Login");
////        b.addActionListener(this);
// 
//        TextField id = new TextField(10);
//        TextField pwd = new TextField(10);
//        TextField an = new TextField(30);
//        pwd.setEchoChar('*');
//    
//        
//        
//        f.add(lid);
//        f.add(id);
//        f.add(lpwd);
//        f.add(pwd);
//        f.add(b);
//        f.add(an);
//        f.setVisible(true);
//        
//      
//    }
//
//   @Override
//   public void actionPerformed(ActionEvent e) {
//      // TODO Auto-generated method stub
//       if (e.getActionCommand().equals("Login")) {
//             System.out.println("Button 1 Click!");
//         }
//   }   
//}


// --->코드 형태 변화의 이유
// 1. 맴버변수를 선언하여 그 필드값들에 접근하는 메소드들의 광역화 활용을 위해서 
// 2. 맴버변수들의 캡슐화를 위해 (private)을 사용함
// 3. 맴버변수들 중 절대 변동되지 말아야하는 값(아이디,패스워드)를 위해  (final)을 사용해줌


import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest implements ActionListener {
	private Frame f, f2;
	private TextField id, pwd, msg;
	private Button btn;
	private final String STRING_ID = "himedia";
	private final String STRING_PWD = "1111";
	public TextFieldTest() {
		f = new Frame("Login");
		f.setSize(400, 120);
		f.setLayout(new FlowLayout());

		f2 = new Frame("Main");
		f2.setSize(500, 500);
		

		Label lid = new Label("ID : ", Label.RIGHT);
		Label lpwd = new Label("Password : ", Label.RIGHT);

		id = new TextField(10);
		pwd = new TextField(10);
		pwd.setEchoChar('*');
		btn = new Button("Login");
		btn.addActionListener(this);
		msg = new TextField(40);
		msg.setEditable(false);
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(btn);
		f.add(msg);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		TextFieldTest t = new TextFieldTest();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("[" + id.getText() + "]");
		System.out.println("[" + pwd.getText() + "]");
		
		if (id.getText().equals(STRING_ID) && pwd.getText().equals(STRING_PWD)) {
//			System.out.println("로그인 성공");
			msg.setText("로그인 성공");
			f2.setVisible(true); // 자바에서 예전에 많이 활용했던 'show()' 명령어의 최신화 버전
//		}else {
//			f2.dispose();
		} else {
			System.out.println("로그인 실패");
			msg.setText("로그인 실패");
		}
	}
}
