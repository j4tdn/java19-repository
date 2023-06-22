package string.immutable;

import java.io.File;
import java.util.Arrays;

public class Ex05StringDemo03MusicApp {
	private static final String MUSIC_PATH = "E:\\BKIT-JAVA19-PROGRAMING\\java19\\2.JAVA\\lesson08-string\\src\\string\\immutable";

	public static void main(String[] args) {
		String[] songs = mockFileList();
		System.out.println("mockFileList: " + Arrays.toString(songs));

		String[] mp3Songs = getSongNames(songs, "mp3");
		System.out.println("mp3 songs: " + Arrays.toString(mp3Songs));

	}

	private static String[] getSongNames(String[] songs, String extension) {
		String[] result = new String[songs.length];
		int rid = 0;
		for (String song : songs) {
			if (new File(song).isFile() && song.endsWith(extension)) {
				int lastSlashIndexOf = song.lastIndexOf(File.separator);
				int lastDotIndexOf = song.lastIndexOf(".");
				String songName = song.substring(lastSlashIndexOf + 1, lastDotIndexOf);
				result[rid++] = songName;
			}
		}

		return Arrays.copyOfRange(result, 0, rid);

	}

	private static String[] mockFileList() {
		File dir = new File(MUSIC_PATH);
		File[] files = dir.listFiles();

		int running = 0;
		String[] absolutePaths = new String[files.length];
		for (File file : files) {
			absolutePaths[running++] = file.getAbsolutePath();
		}
		return absolutePaths;
	}

}
