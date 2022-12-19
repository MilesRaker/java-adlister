import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {
        // instantiate some beans!
        Album sonicBloom = new Album();
            sonicBloom.setArtist("Hiromi");
            sonicBloom.setId(0);
            sonicBloom.setGenre("jazz");
            sonicBloom.setSales(new BigDecimal("125000.00"));
            sonicBloom.setReleaseDate(new Date(2008));
        Album cerulianSkies = new Album();
            cerulianSkies.setId(1);
            cerulianSkies.setArtist("Maria Schneider");
            cerulianSkies.setGenre("jazz");
            cerulianSkies.setSales(new BigDecimal("95000.00"));
            cerulianSkies.setReleaseDate(new Date(2007));
        Album milesAhead = new Album();
            milesAhead.setId(2);
            milesAhead.setArtist("Miles Davis");
            milesAhead.setGenre("jazz");
            milesAhead.setSales(new BigDecimal("250000.00"));
            milesAhead.setReleaseDate(new Date(1957));

        Author stevenNovella = new Author();
            stevenNovella.setLastName("Steven");
            stevenNovella.setFirstName("Novella");
        Author douglasAdams = new Author();
            douglasAdams.setLastName("Adams");
            douglasAdams.setFirstName("Douglas");
        Author isaacAsimov = new Author();
            isaacAsimov.setLastName("Asimov");
            isaacAsimov.setFirstName("Isaac");

        Quote towel = new Quote();
            towel.setId(0);
            towel.setAuthor(douglasAdams);
            towel.setContent("I may not have gone where I intended to go, but I think I have ended up where I needed to be.");
        Quote skeptic = new Quote();
            skeptic.setId(1);
            skeptic.setAuthor(stevenNovella);
            skeptic.setContent("What do you think science is? There's nothing magical about science. It is simply a systematic way for carefully and thoroughly observing nature and using consistent logic to evaluate results. Which part of that exactly do you disagree with? Do you disagree with being thorough? Using careful observation? Being systematic? Or using consistent logic?");
        Quote lawsOfRobotics = new Quote();
            lawsOfRobotics.setId(2);
            lawsOfRobotics.setAuthor(isaacAsimov);
            lawsOfRobotics.setContent("A robot may not injure a human being or, through inaction, allow a human being to come to harm.\n" +
                    "A robot must obey orders given it by human beings except where such orders would conflict with the First Law.\n" +
                    "A robot must protect its own existence as long as such protection does not conflict with the First or Second Law.");

            // Sticking the beans in lists...
        List<Album> albums = new ArrayList<Album>();
            albums.add(sonicBloom);
            albums.add(cerulianSkies);
            albums.add(milesAhead);
        List<Author> authors = new ArrayList<Author>();
            authors.add(stevenNovella);
            authors.add(douglasAdams);
            authors.add(isaacAsimov);
        List<Quote> quotes = new ArrayList<Quote>();
            quotes.add(towel);
            quotes.add(skeptic);
            quotes.add(lawsOfRobotics);

            // iterating the lists...
        for(Album a : albums){
            System.out.println("Name: " + a.getName());
            System.out.println("Artist: " + a.getArtist());
            System.out.println("Genre: " + a.getGenre());
            System.out.println("Release Date: " + a.getReleaseDate());
            System.out.println("--------------------");
        }

        for(Quote q : quotes){
            System.out.println("Author: " + q.getAuthor().getFirstName() + " " + q.getAuthor().getLastName());
            System.out.println("Quote: " + q.getContent());
            System.out.println("--------------------");
        }

    }
}
