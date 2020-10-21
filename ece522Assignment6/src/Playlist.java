/**
 * Assignment 6: Test Driven Development <br />
 * The {@code Playlist} class
 */

import java.util.*;
@SuppressWarnings("serial")
public class Playlist<E extends Song> extends java.util.Vector<E> {
    java.util.Iterator<E> itr = this.iterator();       // Generic Iterator; Use it whenever you need it!

    // TODO: Assignment 6 -- complete this Playlist class to pass the tests
    
    private String listTitle = null;
    
    private List<E> songList = new Vector<E>(); 
    
    public Playlist(String listTitle)
    {
    	this.listTitle = listTitle;
    }
    
    public List<E> getList()
    {
    	
    	return this.songList;
    }
    
    public boolean addtoPlist(E newSong)
    {
    	//check for null entry
    	if(newSong == null)
    	{
    		return false;
    	}
    	
    	//check for duplicate
    	/*for(int i = 0; i < songList.size(); i++)
    	{
    		if(songList.get(i).equals(newSong))
    		{
    			return false;
    		}
    	}
    	*/
    	
    	
    	Iterator<E> itr = this.songList.iterator();
    	while(itr.hasNext())
    	{
    		if(itr.next().equals(newSong))
    		{
    			return false;
    		}
    	}
    	if(songList.add(newSong))
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    
    public String getTitle()
    {
    	return this.listTitle;
    }
    
    public int size()
    {
    	return this.songList.size();			
    }
    
    public int numberOfSongs()
    {
    	return this.songList.size();
    }
    
    public double playTime()
    {
    	double time = 0;
    	Iterator<E> itr = this.songList.iterator();
    	
    	while(itr.hasNext())
    	{
    		time = time + itr.next().getLength();
    	}
    	return time;
    }
    
    public int numberOfTitles()
    {

    	
    	for(int i = 0; i < this.songList.size(); i++)
    	{
    		for(int j = 0; j < this.songList.size(); j++)
    		{
    			if(j == i)
    			{
    				continue;
    			}
    			else
    			{
    				if(this.songList.get(i).getTitle().equals(this.songList.get(j).getTitle()))
    				{
    					this.songList.remove(j);
    					i = 0;
    					j = 0;
    				}
    			}
    		}
    	}
    	
    	return this.songList.size();

    }
    
    public boolean removeFromPlist(E newSong)
    {
    	if(newSong == null)
    	{
    		return false;
    	}

    	for(int i = 0; i < this.songList.size(); i++)
    	{
    		if(this.songList.get(i).equals(newSong))
    		{
    			this.songList.remove(i);
    			return true;
    		}
    	}
    	
    	return false;
    	
    }
    
    public boolean contains(E newSong)
    {
    	Iterator<E> itr = this.songList.iterator();
    	while(itr.hasNext())
    	{
    		if(itr.next().equals(newSong))
    		{
    			return true;
    		}
    	}
    	return true;
    }
    
    public int numberOfArtists()
    {
    	
    	for(int i = 0; i < this.songList.size(); i++)
    	{
    		for(int j = 0; j < this.songList.size(); j++)
    		{
    			if(j == i)
    			{
    				continue;
    			}
    			else
    			{
    				if(this.songList.get(i).getArtist().equals(this.songList.get(j).getArtist()))
    				{
    					this.songList.remove(j);
    					i = 0;
    					j = 0;
    				}
    			}
    		}
    	}
    	
    	return this.songList.size();

    }
    
    public int findSong(E newSong)
    {
    	
    	for(int i = 0; i < this.songList.size(); i++)
    	{
    		if(this.songList.get(i).equals(newSong))
    		{
    			return i;
    		}
    	}
    	
    	return -1;
    }
    
    public boolean hasArtist(String artistName)
    {
    	Iterator<E> itr = this.songList.iterator();
    	
    	while(itr.hasNext())
    	{
    		if(itr.next().getArtist().toLowerCase().equals(artistName.toLowerCase()))
    		{
    			return true;
    		}
    	}
    	return false;
    }
    
    public boolean hasTitle(String title)
    {
    	if(this.listTitle.equals(title))
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}

    }
    
    public E getSong(int index)
    {
    	return this.songList.get(index);
    }
    

}
