//package string.immutable;
//
//import java.io.File;
//import java.util.Arrays;
//
//public class Ex03StringDemo03MusicApp {
//	public static void main(String[] args) {
//	String[] songs = mocSongList();
//	
//		
//	}
//	private static String filterSongs(String[] songs, String extension) {
//		String[] extSongs = new String[songs.length];
//		int running = 0;
//		for (String song: songs) {
//			if(song.endsWith(extension)) {
//				int lastSlashIndexOf = song.lastIndexOf("/");
//				int lastDotIndexOf = song.lastIndexOf(".");
//				String songname = song.substring(lastSlashIndexOf + 1, lastDotIndexOf);
//				extSongs[running++]= songname;
//			}
//		}
//		return Arrays.copyOfRange(extSongs, 0, running);
//	}
//	private static String[] mocSongList() {
//		File dir = new File(MUSIC_PATH);
//		File[] files = dir.listFiles();
//		int running = 0;
//		String[]
//		return new String[] {
//				"D:\\HHV\\chu ky",
//				"D:\\HHV\\DS đào tạo vận hành"
//		};
//	}
//
//}
