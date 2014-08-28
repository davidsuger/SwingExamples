package swing26.Tables.gui;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import swing26.Tables.model.Person;

public class TablePanel extends JPanel {
	private JTable table;
	private PersonTableModel tableModel;

	public TablePanel() {

		tableModel = new PersonTableModel();
		table = new JTable(tableModel);

		setLayout(new BorderLayout());
		add(new JScrollPane(table), BorderLayout.CENTER);
		// add(table, BorderLayout.CENTER);
	}

	public void setData(List<Person> db) {
		tableModel.setData(db);
	}

	public void refresh() {
		tableModel.fireTableDataChanged();
	}

}
