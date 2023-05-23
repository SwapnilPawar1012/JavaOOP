package OOPs;
// 20. "Write a program, to implement the following hierarchy. Displays information about each class the rectangle represents the classes. The class Movie and MusicVideo inherits all the members of the class VideoTape.

class VideoTape {
    String title;
    double length;
    String available;

    public VideoTape(String title, Double length, String available) {
        this.title = title;
        this.length = length;
        this.available = available;
    }

    void show() {
        System.out.println("Title: " + title);
        System.out.println("Length: " + length);
        System.out.println("Available: " + available);
    }
}

class Movie extends VideoTape {
    String directorRating;

    public Movie(String title, Double length, String available, String directorRating) {
        super(title, length, available);
        this.directorRating = directorRating;
    }

    void show() {
        System.out.println("Movie Information: ");
        super.show();
        System.out.println("Director Rating: " + directorRating);
        System.out.println();
    }
}

class MusicVideo extends VideoTape {
    String artistCategory;

    public MusicVideo(String title, Double length, String available, String artistCategory) {
        super(title, length, available);
        this.artistCategory = artistCategory;
    }

    void show() {
        System.out.println("Music Video Information: ");
        super.show();
        System.out.println("Artist Category: " + artistCategory);
    }
}

public class Lab_22 {
    public static void main(String[] arg) {
        Movie movie = new Movie("KGF", 2.0, "available", "Good");
        movie.show();

        MusicVideo musicVideo = new MusicVideo("Track-1", 5.5, "Not available", "classical");
        musicVideo.show();
    }
}
