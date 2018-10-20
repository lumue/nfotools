package io.github.lumue.nfotools;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Created by lm on 06.12.15.
 */
@SuppressWarnings("unused")
@XmlRootElement(name = "musicvideo")
@XmlAccessorType(XmlAccessType.FIELD)
public class Musicvideo implements Serializable {
	
	private final static DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
	
	
	@XmlElement
	private String title;
	@XmlElement
	private String userrating;
	@XmlElement
	private String top250;
	@XmlElement
	private String track;
	@XmlElement
	private String album;
	@XmlElement
	private String plot;
	@XmlElement
	private String tagline;
	@XmlElement
	private String runtime;
	@XmlElement
	private String thumb;
	@XmlElement
	private String mpaa;
	@XmlElement
	private String playcount;
	@XmlElement
	private String id;
	@XmlElement
	private String filenameandpath;
	@XmlElement
	private String trailer;
	@XmlElement
	private String genre;
	@XmlElement
	private String credits;
	@XmlElement
	private String year;
	@XmlElement
	private Fileinfo fileinfo = new Fileinfo();
	@XmlElement
	private String director;
	@XmlElement
	private String artist;
	@XmlElement(name = "tag")
	private List<String> tagList = new ArrayList<>();
	@XmlElement
	String dateadded;
	@XmlElement
	String aired;
	
	Musicvideo() {
	}
	
	public Musicvideo(String title, String userrating, String top250, String track, String album, String plot, String tagline, String runtime, String thumb, String mpaa, String playcount, String id, String filenameandpath, String trailer, String genre, String credits, String year, Fileinfo fileinfo, String director, String artist, List<String> tagList, String dateadded, String aired) {
		this.title = title;
		this.userrating = userrating;
		this.top250 = top250;
		this.track = track;
		this.album = album;
		this.plot = plot;
		this.tagline = tagline;
		this.runtime = runtime;
		this.thumb = thumb;
		this.mpaa = mpaa;
		this.playcount = playcount;
		this.id = id;
		this.filenameandpath = filenameandpath;
		this.trailer = trailer;
		this.genre = genre;
		this.credits = credits;
		this.year = year;
		this.fileinfo = fileinfo;
		this.director = director;
		this.artist = artist;
		this.tagList = tagList;
		this.dateadded = dateadded;
		this.aired = aired;
	}
	
	private Musicvideo(Builder builder) {
		title = builder.title;
		userrating = builder.userrating;
		top250 = builder.top250;
		track = builder.track;
		album = builder.album;
		plot = builder.plot;
		tagline = builder.tagline;
		runtime = builder.runtime;
		thumb = builder.thumb;
		mpaa = builder.mpaa;
		playcount = builder.playcount;
		id = builder.id;
		filenameandpath = builder.filenameandpath;
		trailer = builder.trailer;
		genre = builder.genre;
		credits = builder.credits;
		year = builder.year;
		fileinfo = builder.fileinfo;
		director = builder.director;
		artist = builder.artist;
		tagList = new ArrayList<>(builder.tagList);
		dateadded = builder.dateadded;
		aired = builder.aired;
	}
	
	public static Builder newBuilder() {
		return new Builder();
	}
	
