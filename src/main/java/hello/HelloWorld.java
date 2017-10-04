package hello;

import totalcross.sys.Settings;
import totalcross.ui.*;
import totalcross.ui.dialog.MessageBox;
import totalcross.ui.event.*;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;

public class HelloWorld extends MainWindow {
	private Button btnHello;
	private Label lbl;
	final Bar barTC;
	
	public HelloWorld() throws Throwable {
		super("", BORDER_LOWERED);
		Font f = Font.getFont(true,Font.NORMAL_SIZE+4);
		barTC = new Bar("TotalCross Ensina");
		barTC.canSelectTitle = false;
		barTC.setFont(f);
		barTC.setBackForeColors(0x0A246A,Color.WHITE);		
		add(barTC, LEFT,0,FILL,PREFERRED);
		
		setBackForeColors(Color.getRGB(240, 240, 240), Color.getRGB(50, 50, 50));
		Settings.uiAdjustmentsBasedOnFontHeight = true;
		setUIStyle(Settings.MATERIAL_UI);
	}

	public void initUI() {
		add(lbl = new Label("TotalCross Ensina"), CENTER+20, TOP+650, PARENTSIZE+63, PARENTSIZE+22);
		lbl.setFont(lbl.getFont().adjustedBy(10));
		add(btnHello = new Button("Hello"), CENTER, CENTER+10, PARENTSIZE+38, PARENTSIZE+8);
	}
	
	public void onEvent(Event e) {
		if(e.type == ControlEvent.PRESSED && e.target == btnHello){
		       MessageBox mp = new MessageBox("TotalCross Ensina\n", "Hellow World!            ");
		       mp.setBackColor(0xFFFFFF);
			   mp.setForeColor(0X000000);
		       mp.popup();
		   }
	}
}
