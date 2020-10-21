import java.util.*;

public class SongTitleComparator implements Comparator<Song>{
	
	@Override public int compare(Song s1, Song s2)
	{
		int i = s1.getTitle().compareTo(s2.getTitle());
		return i;
	}

}
