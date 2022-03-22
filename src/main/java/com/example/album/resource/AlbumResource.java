package com.example.album.resource;

import com.example.album.model.Album;
import com.example.album.service.AlbumService;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Service
public class AlbumResource {

    @Autowired
    private AlbumService albumService;
    @GetMapping("/album")
        public List<Album> getAlbum(){
        return albumService.getAlbum();
    }

    @GetMapping("/album/{albumID}")
    public Album getAlbumById(@PathVariable("albumID") int albumID){
        return albumService.getAlbumById(albumID);

    }


    @PostMapping("/album")
    public Album saveAlbum(@RequestBody Album album){
        return albumService.saveAlbum(album);

    }

    @PutMapping("/album/{albumID}")
    public Album updateAlbum(@PathVariable("albumID") int albumID,@RequestBody Album album){
        return albumService.updateAlbum(albumID,album);

    }

    @DeleteMapping("/album")
    public Album deleteAlbum(@RequestParam(name="albumID") int albumID){
        return albumService.deleteAlbum(albumID);
    }
}
