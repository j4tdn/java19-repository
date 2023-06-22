package string.immutable;

import java.io.File;
import java.util.Arrays;

public class Ex03StringDemoMusicApp {
	private static final String Music_Path = "D:\\test\\music";
public static void main(String[] args) {
	String[] songs = mockSongList();
	
	String[] mp3Songs = filterSongs(songs, "mp3");
	// Viết hàm tìm danh sách tên các bài hát mp3 trong folder music 
	System.out.println("mp3 songs: " + Arrays.toString(mp3Songs));
	
}
private static String[] filterSongs(String[] Songs, String extension) {
	String[] extSongs = new String[Songs.length];
	int running = 0;
	for(String song : Songs) {
		if(song.endsWith(extension)) {
			int SlashIndexOf = song.lastIndexOf("/");
			int DotIndexOf = song.lastIndexOf(".");
			String songName = song.substring(SlashIndexOf + 1, DotIndexOf);
			extSongs[running++] = songName;
		}
	}
	return Arrays.copyOfRange(extSongs, 0, running);
}
private static String[] mockSongList() {
	return new String[] {
			"d:/test/music/somethingyoulike.mp3",
			"d:/test/music/foreoveradone.mp3",
			"d:/test/music/somethingyoulike.mov"
	};

}
private static String[] mockFilePaths() {
	File dir = new File(Music_Path);
	File[] files = dir.listFiles();
	int running = 0;
	String[] absolutePaths = new String[files.length];
	for (File file : files ) {
		absolutePaths[running++] = file.getAbsolutePath();
		
	}
	return absolutePaths;
}
}
