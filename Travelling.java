package Travelling_Ticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Travelling {

	private JFrame frame;
	private JTextField txtTax;
	private JTextField txtSubTotal;
	private JTextField txtTotal;
	private JTextField txtClass;
	private JTextField txtTicket;
	private JTextField txtAdult;
	private JTextField txtChild;
	private JTextField txtFrom;
	private JTextField txtTo;
	private JTextField txtDate;
	private JTextField txtTime;
	private JTextField txtTicketNo;
	private JTextField txtPrice;
	private JTextField txtRoute;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travelling window = new Travelling();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Travelling() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 40));
		frame.setBounds(0, 0, 1370, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 10, 1336, 63);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel(".Ticketing System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ticket Type");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(290, 83, 196, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setFont(new Font("Tahoma", Font.BOLD, 25));
		rdbtnStandard.setBounds(56, 153, 155, 21);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnEconomy = new JRadioButton("Economy");
		rdbtnEconomy.setFont(new Font("Tahoma", Font.BOLD, 25));
		rdbtnEconomy.setBounds(56, 197, 155, 39);
		frame.getContentPane().add(rdbtnEconomy);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.BOLD, 25));
		rdbtnFirstClass.setBounds(56, 257, 155, 21);
		frame.getContentPane().add(rdbtnFirstClass);
		
		JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setFont(new Font("Tahoma", Font.BOLD, 25));
		rdbtnSingleTicket.setBounds(269, 149, 202, 29);
		frame.getContentPane().add(rdbtnSingleTicket);
		
		JRadioButton rdbtnReturnTicket = new JRadioButton("Return Ticket");
		rdbtnReturnTicket.setFont(new Font("Tahoma", Font.BOLD, 25));
		rdbtnReturnTicket.setBounds(269, 212, 217, 21);
		frame.getContentPane().add(rdbtnReturnTicket);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setFont(new Font("Tahoma", Font.BOLD, 25));
		rdbtnAdult.setBounds(532, 153, 103, 21);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setFont(new Font("Tahoma", Font.BOLD, 25));
		rdbtnChild.setBounds(532, 212, 103, 21);
		frame.getContentPane().add(rdbtnChild);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(329, 142, -247, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(178, 115, -63, 29);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(88, 136, 335, -1);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(98, 136, 601, 2);
		frame.getContentPane().add(separator_3);
		
		JComboBox cmbDestination = new JComboBox();
		cmbDestination.setModel(new DefaultComboBoxModel(new String[] {"Destination", "Kilburn", "Preston", "Oxford", "Leed", "India"}));
		cmbDestination.setFont(new Font("Tahoma", Font.BOLD, 25));
		cmbDestination.setBounds(276, 248, 227, 39);
		frame.getContentPane().add(cmbDestination);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setBounds(88, 297, 601, 2);
		frame.getContentPane().add(separator_3_1);
		
		JLabel lblNewLabel_2 = new JLabel("TAX");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(72, 332, 70, 39);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("SubTotal");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(72, 392, 121, 39);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Total");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_4.setBounds(72, 457, 103, 29);
		frame.getContentPane().add(lblNewLabel_4);
		
		JSeparator separator_3_1_1 = new JSeparator();
		separator_3_1_1.setBounds(88, 526, 601, 2);
		frame.getContentPane().add(separator_3_1_1);
		
		txtTax = new JTextField();
		txtTax.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtTax.setBounds(269, 332, 234, 39);
		frame.getContentPane().add(txtTax);
		txtTax.setColumns(10);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				double tax = 19.50;
				double MilesK8 = 25.78;
				double MilesK12 = 25.10;
				double MilesK20 = 45.23;
				double MilesK30 = 55.98;
				double totalCost, eco = 3.85, fclass = 5.60;
				
				if((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())
					&& cmbDestination.getSelectedItem().equals("Kilburn"))
				{
					totalCost = (tax * MilesK8) / 100;
					String sTax = String.format("£%.2f", totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("£%.2f",MilesK8);
					txtSubTotal.setText(subTotal);
					String Total = String.format("£%.2f",MilesK8 + totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				else if((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected())
						&& cmbDestination.getSelectedItem().equals("Kilburn"))
					{
						totalCost = (tax * MilesK8) / 100;
						String sTax = String.format("£%.2f", totalCost);
						txtTax.setText(sTax);
						String subTotal = String.format("£%.2f",MilesK8*2);
						txtSubTotal.setText(subTotal);
						String Total = String.format("£%.2f",(MilesK8 + totalCost)*2);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("STD");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("ONE");
						txtChild.setText("NIL");
					}
				else if((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected())
						&& cmbDestination.getSelectedItem().equals("Kilburn"))
					{
						totalCost = (tax * MilesK8) / 100;
						String sTax = String.format("£%.2f", totalCost - 18);
						txtTax.setText(sTax);
						String subTotal = String.format("£%.2f",MilesK8);
						txtSubTotal.setText(subTotal);
						String Total = String.format("£%.2f",(MilesK8 + totalCost)-18);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("STD");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("NIL");
						txtChild.setText("ONE");
					}
				else if((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected())
						&& cmbDestination.getSelectedItem().equals("Kilburn"))
					{
						totalCost = (tax * MilesK8) / 100;
						String sTax = String.format("£%.2f", totalCost-18);
						txtTax.setText(sTax);
						String subTotal = String.format("£%.2f",MilesK8*2);
						txtSubTotal.setText(subTotal);
						String Total = String.format("£%.2f",((MilesK8 + totalCost)*2)-18);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("STD");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("NIL");
						txtChild.setText("ONE");
					}
				else if((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())
						&& cmbDestination.getSelectedItem().equals("Preston"))
					{
						totalCost = (tax * MilesK12) / 100;
						String sTax = String.format("£%.2f", totalCost);
						txtTax.setText(sTax);
						String subTotal = String.format("£%.2f",MilesK12);
						txtSubTotal.setText(subTotal);
						String Total = String.format("£%.2f",MilesK12 + totalCost);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("STD");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("ONE");
						txtChild.setText("NIL");
					}
				else if((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected())
						&& cmbDestination.getSelectedItem().equals("Preston"))
					{
						totalCost = (tax * (MilesK12)*2) / 100;
						String sTax = String.format("£%.2f", totalCost);
						txtTax.setText(sTax);
						String subTotal = String.format("£%.2f",MilesK12*2);
						txtSubTotal.setText(subTotal);
						String Total = String.format("£%.2f",(MilesK12 + totalCost)*2);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("STD");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("ONE");
						txtChild.setText("NIL");
					}
				else if((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected())
						&& cmbDestination.getSelectedItem().equals("Preston"))
					{
						totalCost = (tax * MilesK12) / 100;
						String sTax = String.format("£%.2f", totalCost-18);
						txtTax.setText(sTax);
						String subTotal = String.format("£%.2f",MilesK12);
						txtSubTotal.setText(subTotal);
						String Total = String.format("£%.2f",MilesK12 + totalCost - 18);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("STD");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("NIL");
						txtChild.setText("ONE");
					}
				else if((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected())
						&& cmbDestination.getSelectedItem().equals("Preston"))
					{
						totalCost = (tax * (MilesK8*2)) / 100;
						String sTax = String.format("£%.2f", totalCost-18);
						txtTax.setText(sTax);
						String subTotal = String.format("£%.2f",MilesK8*2);
						txtSubTotal.setText(subTotal);
						String Total = String.format("£%.2f",((MilesK8 + totalCost)*2)-18);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("STD");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("NIL");
						txtChild.setText("ONE");
					}
				else if((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())
						&& cmbDestination.getSelectedItem().equals("Oxford"))
					{
						totalCost = (tax * MilesK20) / 100;
						String sTax = String.format("£%.2f", totalCost);
						txtTax.setText(sTax);
						String subTotal = String.format("£%.2f",MilesK20);
						txtSubTotal.setText(subTotal);
						String Total = String.format("£%.2f",MilesK20 + totalCost);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("STD");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("ONE");
						txtChild.setText("NIL");
					}
				else if((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected())
						&& cmbDestination.getSelectedItem().equals("Oxford"))
					{
						totalCost = (tax * (MilesK8*2)) / 100;
						String sTax = String.format("£%.2f", totalCost);
						txtTax.setText(sTax);
						String subTotal = String.format("£%.2f",MilesK8*2);
						txtSubTotal.setText(subTotal);
						String Total = String.format("£%.2f",(MilesK8 + totalCost)*2);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("STD");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("ONE");
						txtChild.setText("NIL");
					}
				else if((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected())
						&& cmbDestination.getSelectedItem().equals("Oxford"))
					{
						totalCost = (tax * MilesK20) / 100;
						String sTax = String.format("£%.2f", totalCost-18);
						txtTax.setText(sTax);
						String subTotal = String.format("£%.2f",MilesK20);
						txtSubTotal.setText(subTotal);
						String Total = String.format("£%.2f",MilesK20 + totalCost-18);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("STD");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("NIL");
						txtChild.setText("ONE");
					}
				else if((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected())
						&& cmbDestination.getSelectedItem().equals("Oxford"))
					{
						totalCost = (tax * (MilesK8*2)) / 100;
						String sTax = String.format("£%.2f", totalCost-18);
						txtTax.setText(sTax);
						String subTotal = String.format("£%.2f",MilesK8 *2);
						txtSubTotal.setText(subTotal);
						String Total = String.format("£%.2f",((MilesK8 + totalCost)*2)-18);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("STD");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("NIL");
						txtChild.setText("ONE");
					}
				else if((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())
						&& cmbDestination.getSelectedItem().equals("Leed"))
					{
						totalCost = (tax * MilesK30) / 100;
						String sTax = String.format("£%.2f", totalCost);
						txtTax.setText(sTax);
						String subTotal = String.format("£%.2f",MilesK30);
						txtSubTotal.setText(subTotal);
						String Total = String.format("£%.2f",MilesK30 + totalCost);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("STD");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("ONE");
						txtChild.setText("NIL");
					}
				else if((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected())
						&& cmbDestination.getSelectedItem().equals("Leed"))
					{
						totalCost = (tax * (MilesK8*2)) / 100;
						String sTax = String.format("£%.2f", totalCost);
						txtTax.setText(sTax);
						String subTotal = String.format("£%.2f",MilesK8*2);
						txtSubTotal.setText(subTotal);
						String Total = String.format("£%.2f",(MilesK8 + totalCost)*2);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("STD");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("ONE");
						txtChild.setText("NIL");
					}
				else if((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected())
						&& cmbDestination.getSelectedItem().equals("Leed"))
					{
						totalCost = (tax * MilesK30) / 100;
						String sTax = String.format("£%.2f", totalCost - 18);
						txtTax.setText(sTax);
						String subTotal = String.format("£%.2f",MilesK30);
						txtSubTotal.setText(subTotal);
						String Total = String.format("£%.2f",MilesK30 + totalCost-18);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("STD");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("NIL");
						txtChild.setText("ONE");
					}
				else if((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected())
						&& cmbDestination.getSelectedItem().equals("Leed"))
					{
						totalCost = (tax * (MilesK8*2)) / 100;
						String sTax = String.format("£%.2f", totalCost-18);
						txtTax.setText(sTax);
						String subTotal = String.format("£%.2f",MilesK8*2);
						txtSubTotal.setText(subTotal);
						String Total = String.format("£%.2f",((MilesK8 + totalCost)*2)-18);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("STD");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("NIL");
						txtChild.setText("ONE");
					}
				else if((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())
						&& cmbDestination.getSelectedItem().equals("Kilburn"))
					{
						totalCost = (tax * MilesK8) / 100;
						String sTax = String.format("£%.2f", totalCost);
						txtTax.setText(sTax);
						String subTotal = String.format("£%.2f",MilesK8);
						txtSubTotal.setText(subTotal);
						String Total = String.format("£%.2f",MilesK8 + totalCost);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("STD");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("ONE");
						txtChild.setText("NIL");
					}
					else if((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected())
							&& cmbDestination.getSelectedItem().equals("Kilburn"))
						{
							totalCost = (tax * MilesK8) / 100;
							String sTax = String.format("£%.2f", totalCost);
							txtTax.setText(sTax);
							String subTotal = String.format("£%.2f",MilesK8*2);
							txtSubTotal.setText(subTotal);
							String Total = String.format("£%.2f",(MilesK8 + totalCost)*2);
							txtTotal.setText(Total);
							txtPrice.setText(Total);
							txtClass.setText("STD");
							txtTicket.setText("ONE WAY");
							txtAdult.setText("ONE");
							txtChild.setText("NIL");
						}
					else if((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected())
							&& cmbDestination.getSelectedItem().equals("Kilburn"))
						{
							totalCost = (tax * MilesK8) / 100;
							String sTax = String.format("£%.2f", totalCost - 18);
							txtTax.setText(sTax);
							String subTotal = String.format("£%.2f",MilesK8);
							txtSubTotal.setText(subTotal);
							String Total = String.format("£%.2f",(MilesK8 + totalCost)-18);
							txtTotal.setText(Total);
							txtPrice.setText(Total);
							txtClass.setText("STD");
							txtTicket.setText("ONE WAY");
							txtAdult.setText("NIL");
							txtChild.setText("ONE");
						}
					else if((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected())
							&& cmbDestination.getSelectedItem().equals("Kilburn"))
						{
							totalCost = (tax * MilesK8) / 100;
							String sTax = String.format("£%.2f", totalCost-18);
							txtTax.setText(sTax);
							String subTotal = String.format("£%.2f",MilesK8*2);
							txtSubTotal.setText(subTotal);
							String Total = String.format("£%.2f",((MilesK8 + totalCost)*2)-18);
							txtTotal.setText(Total);
							txtPrice.setText(Total);
							txtClass.setText("STD");
							txtTicket.setText("ONE WAY");
							txtAdult.setText("NIL");
							txtChild.setText("ONE");
						}
					else if((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())
							&& cmbDestination.getSelectedItem().equals("Preston"))
						{
							totalCost = (tax * MilesK12) / 100;
							String sTax = String.format("£%.2f", totalCost);
							txtTax.setText(sTax);
							String subTotal = String.format("£%.2f",MilesK12);
							txtSubTotal.setText(subTotal);
							String Total = String.format("£%.2f",MilesK12 + totalCost);
							txtTotal.setText(Total);
							txtPrice.setText(Total);
							txtClass.setText("STD");
							txtTicket.setText("ONE WAY");
							txtAdult.setText("ONE");
							txtChild.setText("NIL");
						}
					else if((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected())
							&& cmbDestination.getSelectedItem().equals("Preston"))
						{
							totalCost = (tax * (MilesK12)*2) / 100;
							String sTax = String.format("£%.2f", totalCost);
							txtTax.setText(sTax);
							String subTotal = String.format("£%.2f",MilesK12*2);
							txtSubTotal.setText(subTotal);
							String Total = String.format("£%.2f",(MilesK12 + totalCost)*2);
							txtTotal.setText(Total);
							txtPrice.setText(Total);
							txtClass.setText("STD");
							txtTicket.setText("ONE WAY");
							txtAdult.setText("ONE");
							txtChild.setText("NIL");
						}
					else if((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected())
							&& cmbDestination.getSelectedItem().equals("Preston"))
						{
							totalCost = (tax * MilesK12) / 100;
							String sTax = String.format("£%.2f", totalCost-18);
							txtTax.setText(sTax);
							String subTotal = String.format("£%.2f",MilesK12);
							txtSubTotal.setText(subTotal);
							String Total = String.format("£%.2f",MilesK12 + totalCost - 18);
							txtTotal.setText(Total);
							txtPrice.setText(Total);
							txtClass.setText("STD");
							txtTicket.setText("ONE WAY");
							txtAdult.setText("NIL");
							txtChild.setText("ONE");
						}
					else if((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected())
							&& cmbDestination.getSelectedItem().equals("Preston"))
						{
							totalCost = (tax * (MilesK8*2)) / 100;
							String sTax = String.format("£%.2f", totalCost-18);
							txtTax.setText(sTax);
							String subTotal = String.format("£%.2f",MilesK8*2);
							txtSubTotal.setText(subTotal);
							String Total = String.format("£%.2f",((MilesK8 + totalCost)*2)-18);
							txtTotal.setText(Total);
							txtPrice.setText(Total);
							txtClass.setText("STD");
							txtTicket.setText("ONE WAY");
							txtAdult.setText("NIL");
							txtChild.setText("ONE");
						}
					else if((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())
							&& cmbDestination.getSelectedItem().equals("Oxford"))
						{
							totalCost = (tax * MilesK20) / 100;
							String sTax = String.format("£%.2f", totalCost);
							txtTax.setText(sTax);
							String subTotal = String.format("£%.2f",MilesK20);
							txtSubTotal.setText(subTotal);
							String Total = String.format("£%.2f",MilesK20 + totalCost);
							txtTotal.setText(Total);
							txtPrice.setText(Total);
							txtClass.setText("STD");
							txtTicket.setText("ONE WAY");
							txtAdult.setText("ONE");
							txtChild.setText("NIL");
						}
					else if((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected())
							&& cmbDestination.getSelectedItem().equals("Oxford"))
						{
							totalCost = (tax * (MilesK8*2)) / 100;
							String sTax = String.format("£%.2f", totalCost);
							txtTax.setText(sTax);
							String subTotal = String.format("£%.2f",MilesK8*2);
							txtSubTotal.setText(subTotal);
							String Total = String.format("£%.2f",(MilesK8 + totalCost)*2);
							txtTotal.setText(Total);
							txtPrice.setText(Total);
							txtClass.setText("STD");
							txtTicket.setText("ONE WAY");
							txtAdult.setText("ONE");
							txtChild.setText("NIL");
						}
					else if((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected())
							&& cmbDestination.getSelectedItem().equals("Oxford"))
						{
							totalCost = (tax * MilesK20) / 100;
							String sTax = String.format("£%.2f", totalCost-18);
							txtTax.setText(sTax);
							String subTotal = String.format("£%.2f",MilesK20);
							txtSubTotal.setText(subTotal);
							String Total = String.format("£%.2f",MilesK20 + totalCost-18);
							txtTotal.setText(Total);
							txtPrice.setText(Total);
							txtClass.setText("STD");
							txtTicket.setText("ONE WAY");
							txtAdult.setText("NIL");
							txtChild.setText("ONE");
						}
					else if((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected())
							&& cmbDestination.getSelectedItem().equals("Oxford"))
						{
							totalCost = (tax * (MilesK8*2)) / 100;
							String sTax = String.format("£%.2f", totalCost-18);
							txtTax.setText(sTax);
							String subTotal = String.format("£%.2f",MilesK8 *2);
							txtSubTotal.setText(subTotal);
							String Total = String.format("£%.2f",((MilesK8 + totalCost)*2)-18);
							txtTotal.setText(Total);
							txtPrice.setText(Total);
							txtClass.setText("STD");
							txtTicket.setText("ONE WAY");
							txtAdult.setText("NIL");
							txtChild.setText("ONE");
						}
					else if((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())
							&& cmbDestination.getSelectedItem().equals("Leed"))
						{
							totalCost = (tax * MilesK30) / 100;
							String sTax = String.format("£%.2f", totalCost);
							txtTax.setText(sTax);
							String subTotal = String.format("£%.2f",MilesK30);
							txtSubTotal.setText(subTotal);
							String Total = String.format("£%.2f",MilesK30 + totalCost);
							txtTotal.setText(Total);
							txtPrice.setText(Total);
							txtClass.setText("STD");
							txtTicket.setText("ONE WAY");
							txtAdult.setText("ONE");
							txtChild.setText("NIL");
						}
					else if((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected())
							&& cmbDestination.getSelectedItem().equals("Leed"))
						{
							totalCost = (tax * (MilesK8*2)) / 100;
							String sTax = String.format("£%.2f", totalCost);
							txtTax.setText(sTax);
							String subTotal = String.format("£%.2f",MilesK8*2);
							txtSubTotal.setText(subTotal);
							String Total = String.format("£%.2f",(MilesK8 + totalCost)*2);
							txtTotal.setText(Total);
							txtPrice.setText(Total);
							txtClass.setText("STD");
							txtTicket.setText("ONE WAY");
							txtAdult.setText("ONE");
							txtChild.setText("NIL");
						}
					else if((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected())
							&& cmbDestination.getSelectedItem().equals("Leed"))
						{
							totalCost = (tax * MilesK30) / 100;
							String sTax = String.format("£%.2f", totalCost - 18);
							txtTax.setText(sTax);
							String subTotal = String.format("£%.2f",MilesK30);
							txtSubTotal.setText(subTotal);
							String Total = String.format("£%.2f",MilesK30 + totalCost-18);
							txtTotal.setText(Total);
							txtPrice.setText(Total);
							txtClass.setText("STD");
							txtTicket.setText("ONE WAY");
							txtAdult.setText("NIL");
							txtChild.setText("ONE");
						}
					else if((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected())
							&& cmbDestination.getSelectedItem().equals("Leed"))
						{
							totalCost = (tax * (MilesK8*2)) / 100;
							String sTax = String.format("£%.2f", totalCost-18);
							txtTax.setText(sTax);
							String subTotal = String.format("£%.2f",MilesK8*2);
							txtSubTotal.setText(subTotal);
							String Total = String.format("£%.2f",((MilesK8 + totalCost)*2)-18);
							txtTotal.setText(Total);
							txtPrice.setText(Total);
							txtClass.setText("STD");
							txtTicket.setText("ONE WAY");
							txtAdult.setText("NIL");
							txtChild.setText("ONE");
						}
			}
		});
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				txtTime.setText(tTime.format(timer.getTime()));
				
				SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yyyy");
				txtDate.setText(Tdate.format(timer.getTime()));
				
				txtFrom.setText("London *");
				txtTo.setText((String) cmbDestination.getSelectedItem()+ " *");
				
				int num1;
				String q1 ="";
				num1 = 1325 + (int) (Math.random()*4238);
				q1 += num1+1325;
				txtTicketNo.setText(q1);
				
				txtRoute.setText("ANY");
				}
		});
		btnTotal.setToolTipText("Total Cost of Ticket");
		btnTotal.setForeground(new Color(0, 0, 0));
		btnTotal.setBackground(new Color(204, 204, 255));
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnTotal.setBounds(72, 569, 146, 43);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setToolTipText("Reset System");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setText(null);
				rdbtnAdult.setSelected(false);
				rdbtnChild.setSelected(false);
				rdbtnStandard.setSelected(false);
				rdbtnEconomy.setSelected(false);
				rdbtnFirstClass.setSelected(false);
				cmbDestination.setSelectedItem("Destination");
				rdbtnSingleTicket.setSelected(false);
				rdbtnReturnTicket.setSelected(false);
				txtTo.setText(null);
				txtFrom.setText(null);
				txtDate.setText(null);
				txtTime.setText(null);
				txtPrice.setText(null);
				txtRoute.setText(null);
				txtChild.setText(null);
				txtClass.setText(null);
				txtTicketNo.setText(null);
				txtTicket.setText(null);
				txtAdult.setText(null);
			}
		});
		btnReset.setBackground(new Color(204, 204, 255));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnReset.setBounds(274, 569, 146, 43);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setToolTipText("Exit System");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Ticketing Systems",
				JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBackground(new Color(204, 204, 255));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnExit.setForeground(new Color(0, 0, 0));
		btnExit.setBounds(491, 569, 146, 43);
		frame.getContentPane().add(btnExit);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtSubTotal.setBounds(269, 392, 234, 39);
		frame.getContentPane().add(txtSubTotal);
		txtSubTotal.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtTotal.setBounds(269, 457, 234, 43);
		frame.getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(721, 89, 9, 535);
		frame.getContentPane().add(separator_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("Class");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3_1.setBounds(754, 115, 121, 39);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Ticket");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3_2.setBounds(908, 115, 121, 39);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Adult");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3_3.setBounds(1048, 115, 121, 39);
		frame.getContentPane().add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Child");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3_4.setBounds(1200, 115, 121, 39);
		frame.getContentPane().add(lblNewLabel_3_4);
		
		txtClass = new JTextField();
		txtClass.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtClass.setColumns(10);
		txtClass.setBounds(740, 197, 113, 39);
		frame.getContentPane().add(txtClass);
		
		txtTicket = new JTextField();
		txtTicket.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtTicket.setColumns(10);
		txtTicket.setBounds(882, 197, 139, 39);
		frame.getContentPane().add(txtTicket);
		
		txtAdult = new JTextField();
		txtAdult.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtAdult.setColumns(10);
		txtAdult.setBounds(1031, 197, 113, 39);
		frame.getContentPane().add(txtAdult);
		
		txtChild = new JTextField();
		txtChild.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtChild.setColumns(10);
		txtChild.setBounds(1178, 197, 113, 39);
		frame.getContentPane().add(txtChild);
		
		JLabel lblNewLabel_2_1 = new JLabel("From");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(754, 283, 70, 39);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("To");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_2.setBounds(754, 362, 70, 39);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Date");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_3.setBounds(754, 436, 70, 39);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Time");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_4.setBounds(754, 522, 70, 39);
		frame.getContentPane().add(lblNewLabel_2_4);
		
		txtFrom = new JTextField();
		txtFrom.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtFrom.setColumns(10);
		txtFrom.setBounds(859, 289, 170, 39);
		frame.getContentPane().add(txtFrom);
		
		txtTo = new JTextField();
		txtTo.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtTo.setColumns(10);
		txtTo.setBounds(859, 368, 170, 39);
		frame.getContentPane().add(txtTo);
		
		txtDate = new JTextField();
		txtDate.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtDate.setColumns(10);
		txtDate.setBounds(859, 442, 170, 39);
		frame.getContentPane().add(txtDate);
		
		txtTime = new JTextField();
		txtTime.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtTime.setColumns(10);
		txtTime.setBounds(859, 522, 170, 39);
		frame.getContentPane().add(txtTime);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(740, 257, 606, 2);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(1048, 269, 17, 355);
		frame.getContentPane().add(separator_6);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Ticket No");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_1_1.setBounds(1092, 283, 178, 39);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		txtTicketNo = new JTextField();
		txtTicketNo.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtTicketNo.setColumns(10);
		txtTicketNo.setBounds(1092, 332, 160, 39);
		frame.getContentPane().add(txtTicketNo);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Price");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_1_1_1.setBounds(1092, 392, 178, 39);
		frame.getContentPane().add(lblNewLabel_2_1_1_1);
		
		txtPrice = new JTextField();
		txtPrice.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtPrice.setColumns(10);
		txtPrice.setBounds(1092, 436, 160, 39);
		frame.getContentPane().add(txtPrice);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Route");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_1_1_1_1.setBounds(1092, 510, 178, 39);
		frame.getContentPane().add(lblNewLabel_2_1_1_1_1);
		
		txtRoute = new JTextField();
		txtRoute.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtRoute.setColumns(10);
		txtRoute.setBounds(1092, 559, 160, 39);
		frame.getContentPane().add(txtRoute);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(41, 634, 1305, 7);
		frame.getContentPane().add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(740, 170, 606, 2);
		frame.getContentPane().add(separator_8);
	}
}
