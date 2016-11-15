package dblp;

public class Inproceedings extends DBLPObject
{
	private String pages;
	private String booktitle;
	private String crossref;
	
	}
	
	public void setPages(String page)
	{
		this.pages = page;
	}
	public void setBookTitle(String title)
	{
		this.booktitle = title;
	}
	public void setCrossRef(String crossref)
	{
		this.crossref = crossref;
	}
	
}