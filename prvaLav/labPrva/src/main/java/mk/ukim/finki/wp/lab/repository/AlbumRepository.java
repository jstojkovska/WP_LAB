package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AlbumRepository {
    private List<Album> albums;

    public AlbumRepository() {
        albums = new ArrayList<>();

        albums.add(new Album("Alb1", "Hip Hop", "1973"));
        albums.add(new Album("Alb2", "Rock", "2000"));
        albums.add(new Album("Alb3", "Jazz", "1999"));
        albums.add(new Album("Alb4", "Classic", "1979"));
        albums.add(new Album("Alb5", "Electronic", "2010"));
    }

    public List<Album> findAll(){
        return albums;
    }

    public Optional<Album> findById(Long id){
        return albums.stream()
                .filter(album -> album.getId().equals(id))
                .findFirst();
    }

}
