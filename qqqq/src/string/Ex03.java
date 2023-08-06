package string;

import java.io.File;
import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		String[] songs = mockSongList();
		String mp3Songs[] = filterSongs(songs, "mov");
		System.out.println("mp3Song: " + Arrays.toString(mp3Songs));
		File file = new File(songs[0]);
	}
	private static String[] filterSongs(String[] songs, String ext) {
		String result[] = new String[songs.length];
		int running = 0;
		for(String song: songs) {
			if(song.endsWith(ext)) {
				int lastSlashIndexOf = song.lastIndexOf("/");
				int lastDotIndexOf = song.lastIndexOf(".");
				result[running++]= song.substring(lastSlashIndexOf + 1, lastDotIndexOf);
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
	private static String[] mockSongList() {
		return new String[] {
				"d:/music/somthingyoulike.mp3",
				"d:/music/foreoverandone.mp3",
				"d:/music/takemetoyourheart.mov"
		};
	}
}
