package com.example.album.model;

public class Album {

    private  int albumID;
    private String name;
    private String description;
    private String coverPicUrl;

    public Album(int albumID, String name, String description, String coverPicUrl) {
        this.albumID = albumID;
        this.name = name;
        this.description = description;
        this.coverPicUrl = coverPicUrl;
    }




    public int getAlbumID() {
        return albumID;
    }

    public void setAlbumID(int albumID) {
        this.albumID = albumID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoverPicUrl() {
        return coverPicUrl;
    }

    public void setCoverPicUrl(String coverPicUrl) {
        this.coverPicUrl = coverPicUrl;
    }



    @Override
    public String toString() {
        return "Album{" +
                "albumID=" + albumID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", coverPicUrl='" + coverPicUrl + '\'' +
                '}';
    }

}
