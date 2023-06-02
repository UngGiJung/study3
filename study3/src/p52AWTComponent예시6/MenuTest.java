package p52AWTComponent예시6;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
 
public class MenuTest {
    public static void main(String[] args) {
        Frame f = new Frame("Parent");
        f.setSize(300, 200);
 
        MenuBar mb = new MenuBar();
        
        //파일부
        Menu mFile = new Menu("파일(F)");
        MenuItem miNew = new MenuItem("새로 만들기(N)");
        MenuItem miNewWindow = new MenuItem("새 창(W)");
        MenuItem miNewOpen = new MenuItem("열기(O)...");
        MenuItem misave = new MenuItem("저장(S)...");
        MenuItem miOtherNameSave = new MenuItem("다른 이름으로 저장(A)...");
        MenuItem mipageSet = new MenuItem("페이지 설정(U)...");
 
        Menu mOthers = new Menu("인쇄 메뉴");
        MenuItem miExit = new MenuItem("끝내기(X)");
 
        mFile.add(miNew);
        mFile.add(miNewWindow);
        mFile.add(miNewOpen);
        mFile.add(misave);
        mFile.add(miOtherNameSave);
        mFile.addSeparator();
        mFile.add(mipageSet);
        mFile.add(mOthers);
        mFile.addSeparator();
        mFile.add(miExit);

        
        MenuItem miPrint = new MenuItem("인쇄(P)...");
        MenuItem miPreview = new MenuItem("인쇄 미리보기(V)");
        MenuItem miSetup = new MenuItem("페이지 설정(U)...");
        mOthers.add(miPrint);
        mOthers.add(miPreview);
        mOthers.add(miSetup);
        
        //편집부
        Menu mEdit = new Menu("편집(E)");
        MenuItem cansl = new MenuItem("실행 취소(U)");
        MenuItem cut = new MenuItem("잘라내기(T)");
        MenuItem cc = new MenuItem("복사(C)");
        MenuItem cv = new MenuItem("붙여넣기(P)...");
        MenuItem dlet = new MenuItem("삭제(L)");
        MenuItem Search = new MenuItem("검색(S)...");
        MenuItem lookfor = new MenuItem("찾기(F)...");
        MenuItem Blookfor = new MenuItem("다음 찾기(N)");
        MenuItem Alookfor = new MenuItem("이전 찾기(V)");
        MenuItem cha = new MenuItem("바꾸기(R)");
        MenuItem ed = new MenuItem("이동(G)");
        MenuItem All = new MenuItem("모두 선택(A)");
        MenuItem date = new MenuItem("시간/날짜(D)");
 
 
        mEdit.add(cansl);
        mEdit.addSeparator();
        mEdit.add(cut);
        mEdit.add(cc);
        mEdit.add(cv);
        mEdit.add(dlet);
        mEdit.addSeparator();
        mEdit.add(Search);
        mEdit.add(lookfor);
        mEdit.add(Blookfor);
        mEdit.add(Alookfor);
        mEdit.add(cha);
        mEdit.add(ed);
        mEdit.addSeparator();
        mEdit.add(All);
        mEdit.add(date);
        
        Menu mView = new Menu("보기");
        Menu mHelp = new Menu("도움말");
        CheckboxMenuItem miStatusbar = new CheckboxMenuItem("상태 표시줄");
        mView.add(miStatusbar);
 
        mb.add(mFile);
        mb.add(mEdit);
        mb.add(mView);
        mb.setHelpMenu(mHelp);
 
        f.setMenuBar(mb);
        f.setVisible(true);
    }
}

        
