package form;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class CapNhatSanPhamForm extends JPanel {
	private JTable tableSach;
	private DefaultTableModel modelSach;
	private JTable tableVPP;
	private DefaultTableModel modelVPP;
	private JTextField textField;
	/**
	 * Create the panel.
	 */
	public CapNhatSanPhamForm() {
		setBackground(Color.WHITE);
		setLayout(null);
		setSize(1100, 610);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 1080, 588);
		add(tabbedPane);
		
		JPanel panelSach = new JPanel();
		panelSach.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Sách", null, panelSach, null);
		panelSach.setLayout(null);
		
		String[] headerDH = { "Mã Sách", "Tên Sách", "Tác Giả",  "Thể Loại", "Số Lượng", "Mô Tả"," Nhà Cung Cấp", "Giá Nhập", "Giá Bán" };
		modelSach = new DefaultTableModel(headerDH, 0);
		tableSach = new JTable(modelSach);
		JScrollPane scpSach = new JScrollPane(tableSach, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scpSach.setBounds(12, 54, 678, 287);
		panelSach.add(scpSach);
		
		textField = new JTextField();
		textField.setBounds(85, 11, 156, 20);
		panelSach.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Tìm Kiếm");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(12, 11, 63, 20);
		panelSach.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("hình ảnh");
		lblNewLabel_1.setBounds(770, 37, 250, 256);
		panelSach.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tên Sách");
		lblNewLabel_2.setBounds(770, 315, 68, 14);
		panelSach.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(846, 315, 144, 14);
		panelSach.add(lblNewLabel_3);
		
		JPanel panelVPP = new JPanel();
		panelVPP.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Văn phòng phẩm & Quà lưu niệm", null, panelVPP, null);
	}

}
