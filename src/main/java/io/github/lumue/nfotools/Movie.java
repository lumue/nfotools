package io.github.lumue.nfotools;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by lm on 06.12.15.
 */
@XmlRootElement(name = "movie")
@XmlAccessorType(XmlAccessType.FIELD)
public class Movie implements Serializable{

    @XmlElement
    private String title;
    @XmlElement
    private String originaltitle;
    @XmlElement
    private String sorttitle;
    @XmlElement
    private String set;
    @XmlElement
    private String rating;
    @XmlElement
    private String year;
    @XmlElement
    private String top250;
    @XmlElement
    private String votes;
    @XmlElement
    private String outline;
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
    private Fileinfo fileinfo=new Fileinfo();
    @XmlElement
    private String director;
    @XmlElement(name="actor")
    private List<Actor> actorList=new ArrayList<>();

    Movie() {
    }

    public Movie(String title, String originaltitle, String sorttitle, String set, String rating, String year, String top250, String votes, String outline, String plot, String tagline, String runtime, String thumb, String mpaa, String playcount, String id, String filenameandpath, String trailer, String genre, String credits, Fileinfo fileinfo, String director, List<Actor> actorList) {
        this.title = title;
        this.originaltitle = originaltitle;
        this.sorttitle = sorttitle;
        this.set = set;
        this.rating = rating;
        this.year = year;
        this.top250 = top250;
        this.votes = votes;
        this.outline = outline;
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
        this.fileinfo = fileinfo;
        this.director = director;
        this.actorList = actorList;
    }

