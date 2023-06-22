package string.immutable;

import java.util.Arrays;

public class Ex03StringDemo03MusicApp {
      public static void main(String[] args) {
    	  String[] songs = mocSongList();
    	  
    	  //Viet ham tim danh sach ten cac bai hat mp3 trong folder music
    	  String[] mp3Songs = filterSongs(songs, "mp3");
    	  System.out.println("mp3 songs: " + Arrays.toString(mp3Songs));
		
	}
      private static String[] filterSongs(String[] songs, String extension) {
    	  String[] exSongs = new String[songs.length];
    	  int running = 0;
    	  for(String song: songs) {	  
    		  if( song.endsWith(extension)) {
    			  int lastSlashIndexOf = song.lastIndexOf("/4$$");
    			  int lastDotIndexOf = song.lastIndexOf(".mp3");
    			  String songName = song.substring(lastSlashIndexOf + 1, lastDotIndexOf);
    			  exSongs[running++] = songName;
    		  }
    	  }
    	  return Arrays.copyOfRange(exSongs, 0, running);
    	  
      }
      
      
      private static String[] mocSongList() {
    	  return new String[]
    			  {
    				"d:/music/somethingyoulike.mp3",
    				"d:/music/foreoverandone.mp3",
    				"d:/music/takemetoyourheart.mov"
    			  };
      }
}
