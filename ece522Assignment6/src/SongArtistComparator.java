import java.util.*;
public class SongArtistComparator implements Comparator<Song>{



	@Override
	public int compare(Song p1, Song p2) {
		// TODO Auto-generated method stub
		int i = p1.getArtist().compareTo(p2.getArtist());
		//System.out.println(i);
		
		return  i;
	}
	

}
