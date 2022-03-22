package com.example.album.service;

import com.example.album.model.Album;
import com.example.album.repository.AlbumRepository;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Service
@Repository
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public List<Album> getAlbum(){
        return albumRepository.getAlbum();
    }

    public Album saveAlbum(Album album) {
        return albumRepository.saveAlbum(album);
    }

    public Album getAlbumById(int albumID) {
        return albumRepository.getAlbumById(albumID);
    }

    public Album updateAlbum(int albumID, Album album) {
        return albumRepository.updateAlbum(albumID,album);
    }

    public Album deleteAlbum(int albumID) {
        return albumRepository.deleteAlbum(albumID);
    }
}
