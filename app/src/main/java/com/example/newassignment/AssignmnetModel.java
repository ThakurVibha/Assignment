package com.example.newassignment;

public class AssignmnetModel {
    private String ImageUrl;
    private String Creator;
    private int Likes;

    public AssignmnetModel(String imageUrl, String creator, int likes) {
        ImageUrl = imageUrl;
        Creator = creator;
        Likes = likes;

    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public String getCreator() {
        return Creator;
    }

    public int getLikeCount() {
        return Likes;
    }


}