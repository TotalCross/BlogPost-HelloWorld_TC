package hello;

import totalcross.io.IOException;
import totalcross.sys.Settings;
import totalcross.ui.*;
import totalcross.ui.dialog.MessageBox;
import totalcross.ui.event.*;
import totalcross.ui.gfx.Color;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class HelloWorld extends MainWindow {
	private Button btnHello;

	public HelloWorld(){
		super("", NO_BORDER);
		setBackForeColors(Color.WHITE, 0x323232);
		Settings.uiAdjustmentsBasedOnFontHeight = true;
		setUIStyle(Settings.MATERIAL_UI);
	}

	public void initUI() {
		
		try {
			
			ImageControl ic = new ImageControl(new Image("img/logo.png"));
			ic.scaleToFit = true;
			ic.centerImage = true;
			
			Label lbWelcome = new Label("Welcome to TotalCross!");
	        lbWelcome.setFont(lbWelcome.getFont().asBold());

	        add(ic, CENTER, AFTER+60, SCREENSIZE + 50, SCREENSIZE + 40);
	        add(lbWelcome, CENTER, AFTER);
			
	        btnHello = new Button("Hello");
	        btnHello.setBackColor(0xF2F2F2);
	        add(btnHello, CENTER, AFTER+150, PARENTSIZE+38, PARENTSIZE+8);
		
		} catch (IOException | ImageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onEvent(Event e) {
		if(e.type == ControlEvent.PRESSED && e.target == btnHello){
		       MessageBox mp = new MessageBox("TotalCross Ensina\n", "Hello World!            ");
		       mp.setBackColor(0xFFFFFF);
			   mp.setForeColor(0X000000);
		       mp.popup();
		   }
	}
}