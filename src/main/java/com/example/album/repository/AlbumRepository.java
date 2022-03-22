package com.example.album.repository;

import com.example.album.model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRepository {
    List<Album> albumList=new ArrayList();

    public List<Album> getAlbum(){

        return albumList;
    }

    public Album saveAlbum(Album album) {
        album.setAlbumID(albumList.size()+1);
        albumList.add(album);
        return album;
    }

    public Album getAlbumById(int albumID) {
        for(Album album:albumList){
            if(album.getAlbumID()==albumID){
                return album;
            }
        }
        return null;
    }

    public Album updateAlbum(int albumID, Album album) {
        for(Album a:albumList){
            if(a.getAlbumID()==albumID){
                a.setName(album.getName());
                a.setDescription(album.getDescription());
                a.setCoverPicUrl(album.getCoverPicUrl());
                return a;
            }
        }
        return null;
    }

    public Album deleteAlbum(int albumID) {
        Album deletedAlbum=null;
        for(Album a:albumList){
            if(a.getAlbumID()==albumID){
                deletedAlbum=a;
                albumList.remove(a);
                return deletedAlbum;
            }
        }
        return deletedAlbum;
    }
}