	public static Builder newBuilder(Musicvideo copy) {
		Builder builder = new Builder();
		builder.title = copy.getTitle();
		builder.userrating = copy.getUserrating();
		builder.top250 = copy.getTop250();
		builder.track = copy.getTrack();
		builder.album = copy.getAlbum();
		builder.plot = copy.getPlot();
		builder.tagline = copy.getTagline();
		builder.runtime = copy.getRuntime();
		builder.thumb = copy.getThumb();
		builder.mpaa = copy.getMpaa();
		builder.playcount = copy.getPlaycount();
		builder.id = copy.getId();
		builder.filenameandpath = copy.getFilenameandpath();
		builder.trailer = copy.getTrailer();
		builder.genre = copy.getGenre();
		builder.credits = copy.getCredits();
		builder.year = copy.getYear();
		builder.fileinfo = copy.getFileinfo();
		builder.director = copy.getDirector();
		builder.artist = copy.getArtist();
		copy.getTagList().forEach(builder::addTag);
		builder.dateadded = copy.getDateadded();
		builder.aired = copy.getAired();
		return builder;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getUserrating() {
		return userrating;
	}
	
	public String getTop250() {
		return top250;
	}
	
	public String getTrack() {
		return track;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public String getPlot() {
		return plot;
	}
	
	public String getTagline() {
		return tagline;
	}
	
	public String getRuntime() {
		return runtime;
	}
	
	public String getThumb() {
		return thumb;
	}
	
	public String getMpaa() {
		return mpaa;
	}
	
	public String getPlaycount() {
		return playcount;
	}
	
	public String getId() {
		return id;
	}
	
	public String getFilenameandpath() {
		return filenameandpath;
	}
	
	public String getTrailer() {
		return trailer;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public String getCredits() {
		return credits;
	}
	
	public String getYear() {
		return year;
	}
	
	public Fileinfo getFileinfo() {
		return fileinfo;
	}
	
	public String getDirector() {
		return director;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public List<String> getTagList() {
		return tagList;
	}
	
	public String getDateadded() {
		return dateadded;
	}
	
	public String getAired() {
		return aired;
	}
	
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Musicvideo)) return false;
		Musicvideo that = (Musicvideo) o;
		return title.equals(that.title) &&
				Objects.equals(track, that.track) &&
				Objects.equals(album, that.album) &&
				Objects.equals(artist, that.artist);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(title, track, album, artist);
	}
	
	
	public static final class Builder {
		private String title;
		private String userrating;
		private String top250;
		private String track;
		private String album;
		private String plot;
		private String tagline;
		private String runtime;
		private String thumb;
		private String mpaa;
		private String playcount;
		private String id;
		private String filenameandpath;
		private String trailer;
		private String genre;
		private String credits;
		private String year;
		private Fileinfo fileinfo;
		private String director;
		private String artist;
		private final Set<String> tagList=new HashSet<>();
		private String dateadded;
		private String aired;
		
		private Builder() {
		}
		
		public Builder withTitle(String val) {
			title = val;
			return this;
		}
		
		public Builder withUserrating(String val) {
			userrating = val;
			return this;
		}
		
		public Builder withTop250(String val) {
			top250 = val;
			return this;
		}
		
		public Builder withTrack(String val) {
			track = val;
			return this;
		}
		
		public Builder withAlbum(String val) {
			album = val;
			return this;
		}
		
		public Builder withPlot(String val) {
			plot = val;
			return this;
		}
		
		public Builder withTagline(String val) {
			tagline = val;
			return this;
		}
		
		public Builder withRuntime(String val) {
			runtime = val;
			return this;
		}
		
		public Builder withThumb(String val) {
			thumb = val;
			return this;
		}
		
		public Builder withMpaa(String val) {
			mpaa = val;
			return this;
		}
		
		public Builder withPlaycount(String val) {
			playcount = val;
			return this;
		}
		
		public Builder withId(String val) {
			id = val;
			return this;
		}
		
		public Builder withFilenameandpath(String val) {
			filenameandpath = val;
			return this;
		}
		
		public Builder withTrailer(String val) {
			trailer = val;
			return this;
		}
		
		public Builder withGenre(String val) {
			genre = val;
			return this;
		}
		
		public Builder withCredits(String val) {
			credits = val;
			return this;
		}
		
		public Builder withYear(String val) {
			year = val;
			return this;
		}
		
		public Builder withFileinfo(Fileinfo val) {
			fileinfo = val;
			return this;
		}
		
		public Builder withDirector(String val) {
			director = val;
			return this;
		}
		
		public Builder withArtist(String val) {
			artist = val;
			return this;
		}
		
		public Builder addTag(String val) {
			tagList.add(val);
			return this;
		}
		
		public Builder withDateadded(String val) {
			dateadded = val;
			return this;
		}
		
		public Builder withAired(String val) {
			aired = val;
			return this;
		}
		
		public Musicvideo build() {
			return new Musicvideo(this);
		}
	}
}

   
