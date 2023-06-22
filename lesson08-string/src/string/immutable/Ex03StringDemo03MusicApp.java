package string.immutable;

import java.io.File;
import java.util.Arrays;

public class Ex03StringDemo03MusicApp {
	public static void main(String[] args) {
		String extension = "mp3";
		String[] mp3Songs = filterSongs(mockSongList(), extension);
		System.out.println(Arrays.toString(mp3Songs));
	}

	private static String[] mockSongList() {
		return new String[] { "d:/music/somthingyoulike.mp3",
							  "d:/music/foreoverandone.mp3",
							  "d:/music/takemetoyourheart.mov" };
	}

	private static String[] filterSongs(String[] songs, String extension) {

		String[] extSongs = new String[songs.length];
		int running = 0;
		for (String song : songs) {
			if (song.endsWith(extension)) {
				int lastSlashIndexOf = song.lastIndexOf("/");
				int lastDotIndexOf = song.lastIndexOf(".");
				String songName = song.substring(lastSlashIndexOf + 1, lastDotIndexOf);
				extSongs[running++] = songName;
			}
		}

		return Arrays.copyOfRange(extSongs, 0, running);

//		
//		for(String i : songList) {
//			if( i.endsWith(extension)) {
//				System.out.println((i.split("/"))[2]);
//			}
//		}
	}

}
