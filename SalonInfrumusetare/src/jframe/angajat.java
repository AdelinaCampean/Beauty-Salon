package jframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JComboBox;

public class angajat extends JFrame {

	private JFrame frame=new JFrame("Angajati");
	private JTextField textCC= new JTextField();
	private JTextField textNumeClient;
	private JTextField textProg= new JTextField();
	private JButton btnCaut = new JButton("Cautare Client");
	private JButton btnFilC = new JButton("Filtrare Clienti");
	private JButton btnVizS = new JButton("Vizualizare Statistici");
	private JButton btnSlv = new JButton("Salvare Rapoarte");
	private JTextField textvrst;
	private JTextField textdenumire;
	private JTextField textdescriere;
	private JTextField textpret;
	private JTextField textdurata;
	

	public angajat() {
		
		frame.setResizable(true);
		frame.setBounds(100, 100, 1516, 666);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 222, 173));
		
		panel.setLayout(null);
		
		JButton btnDelProg = new JButton("Stergere Programare");
		btnDelProg.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnDelProg.setBounds(257, 494, 208, 37);
		panel.add(btnDelProg);
		
		JButton btnActualizareClienti = new JButton("Actualizare Clienti\r\n");
		btnActualizareClienti.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnActualizareClienti.setBounds(257, 447, 208, 37);
		panel.add(btnActualizareClienti);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 496, 226, 37);
		panel.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(738, 36, 772, 454);
		panel.add(panel_2);
		
		JButton btnVizualizareListaServicii = new JButton("Vizualizare lista servicii\r\n");
		btnVizualizareListaServicii.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnVizualizareListaServicii.setBounds(507, 494, 208, 37);
		panel.add(btnVizualizareListaServicii);
		
		JButton btnStergereServiciu = new JButton("Stergere Serviciu");
		btnStergereServiciu.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnStergereServiciu.setBounds(507, 447, 208, 37);
		panel.add(btnStergereServiciu);
		
		JButton btnEditareServiciu = new JButton("Editare Serviciu");
		btnEditareServiciu.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnEditareServiciu.setBounds(507, 400, 208, 37);
		panel.add(btnEditareServiciu);
		
		JButton btnAdaugareServiciu = new JButton("Adaugare Serviciu");
		btnAdaugareServiciu.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnAdaugareServiciu.setBounds(507, 353, 208, 37);
		panel.add(btnAdaugareServiciu);
		
		JButton btnStergereClient = new JButton("Stergere Client");
		btnStergereClient.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnStergereClient.setBounds(257, 353, 208, 37);
		panel.add(btnStergereClient);
		
		JButton btnEditareClient = new JButton("Editare Client");
		btnEditareClient.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnEditareClient.setBounds(10, 400, 208, 37);
		panel.add(btnEditareClient);
		
		textdurata = new JTextField();
		textdurata.setColumns(10);
		textdurata.setBounds(439, 296, 276, 37);
		panel.add(textdurata);
		
		JLabel lblIntroducetiDurataServiciului = new JLabel("Introduceti durata serviciului:");
		lblIntroducetiDurataServiciului.setForeground(new Color(255, 204, 0));
		lblIntroducetiDurataServiciului.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblIntroducetiDurataServiciului.setBounds(452, 271, 276, 26);
		panel.add(lblIntroducetiDurataServiciului);
		
		JLabel lblIntroducetiPretulServiciului = new JLabel("Introduceti pretul serviciului:");
		lblIntroducetiPretulServiciului.setForeground(new Color(255, 204, 0));
		lblIntroducetiPretulServiciului.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblIntroducetiPretulServiciului.setBounds(452, 181, 276, 26);
		panel.add(lblIntroducetiPretulServiciului);
		
		JLabel lblIntroducetiDescriereaServiciului = new JLabel("Introduceti descrierea serviciului:");
		lblIntroducetiDescriereaServiciului.setForeground(new Color(255, 204, 0));
		lblIntroducetiDescriereaServiciului.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblIntroducetiDescriereaServiciului.setBounds(452, 111, 276, 26);
		panel.add(lblIntroducetiDescriereaServiciului);
		
		JLabel lblIntroducetiDenumireaServiciului = new JLabel("Introduceti denumirea serviciului:");
		lblIntroducetiDenumireaServiciului.setForeground(new Color(255, 204, 0));
		lblIntroducetiDenumireaServiciului.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblIntroducetiDenumireaServiciului.setBounds(452, 26, 276, 26);
		panel.add(lblIntroducetiDenumireaServiciului);
		
		textpret = new JTextField();
		textpret.setColumns(10);
		textpret.setBounds(439, 213, 276, 37);
		panel.add(textpret);
		
		textdenumire = new JTextField();
		textdenumire.setColumns(10);
		textdenumire.setBounds(439, 48, 276, 37);
		panel.add(textdenumire);
		
		textdescriere = new JTextField();
		textdescriere.setColumns(10);
		textdescriere.setBounds(439, 134, 276, 37);
		panel.add(textdescriere);
		
		JButton btnAdaugareClient = new JButton("Adaugare Client");
		btnAdaugareClient.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnAdaugareClient.setBounds(10, 353, 208, 37);
		panel.add(btnAdaugareClient);
		
		textvrst = new JTextField();
		textvrst.setColumns(10);
		textvrst.setBounds(10, 224, 276, 37);
		panel.add(textvrst);
		
		JLabel lblvarsta = new JLabel("Introduceti varsta clientului: ");
		lblvarsta.setForeground(new Color(255, 204, 0));
		lblvarsta.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblvarsta.setBounds(20, 193, 276, 26);
		panel.add(lblvarsta);
		
		JLabel lblVizClienti = new JLabel("Lista clientilor cu programari ");
		lblVizClienti.setForeground(new Color(153, 0, 0));
		lblVizClienti.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblVizClienti.setBounds(950, 0, 307, 37);
		panel.add(lblVizClienti);
		
		
		btnFilC.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnFilC.setBounds(10, 447, 208, 37);
		panel.add(btnFilC);
		
		
		btnCaut.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnCaut.setBounds(257, 400, 208, 37);
		panel.add(btnCaut);
		
		textNumeClient = new JTextField();
		textNumeClient.setBounds(10, 146, 276, 37);
		panel.add(textNumeClient);
		textNumeClient.setColumns(10);
		
		textProg = new JTextField();
		textProg.setColumns(10);
		textProg.setBounds(10, 296, 276, 37);
		panel.add(textProg);
		

		btnVizS.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnVizS.setBounds(822, 500, 208, 37);
		panel.add(btnVizS);
		
		
		btnSlv.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnSlv.setBounds(1201, 500, 208, 37);
		panel.add(btnSlv);
		
		JLabel lblCl = new JLabel("Introduceti numele clientului: ");
		lblCl.setForeground(new Color(255, 204, 0));
		lblCl.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblCl.setBounds(20, 123, 276, 26);
		panel.add(lblCl);
		
		JLabel lblProg = new JLabel("Introduceti denumirea programarii: ");
		lblProg.setForeground(new Color(255, 204, 0));
		lblProg.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblProg.setBounds(20, 271, 276, 26);
		panel.add(lblProg);
		

		JLabel ph2 = new JLabel();
		ph2.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\bb.jpg"));
		ph2.setBounds(10, 6, 336, 119);
		panel.add(ph2);
		
		JLabel ph3 = new JLabel();
		ph3.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\fundal2.jpg"));
		ph3.setBounds(0, 0, 1510, 1080);
		panel.add(ph3);
		
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}
}
