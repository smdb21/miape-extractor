package org.proteored.pacom.analysis.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * This class represents a file containing an index of the files stored locally. <br>
 * The index indexes the files with the identifier of the MIAPE and the values
 * are the absolute paths separated by commas.
 * 
 * @author Salva
 * 
 */
public class LocalFilesIndex {
	private static final String TAB = "\t";
	private static final String COMMA = ",";
	private static final String BEGIN_BY_ID = "BEGIN by ID";
	private static final String BEGIN_BY_PROJECT = "BEGIN by project";

	/** index file **/
	private static File indexFile;
	private static String INDEX_FILE_NAME = "local_files_index.idx";
	private static final HashMap<String, Set<File>> indexByProject = new HashMap<String, Set<File>>();
	private static final HashMap<Integer, Set<File>> indexByMiapeID = new HashMap<Integer, Set<File>>();
	private static LocalFilesIndex instance;

	public static LocalFilesIndex getInstance() throws IOException {
		if (instance == null)
			instance = new LocalFilesIndex();
		return instance;
	}

	private LocalFilesIndex() throws IOException {
		indexFile = new File(FileManager.getMiapeLocalDataPath()
				+ INDEX_FILE_NAME);
		if (indexFile.exists())
			loadIndex();
	}

	private void loadIndex() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(
				LocalFilesIndex.indexFile));
		try {
			String line;
			boolean byProject = false;
			while ((line = br.readLine()) != null) {
				line = line.trim();
				if (line.startsWith("#") || "".equals(line))
					continue;
				if (line.startsWith(BEGIN_BY_PROJECT)) {
					byProject = true;
					continue;
				}
				if (line.startsWith(BEGIN_BY_ID)) {
					byProject = false;
					continue;
				}
				String[] split = line.split(TAB);
				String index = split[0];
				String csvFiles = split[1];
				Set<File> files = new HashSet<File>();
				if (csvFiles.contains(",")) {
					String[] split2 = csvFiles.split(COMMA);
					for (String string : split2) {
						files.add(new File(string));
					}
				} else {
					files.add(new File(csvFiles));
				}

				if (files != null) {
					if (!byProject) {
						int numericalIndex = Integer.valueOf(index);
						if (LocalFilesIndex.indexByMiapeID
								.containsKey(numericalIndex)) {
							LocalFilesIndex.indexByMiapeID.get(numericalIndex)
									.addAll(files);
						} else {
							LocalFilesIndex.indexByMiapeID.put(numericalIndex,
									files);
						}
					} else {
						if (LocalFilesIndex.indexByProject.containsKey(index)) {
							LocalFilesIndex.indexByProject.get(index).addAll(
									files);
						} else {
							LocalFilesIndex.indexByProject.put(index, files);
						}
					}
				}
			}
		} finally {
			if (br != null)
				br.close();
		}
	}

	private void writeIndex() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(
				LocalFilesIndex.indexFile));
		try {
			bw.write("# this file serves as index for the files associated to the locally created miape files\n");
			bw.write("# INDEX BY MIAPE IDENTIFIERS\n");
			if (!LocalFilesIndex.indexByMiapeID.isEmpty()) {
				bw.write(BEGIN_BY_ID + "\n");
				for (Integer index : LocalFilesIndex.indexByMiapeID.keySet()) {
					Set<File> files = LocalFilesIndex.indexByMiapeID.get(index);
					if (files != null && !files.isEmpty()) {
						bw.write(index + TAB);
						int i = 0;
						for (File file : files) {
							if (i > 0)
								bw.write(COMMA);
							bw.write(file.getAbsolutePath());
							i++;
						}
						bw.write("\n");
					}
				}
				bw.write("\n");
			}

			bw.write("# INDEX BY MIAPE PROJECTS\n");
			if (!LocalFilesIndex.indexByProject.isEmpty()) {
				bw.write(BEGIN_BY_PROJECT + "\n");
				for (String projectName : LocalFilesIndex.indexByProject
						.keySet()) {
					Set<File> files = LocalFilesIndex.indexByProject
							.get(projectName);
					if (files != null && !files.isEmpty()) {
						bw.write(projectName + TAB);
						int i = 0;
						for (File file : files) {
							if (i > 0)
								bw.write(COMMA);
							bw.write(file.getAbsolutePath());
							i++;
						}
						bw.write("\n");
					}
				}
				bw.write("\n");
			}
		} finally {
			if (bw != null)
				bw.close();
		}
	}

	public Set<File> getFilesFromMIAPEID(int index) {
		if (LocalFilesIndex.indexByMiapeID.containsKey(index)) {
			Set<File> files = LocalFilesIndex.indexByMiapeID.get(index);
			return files;
		}
		return null;
	}

	public Set<File> getFilesFromProject(String projectName) {
		if (LocalFilesIndex.indexByProject.containsKey(projectName)) {
			Set<File> files = LocalFilesIndex.indexByProject.get(projectName);
			return files;
		}
		return null;
	}

	public int getFreeIndex() {
		int index = 0;
		final Set<Integer> keySet = LocalFilesIndex.indexByMiapeID.keySet();
		for (Integer integer : keySet) {
			if (integer > index)
				index = integer;
		}
		return index + 1;
	}

	public void indexFileByProjectName(String projectName, File file)
			throws IOException {
		if (LocalFilesIndex.indexByProject.containsKey(projectName)) {
			LocalFilesIndex.indexByProject.get(projectName).add(file);
		} else {
			HashSet<File> set = new HashSet<File>();
			set.add(file);
			LocalFilesIndex.indexByProject.put(projectName, set);
		}
		writeIndex();
	}

	public void indexFileByProjectName(String projectName, String fileName)
			throws IOException {
		indexFileByProjectName(projectName, new File(fileName));
	}

	public void indexFileByMiapeID(int index, File file) throws IOException {
		if (LocalFilesIndex.indexByMiapeID.containsKey(index)) {
			LocalFilesIndex.indexByMiapeID.get(index).add(file);
		} else {
			HashSet<File> set = new HashSet<File>();
			set.add(file);
			LocalFilesIndex.indexByMiapeID.put(index, set);
		}
		writeIndex();
	}
}