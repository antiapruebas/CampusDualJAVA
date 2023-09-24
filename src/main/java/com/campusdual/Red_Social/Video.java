package com.campusdual.Red_Social;

import java.util.List;
import java.util.Date;

public class Video extends Post {

    protected String quality;
    protected String duration;

    public Video(String titlePost, String datePost, String userName, String qualityVideo, String durationVideo) {
        super(titlePost, datePost, userName);
        this.quality = quality;
        this.duration= duration;
    }

    public Video(String idPost, String titlePost, List<String> commentsList, String datePost, String userName, String qualityVideo, String durationVideo) {
        super(idPost, titlePost, commentsList, datePost, userName);
        this.quality = quality;
        this.duration = duration;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality= quality;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }


}