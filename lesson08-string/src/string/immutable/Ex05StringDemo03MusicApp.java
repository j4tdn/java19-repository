package string.immutable;

import java.io.File;
import java.util.Arrays;

public class Ex05StringDemo03MusicApp {
	public static void main(String[] args) {
		String[] songs = mockSongList();
		String[] mp3Songs = filterSong(songs, "mp3");
		System.out.println("mp3 Song " + Arrays.toString(mp3Songs));
	}
	
	private static String[] filterSong(String[] songs, String extension) {
		String[] extSongs = new String[songs.length];
		int running = 0;
		for (String song : songs) {
			if(song.endsWith(extension)) {
				int lastSlashIndexOf = song.lastIndexOf("/");
				int lastDotIndexOf = song.lastIndexOf(".");
				String songName = song.substring(lastSlashIndexOf + 1, lastDotIndexOf);
				extSongs[running++] = songName;
			}
		}
		return Arrays.copyOfRange(extSongs, 0, running);
	}
	
	private static String[] mockSongList() {
		return new String[] {
				"d:/music/somethingyoulike.mp3",
				"d:/music/foreverandone.mp3",
				"d:/music/takemetoyourheart.mov"
		};
	}
}
