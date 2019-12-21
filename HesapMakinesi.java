package com.sdmercan;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HesapMakinesi {

	private JFrame frmHesapMakinesi;
	private JTextField txtSonuc;
	private double sayi1 = 0, sayi2 = 0;
	private String islem = "";
	private boolean negatifSayi = false;
	private String islem1 = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HesapMakinesi window = new HesapMakinesi();
					window.frmHesapMakinesi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HesapMakinesi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHesapMakinesi = new JFrame();
		frmHesapMakinesi.getContentPane().setForeground(Color.GRAY);
		frmHesapMakinesi.setTitle("Hesap Makinesi");
		frmHesapMakinesi.setBounds(100, 100, 309, 282);
		frmHesapMakinesi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHesapMakinesi.getContentPane().setLayout(null);

		txtSonuc = new JTextField();
		txtSonuc.setBackground(Color.WHITE);
		txtSonuc.setEditable(false);
		txtSonuc.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSonuc.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtSonuc.setBounds(10, 11, 272, 30);
		frmHesapMakinesi.getContentPane().add(txtSonuc);
		txtSonuc.setColumns(10);

		JButton btnKalan = new JButton("%");
		btnKalan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				islem = "%";
				if (!txtSonuc.getText().equals(""))
					sayi1 = Double.parseDouble(txtSonuc.getText());
				txtSonuc.setText("");

			}
		});
		btnKalan.setBounds(10, 52, 56, 35);
		frmHesapMakinesi.getContentPane().add(btnKalan);

		JButton button = new JButton("");
		button.setBounds(64, 52, 56, 35);
		frmHesapMakinesi.getContentPane().add(button);

		JButton btnTemizle = new JButton("C");
		btnTemizle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSonuc.setText("");
			}
		});
		btnTemizle.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTemizle.setBounds(118, 52, 56, 35);
		frmHesapMakinesi.getContentPane().add(btnTemizle);

		JButton btnSil = new JButton("X");
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtSonuc.getText().equals("")) {
					String sayi = txtSonuc.getText();
					if (sayi.length() >= 2) {
						String yeniSayi = sayi.substring(0, sayi.length() - 1);
						sayi1 = Double.parseDouble(yeniSayi);
						txtSonuc.setText(yeniSayi);
					}
				}

			}
		});
		btnSil.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSil.setBounds(172, 52, 56, 35);
		frmHesapMakinesi.getContentPane().add(btnSil);

		JButton btnBol = new JButton("/");
		btnBol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				islem = "/";
				if (!txtSonuc.getText().equals(""))
					sayi1 = Double.parseDouble(txtSonuc.getText());
				txtSonuc.setText("");
			}
		});
		btnBol.setBounds(226, 52, 56, 35);
		frmHesapMakinesi.getContentPane().add(btnBol);

		JButton btnKok = new JButton("√");
		btnKok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				islem = "√";
			}
		});
		btnKok.setBounds(10, 87, 56, 35);
		frmHesapMakinesi.getContentPane().add(btnKok);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSonuc.setText(txtSonuc.getText() + "7");
			}
		});
		btn7.setBounds(64, 87, 56, 35);
		frmHesapMakinesi.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSonuc.setText(txtSonuc.getText() + "8");
			}
		});
		btn8.setBounds(118, 87, 56, 35);
		frmHesapMakinesi.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSonuc.setText(txtSonuc.getText() + "9");
			}
		});
		btn9.setBounds(172, 87, 56, 35);
		frmHesapMakinesi.getContentPane().add(btn9);

		JButton btnCarp = new JButton("*");
		btnCarp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				islem = "*";
				if (!txtSonuc.getText().equals(""))
					sayi1 = Double.parseDouble(txtSonuc.getText());
				txtSonuc.setText("");
			}
		});
		btnCarp.setBounds(226, 87, 56, 35);
		frmHesapMakinesi.getContentPane().add(btnCarp);

		JButton btnKaresi = new JButton("x²");
		btnKaresi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				islem = "x²";
			}
		});
		btnKaresi.setBounds(10, 122, 56, 35);
		frmHesapMakinesi.getContentPane().add(btnKaresi);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSonuc.setText(txtSonuc.getText() + "4");
			}
		});
		btn4.setBounds(64, 122, 56, 35);
		frmHesapMakinesi.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSonuc.setText(txtSonuc.getText() + "5");
			}
		});
		btn5.setBounds(118, 122, 56, 35);
		frmHesapMakinesi.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSonuc.setText(txtSonuc.getText() + "6");
			}
		});
		btn6.setBounds(172, 122, 56, 35);
		frmHesapMakinesi.getContentPane().add(btn6);

		JButton btnCikar = new JButton("-");
		btnCikar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				islem = "-";
				if (!txtSonuc.getText().equals(""))
					sayi1 = Double.parseDouble(txtSonuc.getText());
				txtSonuc.setText("");
			}
		});
		btnCikar.setBounds(226, 122, 56, 35);
		frmHesapMakinesi.getContentPane().add(btnCikar);

		JButton btnKup = new JButton("x³");
		btnKup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				islem = "x³";
			}
		});
		btnKup.setBounds(10, 157, 56, 35);
		frmHesapMakinesi.getContentPane().add(btnKup);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSonuc.setText(txtSonuc.getText() + "1");
			}
		});
		btn1.setBounds(64, 157, 56, 35);
		frmHesapMakinesi.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSonuc.setText(txtSonuc.getText() + "2");
			}
		});
		btn2.setBounds(118, 157, 56, 35);
		frmHesapMakinesi.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSonuc.setText(txtSonuc.getText() + "3");
			}
		});
		btn3.setBounds(172, 157, 56, 35);
		frmHesapMakinesi.getContentPane().add(btn3);

		JButton btnTopla = new JButton("+");
		btnTopla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				islem = "+";
				if (!txtSonuc.getText().equals(""))
					sayi1 = Double.parseDouble(txtSonuc.getText());
				txtSonuc.setText("");
			}
		});
		btnTopla.setBounds(226, 157, 56, 35);
		frmHesapMakinesi.getContentPane().add(btnTopla);

		JButton btnTersi = new JButton("1/x");
		btnTersi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				islem = "1/x";
			}
		});
		btnTersi.setBounds(10, 192, 56, 35);
		frmHesapMakinesi.getContentPane().add(btnTersi);

		JButton btnTamSayi = new JButton("±");
		btnTamSayi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSonuc.setText("-" + txtSonuc.getText());
			}
		});
		btnTamSayi.setBounds(64, 192, 56, 35);
		frmHesapMakinesi.getContentPane().add(btnTamSayi);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSonuc.setText(txtSonuc.getText() + "0");
			}
		});
		btn0.setBounds(118, 192, 56, 35);
		frmHesapMakinesi.getContentPane().add(btn0);

		JButton btnOndalik = new JButton(".");
		btnOndalik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSonuc.setText(txtSonuc.getText() + ".");
			}
		});
		btnOndalik.setBounds(172, 192, 56, 35);
		frmHesapMakinesi.getContentPane().add(btnOndalik);

		JButton btnSonuc = new JButton("=");
		btnSonuc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double sonuc = 0;
				if (!txtSonuc.getText().equals(""))
					sayi2 = Double.parseDouble(txtSonuc.getText());

				switch (islem) {
				case "+":
					sonuc = sayi1 + sayi2;
					break;

				case "-":
					if (sayi2 < 0)
						sonuc = sayi1 + sayi2;
					else
						sonuc = sayi1 - sayi2;
					break;

				case "*":
					sonuc = sayi1 * sayi2;
					break;

				case "/":
					if (sayi2 == 0)
						sonuc = 0;
					else
						sonuc = sayi1 / sayi2;
					break;

				case "%":
					sonuc = sayi1 % sayi2;
					break;

				case "√":
					sonuc = Math.sqrt(sayi2);
					break;

				case "x²":
					sonuc = Math.pow(sayi2, 2);
					break;

				case "x³":
					sonuc = Math.pow(sayi2, 3);
					break;

				case "1/x":
					if (sayi2 == 0)
						sonuc = 0;
					else
						sonuc = 1 / sayi2;
					break;

				}
				String string = "" + sonuc;
				if (string.lastIndexOf(".0") > 0) {
					string = string.substring(0, string.length() - 2);
				}
				txtSonuc.setText(String.valueOf(string));
				islem = "";
			}
		});
		btnSonuc.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSonuc.setBounds(226, 192, 56, 35);
		frmHesapMakinesi.getContentPane().add(btnSonuc);
	}
}
