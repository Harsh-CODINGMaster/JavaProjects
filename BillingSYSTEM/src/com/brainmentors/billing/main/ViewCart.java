package com.brainmentors.billing.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.brainmentors.billing.model.Product;
import com.brainmentors.billing.model.ProductTableModel;
import com.brainmentors.billing.utils.MailSender; 

public class ViewCart extends JFrame {

	private JPanel contentPane;
	private JTable table;

	private void printIt() {
		try {
			SendEmail se = new SendEmail(); 
//			 final String senderEmailID = "rishabhraj210@gmail.com";
//			 final String senderPassword = "7277077256";
//			 final String emailSMTPserver = "smtp.gmail.com";
//			 final String emailServerPort = "465";
//			 String receiverEmailID = null;
//			 String emailSubject = "Test Mail";
//			 String emailBody = ":)";
			table.print();
			se.SendEmail2();
		} catch (PrinterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ViewCart(ArrayList<Product> list) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblItemsInCart = new JLabel("Items in Cart");
		lblItemsInCart.setForeground(Color.RED);
		lblItemsInCart.setHorizontalAlignment(SwingConstants.CENTER);
		lblItemsInCart.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblItemsInCart.setBounds(100, 25, 218, 29);
		contentPane.add(lblItemsInCart);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 82, 335, 190);
		contentPane.add(scrollPane);
		ProductTableModel model = new ProductTableModel(list);
		table = new JTable(model);
		table.getColumnModel().getColumn(0).setHeaderValue("ID");
		table.getColumnModel().getColumn(1).setHeaderValue("NAME");
		table.getColumnModel().getColumn(2).setHeaderValue("PRICE");
		table.getColumnModel().getColumn(3).setHeaderValue("QTY");
		table.getColumnModel().getColumn(4).setHeaderValue("DESC.");
		scrollPane.setViewportView(table);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			printIt();
			}
		});
		btnPrint.setBounds(6, 29, 126, 29);
		contentPane.add(btnPrint);
	}
}