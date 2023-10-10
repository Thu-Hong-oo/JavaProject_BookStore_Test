package form;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class SachForm extends JPanel {
	private JTextField textField;
	private JTable tableSach;
	private DefaultTableModel modelSach;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	/**
	 * Create the panel.
	 */
	public SachForm() {
		setLayout(null);
		setSize(1100, 610);
		setBackground(Color.WHITE);
		
		textField = new JTextField();
		textField.setBounds(77, 11, 185, 26);
		add(textField);
		textField.setColumns(10);

		JLabel lblTmKim = new JLabel("Tìm kiếm");
		lblTmKim.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTmKim.setBounds(10, 11, 81, 26);
		add(lblTmKim);
	
		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("TitledBorder.border"));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 48, 1080, 270);
		add(panel);
		panel.setLayout(null);
		
		
		String[] headerSach = { "Mã sách", "Tên sách ", "Tác giả","Thể loại", "Số lượng","Giá nhập","Giá bán" };
		modelSach = new DefaultTableModel(headerSach, 0);
		tableSach = new JTable(modelSach);
		JScrollPane scpSach = new JScrollPane(tableSach, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		scpSach.setBounds(10, 11, 1060, 248);
		panel.add(scpSach);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(UIManager.getBorder("TitledBorder.border"));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 341, 1080, 258);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTnSch = new JLabel("Tên sách");
		lblTnSch.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTnSch.setBounds(10, 62, 81, 26);
		panel_1.add(lblTnSch);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(116, 63, 211, 26);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel = new JLabel("Mã sách");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 24, 81, 26);
		panel_1.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(116, 25, 211, 26);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("Tác giả");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 99, 81, 26);
		panel_1.add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(116, 100, 211, 26);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(116, 138, 211, 26);
		panel_1.add(textField_4);
		
		JLabel lblTnSch_1 = new JLabel("Thể loại");
		lblTnSch_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTnSch_1.setBounds(10, 137, 81, 26);
		panel_1.add(lblTnSch_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(116, 176, 211, 26);
		panel_1.add(textField_5);
		
		JLabel lblTnSch_1_1 = new JLabel("Số lượng");
		lblTnSch_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTnSch_1_1.setBounds(10, 175, 81, 26);
		panel_1.add(lblTnSch_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(522, 63, 211, 26);
		panel_1.add(textField_6);
		
		JLabel lblNewLabel_1_1 = new JLabel("Giá nhập");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(416, 62, 81, 26);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblTnSch_1_2 = new JLabel("Giá bán");
		lblTnSch_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTnSch_1_2.setBounds(416, 100, 81, 26);
		panel_1.add(lblTnSch_1_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(522, 101, 211, 26);
		panel_1.add(textField_7);
		
		JButton btnNewButton = new JButton("Cập nhật");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(250, 128, 114));
		btnNewButton.setBounds(914, 89, 114, 36);
		panel_1.add(btnNewButton);
		
		JButton btnToMi = new JButton("Tạo mới");
		btnToMi.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnToMi.setBackground(new Color(250, 128, 114));
		btnToMi.setBounds(914, 27, 114, 36);
		panel_1.add(btnToMi);
		
		JButton btnLmMi = new JButton("Làm mới");
		btnLmMi.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLmMi.setBackground(new Color(250, 128, 114));
		btnLmMi.setBounds(914, 152, 114, 36);
		panel_1.add(btnLmMi);
		
		JLabel lblTnSch_1_2_1 = new JLabel("Mô tả");
		lblTnSch_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTnSch_1_2_1.setBounds(416, 138, 81, 26);
		panel_1.add(lblTnSch_1_2_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(520, 140, 213, 82);
		panel_1.add(textArea);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("NXB");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1_1.setBounds(416, 24, 81, 26);
		panel_1.add(lblNewLabel_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(522, 24, 211, 26);
		panel_1.add(comboBox);
		
	}
}
