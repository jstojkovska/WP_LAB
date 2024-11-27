package mk.ukim.finki.wp.lab.repository;
import mk.ukim.finki.wp.lab.model.Artist;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ArtistRepository {
    List<Artist> artistList = new ArrayList<>();

    public ArtistRepository() {
        artistList.add(new Artist(1L, "Name1", "Surname1", "singer"));
        artistList.add(new Artist(2L, "Name2", "Surname2", "singer"));
        artistList.add(new Artist(3L, "Name3", "Surname3", "singer"));
        artistList.add(new Artist(4L, "Name4", "Surname4", "singer"));
        artistList.add(new Artist(5L, "Name5", "Surname5", "singer"));
    }

    public List<Artist> findAll() {
        return artistList;
    }

    public Optional<Artist> findById(Long id) {
        return artistList.stream().filter(x -> x.getId().equals(id)).findFirst();
    }
}
