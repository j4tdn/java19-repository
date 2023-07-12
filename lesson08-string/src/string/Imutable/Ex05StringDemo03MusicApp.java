package string.Imutable;

import java.io.File;
import java.util.Arrays;

public class Ex05StringDemo03MusicApp {
	public static void main(String[] args) {
		String[] songs = mockSongList();
		String[] mp3Songs = filterSongs(songs, "mp3");
		System.out.println("mp3 songs: " + Arrays.toString(mp3Songs));
	}
	
	private static String[] mockSongList() {
		return new String[] {
				"d:/music/somethingyoulike.mp3",
				"d:/music/foreverandone.mp3",
				"d:/music/takemetoyourheart.mov"
		};
	}
	
	
	 private static String[] filterSongs(String[] songs, String extension) {
		 String[] result = new String[songs.length];
		 int running = 0;
		 for(String song : songs) {
			 if(song.endsWith(extension) /*&& new File(song).isFile()*/) {
				 int lastSlashIndexOf = song.lastIndexOf("/");
				 int lastDotIndexOf = song.lastIndexOf(".");
				 String songName = song.substring(lastSlashIndexOf + 1, lastDotIndexOf);
				 result[running++] = songName;
			 }
		 }
		 
		 return Arrays.copyOfRange(result, 0, running);
	 }
}
