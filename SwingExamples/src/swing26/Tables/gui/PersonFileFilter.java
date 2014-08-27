package swing26.Tables.gui;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class PersonFileFilter extends FileFilter {

	@Override
	public boolean accept(File file) {
		if (file.isDirectory()) {
			return true;
		}
		
		String name = file.getName();

		String extension = Utils.getFileExtension(name);
		if (extension == null) {
			return false;
		}
		if (extension.equals("per")) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String getDescription() {
		return "Person database files (*.per)";
	}
}
