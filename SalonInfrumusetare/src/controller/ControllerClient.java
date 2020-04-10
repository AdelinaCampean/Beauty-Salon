package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.Controller.btnClient;
import controller.Controller.btnLogin;
import jframe.View;
import model.Persistenta;
import model.PersistentaClienti;
import view.FrameClient;
import view.FrameContact;

public class ControllerClient {
	
	public FrameClient myC;
	public FrameContact myCo;
	
	
	public ControllerClient(FrameClient c) {
		
		myC = c;
		myC.addListenerButon1(new btnCont());
		

	}
	
	class btnCont implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			try {
				
				myCo = new FrameContact();				
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
				
		}
	}


}
