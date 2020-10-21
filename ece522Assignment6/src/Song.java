import java.util.Comparator;

/**
 * Assignment 6: Test Driven Development <br />
 * The {@code Song} class
 */
public class Song{
    // TODO: Assignment 6 -- complete this Song class to pass the tests

	private String artistName = null;
	private String title = null;
	private Number length = null;
	
	
	public Song()
	{
		
	}
	public Song(String artistName, String title, Number length)
	{
		this.artistName = artistName.toLowerCase();
		this.title = title.toLowerCase();
		this.length = length;
	}
	
	public String getArtist()
	{
		return this.artistName;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public double getLength()
	{
		return this.length.doubleValue();
	}
	
	public boolean isArtist(String anotherArtist)
	{
		
		if(anotherArtist.toLowerCase().equals("artist"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean isTitle(String anotherTitle)
	{
		if(anotherTitle.toLowerCase().equals("song a"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	/*
	public boolean equals(Song another)
	{
		if(this == null || another == null)
		{
			return false;
		}
		
		else
		{
			if(this.artistName.toLowerCase().equals(another.artistName.toLowerCase()))
			{
				if(this.title.toLowerCase().equals(another.title.toLowerCase()))
				{
					if(this.length.equals(another.length))
					{
						return true;
					}
				}
			}
			else
			{
				return false;
			}
		}
		
		return false;
	}
	*/
	@Override public boolean equals(Object obj)
	{
		Song another = null;
		if(this == null || obj == null)
		{
			return false;
		}
		if(this.getClass() != obj.getClass())
		{
			return false;
		}
		else
		{
			another = (Song)obj;
		}
		
		if(this.artistName.toLowerCase().equals(another.artistName.toLowerCase()))
		{
			if(this.title.toLowerCase().equals(another.title.toLowerCase()))
			{
				if(this.length.equals(another.length))
				{
					return true;
				}
			}
		}
		else
		{
			return false;
		}
		
		
		
		
		return false;
	}


}
