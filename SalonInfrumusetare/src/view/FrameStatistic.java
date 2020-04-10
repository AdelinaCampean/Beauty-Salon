package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartPanel;

public class FrameStatistic {

	private JFrame frame;
	private JPanel panel_1 = new JPanel();
	private JPanel panel_2 = new JPanel();
	
public FrameStatistic() {
	
		frame = new JFrame("STATISTICI");
		frame.setResizable(true);
		frame.setBounds(100, 100, 1352, 555);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 222, 173));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		frame.setLocationByPlatform(true);
		
		
		panel_1.setBounds(10, 24, 600, 460);
		panel.add(panel_1);
		
		panel_2.setBounds(666, 24, 600, 460);
		panel.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(-14, 0, 1313, 518);
		panel.add(lblNewLabel);
		
		
		frame.setVisible(true);
		
	}


		public void metoda1(ChartPanel a) {
			
		    panel_1.removeAll();
		    panel_1.setLayout(new BorderLayout());
		    panel_1.add(a);
		    panel_1.setVisible(true);
		    panel_1.revalidate();
		    
		}

		public void metoda2(ChartPanel a) {
			
			panel_2.removeAll();
		    panel_2.setLayout(new BorderLayout());
		    panel_2.add(a);
		    panel_2.setVisible(true);
		    panel_2.revalidate();
		    
		}


		public JFrame getFrame() {
			return frame;
		}
		
		public void setFrame(JFrame frame) {
			this.frame = frame;
		}
		
		public JPanel getPanel_1() {
			return panel_1;
		}
		
		public void setPanel_1(JPanel panel_1) {
			this.panel_1.removeAll();
			this.panel_1 = panel_1;
			this.panel_1.setVisible(true);
			this.panel_1.revalidate();
		}
		
		public JPanel getPanel_2() {
			return panel_2;
		}

		public void setPanel_2(JPanel panel_2) {
			this.panel_1.removeAll();
			this.panel_2 = panel_2;
			this.panel_1.setVisible(true);
			this.panel_1.revalidate();
		}
	
}
