package p49AWTComponent;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DialogTest extends WindowAdapter{
	private Frame f;
	private Dialog info;
	
	public void windowClosing(WindowEvent e) {
//		System.exit(0);
		info.dispose();
	}
		
	public DialogTest() {
		f = new Frame("Parent");
		f.setSize(300,200);
		f.setLocation(10,10);
		
		info = new Dialog(f,"Informoation",true);
		info.setSize(140,90);
		info.setLocation(50,50);
		info.setLayout(new FlowLayout());
		info.addWindowListener(this);
		
		Label msg = new Label("This is modal Dialog", Label.CENTER);
		Button ok = new Button("OK");		
		
		
		info.add(msg);
		info.add(ok);
		
		
		f.setVisible(true);
		info.setVisible(true);
//		f.setVisible(false);
//		info.setVisible(false);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DialogTest dt = new DialogTest();
	}	
}
