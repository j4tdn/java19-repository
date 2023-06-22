package string.immutable;

import java.io.File;
import java.util.Arrays;

/**
 * 
 * @author USER
 *
 */
public class Ex03StringDemoMusicApp {

	private static final String MUSIC_PATH = "D:\\Java19Course\\java19\\Music";
		
	public static void main(String[] args) {
		String[] songs = mockSongList();

		String[] mp3Songs = filterSongs(songs, "mp3");
		System.out.println("mp3 song --> " + Arrays.toString(mp3Songs));
	}

	private static String[] mockSongList() {
		return new String[] { "d:/music/somthingyoulike.mp3", "d:/music/foreoveralone.mp3",
				"d:/music/takemetoyourheart.mov" };
	}

	private static String[] filterSongs(String[] songs, String extension) {
		String[] extSongs = new String[songs.length];
		int running = 0;
		for (String song : songs) {
			if (new File(song).isFile() && song.endsWith(extension)) {
				int lastSlashIndexOf = song.lastIndexOf(File.separator);
				int lastDotIndexOf = song.lastIndexOf(".");
				String songName = song.substring(lastSlashIndexOf + 1, lastDotIndexOf);
				extSongs[running++] = songName;
			}
		}
		return Arrays.copyOfRange(extSongs, 0, running);
	}
	
	private static String[] mockFilePaths() {
		File dir = new File(MUSIC_PATH) ;
		File[] files = dir.listFiles();

		int running = 0;
		String[] absolutePaths = new String[files.length];
		for (File file: files) {

		absolutePaths[running++] = file.getAbsolutePath();
		}

		return absolutePaths;
	}
}