    public static MovieBuilder builder(){
        return new MovieBuilder();
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie that = (Movie) o;

        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (originaltitle != null ? !originaltitle.equals(that.originaltitle) : that.originaltitle != null)
            return false;
        if (sorttitle != null ? !sorttitle.equals(that.sorttitle) : that.sorttitle != null) return false;
        if (set != null ? !set.equals(that.set) : that.set != null) return false;
        if (rating != null ? !rating.equals(that.rating) : that.rating != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (top250 != null ? !top250.equals(that.top250) : that.top250 != null) return false;
        if (votes != null ? !votes.equals(that.votes) : that.votes != null) return false;
        if (outline != null ? !outline.equals(that.outline) : that.outline != null) return false;
        if (plot != null ? !plot.equals(that.plot) : that.plot != null) return false;
        if (tagline != null ? !tagline.equals(that.tagline) : that.tagline != null) return false;
        if (runtime != null ? !runtime.equals(that.runtime) : that.runtime != null) return false;
        if (thumb != null ? !thumb.equals(that.thumb) : that.thumb != null) return false;
        if (mpaa != null ? !mpaa.equals(that.mpaa) : that.mpaa != null) return false;
        if (playcount != null ? !playcount.equals(that.playcount) : that.playcount != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (filenameandpath != null ? !filenameandpath.equals(that.filenameandpath) : that.filenameandpath != null)
            return false;
        if (trailer != null ? !trailer.equals(that.trailer) : that.trailer != null) return false;
        if (genre != null ? !genre.equals(that.genre) : that.genre != null) return false;
        if (credits != null ? !credits.equals(that.credits) : that.credits != null) return false;
        if (fileinfo != null ? !fileinfo.equals(that.fileinfo) : that.fileinfo != null) return false;
        if (director != null ? !director.equals(that.director) : that.director != null) return false;
        return actorList != null ? actorList.equals(that.actorList) : that.actorList == null;

    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (originaltitle != null ? originaltitle.hashCode() : 0);
        result = 31 * result + (sorttitle != null ? sorttitle.hashCode() : 0);
        result = 31 * result + (set != null ? set.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (top250 != null ? top250.hashCode() : 0);
        result = 31 * result + (votes != null ? votes.hashCode() : 0);
        result = 31 * result + (outline != null ? outline.hashCode() : 0);
        result = 31 * result + (plot != null ? plot.hashCode() : 0);
        result = 31 * result + (tagline != null ? tagline.hashCode() : 0);
        result = 31 * result + (runtime != null ? runtime.hashCode() : 0);
        result = 31 * result + (thumb != null ? thumb.hashCode() : 0);
        result = 31 * result + (mpaa != null ? mpaa.hashCode() : 0);
        result = 31 * result + (playcount != null ? playcount.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (filenameandpath != null ? filenameandpath.hashCode() : 0);
        result = 31 * result + (trailer != null ? trailer.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (credits != null ? credits.hashCode() : 0);
        result = 31 * result + (fileinfo != null ? fileinfo.hashCode() : 0);
        result = 31 * result + (director != null ? director.hashCode() : 0);
        result = 31 * result + (actorList != null ? actorList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", originaltitle='" + originaltitle + '\'' +
                ", sorttitle='" + sorttitle + '\'' +
                ", set='" + set + '\'' +
                ", rating='" + rating + '\'' +
                ", year='" + year + '\'' +
                ", top250='" + top250 + '\'' +
                ", votes='" + votes + '\'' +
                ", outline='" + outline + '\'' +
                ", plot='" + plot + '\'' +
                ", tagline='" + tagline + '\'' +
                ", runtime='" + runtime + '\'' +
                ", thumb='" + thumb + '\'' +
                ", mpaa='" + mpaa + '\'' +
                ", playcount='" + playcount + '\'' +
                ", id='" + id + '\'' +
                ", filenameandpath='" + filenameandpath + '\'' +
                ", trailer='" + trailer + '\'' +
                ", genre='" + genre + '\'' +
                ", credits='" + credits + '\'' +
                ", fileinfo=" + fileinfo +
                ", director='" + director + '\'' +
                ", actorList=" + actorList +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getOriginaltitle() {
        return originaltitle;
    }

    public String getSorttitle() {
        return sorttitle;
    }

    public String getSet() {
        return set;
    }

    public String getRating() {
        return rating;
    }

    public String getYear() {
        return year;
    }

    public String getTop250() {
        return top250;
    }

    public String getVotes() {
        return votes;
    }

    public String getOutline() {
        return outline;
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

    public String getDirector() {
        return director;
    }

    public List<Actor> actors() {
        return Collections.unmodifiableList(actorList);
    }

    public void addActor(Actor actor){
        actorList.add(actor);
    }

    public void removeActors(){
        actorList.clear();
    }

    public static class MovieBuilder {
        private String title;
        private String originaltitle;
        private String sorttitle;
        private String set;
        private String rating;
        private String year;
        private String top250;
        private String votes;
        private String outline;
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
        private Fileinfo fileinfo=new Fileinfo();
        private String director;
        private final List<Actor> actorList=new ArrayList<>();

        public MovieBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public MovieBuilder withOriginaltitle(String originaltitle) {
            this.originaltitle = originaltitle;
            return this;
        }

        public MovieBuilder withSorttitle(String sorttitle) {
            this.sorttitle = sorttitle;
            return this;
        }

        public MovieBuilder withSet(String set) {
            this.set = set;
            return this;
        }

        public MovieBuilder withRating(String rating) {
            this.rating = rating;
            return this;
        }

        public MovieBuilder withYear(String year) {
            this.year = year;
            return this;
        }

        public MovieBuilder withTop250(String top250) {
            this.top250 = top250;
            return this;
        }

        public MovieBuilder withVotes(String votes) {
            this.votes = votes;
            return this;
        }

        public MovieBuilder withOutline(String outline) {
            this.outline = outline;
            return this;
        }

        public MovieBuilder withPlot(String plot) {
            this.plot = plot;
            return this;
        }

        public MovieBuilder withTagline(String tagline) {
            this.tagline = tagline;
            return this;
        }

        public MovieBuilder withRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }

        public MovieBuilder withThumb(String thumb) {
            this.thumb = thumb;
            return this;
        }

        public MovieBuilder withMpaa(String mpaa) {
            this.mpaa = mpaa;
            return this;
        }

        public MovieBuilder withPlaycount(String playcount) {
            this.playcount = playcount;
            return this;
        }

        public MovieBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public MovieBuilder withFilenameandpath(String filenameandpath) {
            this.filenameandpath = filenameandpath;
            return this;
        }

        public MovieBuilder withTrailer(String trailer) {
            this.trailer = trailer;
            return this;
        }

        public MovieBuilder withGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public MovieBuilder withCredits(String credits) {
            this.credits = credits;
            return this;
        }



        public MovieBuilder withDirector(String director) {
            this.director = director;
            return this;
        }

        public MovieBuilder addActor(Actor actor) {
            this.actorList.add(actor);
            return this;
        }

        public Movie build() {
            return new Movie(title, originaltitle, sorttitle, set, rating, year, top250, votes, outline, plot, tagline, runtime, thumb, mpaa, playcount, id, filenameandpath, trailer, genre, credits,  fileinfo, director, actorList);
        }
    }

    /**
     * Created by lm on 06.12.15.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    static class Fileinfo implements Serializable{

        @XmlElement
        private String streamdetails="";

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Fileinfo that = (Fileinfo) o;

            return streamdetails != null ? streamdetails.equals(that.streamdetails) : that.streamdetails == null;

        }

        @Override
        public int hashCode() {
            return streamdetails != null ? streamdetails.hashCode() : 0;
        }

        @Override
        public String toString() {
            return "Fileinfo{" +
                    "streamdetails='" + streamdetails + '\'' +
                    '}';
        }
    }

    /**
     * Created by lm on 06.12.15.
     */

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Actor implements Serializable{
        @XmlElement
        private String name;
        @XmlElement
        private String role;

        public Actor(String name, String role) {
            this.name = name;
            this.role = role;
        }

        Actor() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Actor that = (Actor) o;

            if (name != null ? !name.equals(that.name) : that.name != null) return false;
            return role != null ? role.equals(that.role) : that.role == null;

        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (role != null ? role.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "Actor{" +
                    "name='" + name + '\'' +
                    ", role='" + role + '\'' +
                    '}';
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getName() {
            return name;
        }
    }
}
