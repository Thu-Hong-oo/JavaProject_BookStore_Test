package main;

import form.BanHangForm;
import form.CapNhatKhachHang;
import form.CapNhatNVForm;

import form.CapNhatSanPhamForm;
//import component.DefaultForm;
import form.DatHangForm;
import form.DoanhThuForm;
import form.GioiThieuForm;
import form.HoaDonForm;
import form.HomeForm;
import form.KhachHangForm;
import form.LapHoaDonForm;
import form.NCCForm;
import form.NXBForm;
import form.NhaCungCapForm;
import form.NhanVienForm;

import form.TKDoanhThuForm;
import form.TKKhachHangForm;
import form.TKSachForm;
import form.TaoKhuyenMaiForm;
import form.ThongKeKhachHang;
import form.ThongKeSanPhamForm;
import form.TimKiemNhanVienForm;
import form.TimKiemSanPhamForm;
import form.TroGiupForm;
import form.VPP_QLNForm;
import form.XemDanhSachKM;
import form.XemHoaDonForm;
import menu.MenuEvent;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout.Alignment;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import java.awt.CardLayout;
import java.awt.Color;

public class Main extends javax.swing.JFrame {
	public Main() {
		initDefaults(); // Đặt tùy chỉnh UI Defaults
		initComponents();
		setUndecorated(true);
		showForm(new HomeForm());
		menu1.setEvent(new MenuEvent() {
			@Override
			public void selected(int index, int subIndex) {
				switch (index) {

				case 0:
					if (subIndex == 1)
						showForm(new HomeForm());
					else if (subIndex == 2)
						showForm(new GioiThieuForm());
					else if (subIndex == 3) {
						dispose();
						LoginForm login = new LoginForm();
						login.setVisible(true);
					}
					else if (subIndex == 4)
						System.exit(0);
					break;
					
				case 1:
					if (subIndex == 1)
						showForm(new CapNhatNVForm());
					else if (subIndex == 2)
						showForm(new TimKiemNhanVienForm());
					else if (subIndex == 3)
						showForm(new BanHangForm());
					break;
				case 2:
					if (subIndex == 1)
						showForm(new CapNhatKhachHang());
					else if (subIndex == 2)
						showForm(new TKKhachHangForm());
					else if (subIndex == 3)
						showForm(new ThongKeKhachHang());
				
					break;
				case 3:
					if (subIndex == 1)
						showForm(new CapNhatSanPhamForm());
					else if (subIndex == 2)
						showForm(new TimKiemSanPhamForm());
					else if (subIndex == 3)
						showForm(new NhaCungCapForm());
					else if (subIndex == 4)
						showForm(new ThongKeSanPhamForm());
					break;
				case 4:
					if (subIndex == 1)
						showForm(new TaoKhuyenMaiForm());
					else if (subIndex == 2)
						showForm(new XemDanhSachKM());
					break;
				
				case 5:
					if (subIndex == 1)
						showForm(new XemHoaDonForm());
					else if (subIndex == 2)
						showForm(new DoanhThuForm());
				
					break;

				default:

				}
			}
		});
	}

	private void showForm(Component com) {
		if (com != null) {
			body.removeAll();
			body.add(com);
			body.repaint();
			body.revalidate();
		} else {

		}
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		scrollPaneWin111 = new scroll.win.ScrollPaneWin11();
		menu1 = new menu.Menu();
		menu1.setBackground(new Color(255, 218, 185));
		header1 = new menu.Header();
//        header1.setBackground(new Color(255, 218, 185));
		body = new javax.swing.JPanel();
//		body.setBorder(null);

		setUndecorated(true);

		jPanel1.setBackground(Color.WHITE);
		jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(163, 163, 163)));

		scrollPaneWin111.setBorder(null);
		scrollPaneWin111.setViewportView(menu1);

		body.setBackground(Color.WHITE);
		body.setLayout(new java.awt.BorderLayout());

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addComponent(scrollPaneWin111, javax.swing.GroupLayout.PREFERRED_SIZE, 225,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addContainerGap())
				.addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, 1096, Short.MAX_VALUE));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
								.addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, 565,
												Short.MAX_VALUE)
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(6, 6, 6)
												.addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addContainerGap()))));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(jPanel1,
				GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(jPanel1,
				GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE));
		getContentPane().setLayout(layout);

		// Đặt lại kích thước của JFrame
		setSize(1350, 700); // Đây là kích thước mới
		setLocationRelativeTo(null);

	}// </editor-fold>//GEN-END:initComponents

	private void initDefaults() {
		// Đặt các tùy chỉnh UI Defaults ở đây
		UIDefaults defaults = UIManager.getLookAndFeelDefaults();
		defaults.put("TableHeader.background", new Color(105, 131, 150)); // Đặt màu nền header của bảng
		defaults.put("TableHeader.foreground", Color.WHITE); // Đặt màu chữ header của bảng
		defaults.put("TableHeader.font", new Font("Tahoma", Font.BOLD, 13));
		defaults.put("Table.background", Color.WHITE); // Đặt màu nền của bảng
		defaults.put("Viewport.background", Color.WHITE); // Đặt màu nền cho JViewport của JScrollPane
	}
//		

//		try {
//			// Set Look and Feel Nimbus
//			 UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	public static void main(String[] args) {
//		    try {
//		        // here you can put the selected theme class name in JTattoo
//		        UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
//		    } catch (ClassNotFoundException ex) {
//		        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		    } catch (InstantiationException ex) {
//		        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		    } catch (IllegalAccessException ex) {
//		        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//		        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		    }
//		    
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Main frame = new Main();
				frame.setUndecorated(true);
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JPanel body;
	private menu.Header header1;
	private javax.swing.JPanel jPanel1;
	private menu.Menu menu1;
	private scroll.win.ScrollPaneWin11 scrollPaneWin111;
	// End of variables declaration//GEN-END:variables
}
