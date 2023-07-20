package string.immutable;

import java.io.File;
import java.util.Arrays;

public class Ex03StringDemo03MusicApp {
	
	private static final String MUSIC_PATH = "C:/Users/qphan/Desktop/bkit/course - plan and doc/Phần 2 - JAVA/LESSON 08 - String Mutable & Immutable/music";
	
	public static void main(String[] args) {
		String[] paths = mockFilePaths();
		System.out.println("paths --> " + Arrays.toString(paths));
		
		System.out.println("\n========================\n");
		
		// Viết hàm tìm danh sách tên các bài hát mp3 trong folder music
		String[] mp3Songs = filterSongs(paths, "mp3");
		System.out.println("mp3 songs: " + Arrays.toString(mp3Songs));
	}
	
	private static String[] filterSongs(String[] songs, String extension) {
		String[] extSongs = new String[songs.length];
		int running = 0;
		for (String song: songs) {
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
		File dir = new File(MUSIC_PATH);
		File[] files = dir.listFiles();
		
		int running = 0;
		String[] absolutePaths = new String[files.length];
		for (File file: files) {
			absolutePaths[running++] = file.getAbsolutePath(); 
		}
		return absolutePaths;
	}
}