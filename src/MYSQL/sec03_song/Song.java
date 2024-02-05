package MYSQL.sec03_song;

public class Song {
	
	private int hit_song_id;
	private String name;
	private String title;
	private String lyrics;
	private int debut;
	
	
	public Song() {}
	public Song(int hit_song_id, String name, String title, String lyrics, int debut) {
		super();
		this.hit_song_id = hit_song_id;
		this.name = name;
		this.title = title;
		this.lyrics = lyrics;
		this.debut = debut;
	}
	@Override
	public String toString() {
		return "Song [hit_song_id=" + hit_song_id + ", name=" + name + ", title=" + title + ", lyrics=" + lyrics
				+ ", debut=" + debut + "]";
	}
	public int getHit_song_id() {
		return hit_song_id;
	}
	public void setHit_song_id(int hit_song_id) {
		this.hit_song_id = hit_song_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	public int getDebut() {
		return debut;
	}
	public void setDebut(int debut) {
		this.debut = debut;
	}
		
	
	
	}

