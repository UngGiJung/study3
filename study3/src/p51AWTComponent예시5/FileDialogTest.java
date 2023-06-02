package p51AWTComponent예시5;

import java.awt.FileDialog;
import java.awt.Frame;

public class FileDialogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Parent");
		f.setSize(300,200);
		
		FileDialog fileOpen = new FileDialog(f,"File Open", FileDialog.LOAD);
		
		f.setVisible(true);
		fileOpen.setDirectory("C:\\window");
		fileOpen.setVisible(true);
		
		System.out.println(fileOpen.getDirectory()+fileOpen.getFile());
	}

}
