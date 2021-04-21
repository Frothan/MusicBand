public class Track {
	private String artist;
	private String title;
	private String filename;
	
	public Track (String a, String t, String f) {
		
		title = t;
		artist = a;
		filename = f;
			
	}
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
}
