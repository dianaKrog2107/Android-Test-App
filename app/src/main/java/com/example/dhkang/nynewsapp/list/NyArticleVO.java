package com.example.dhkang.nynewsapp.list;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by dhkang on 2018-02-20.
 */

public class NyArticleVO {
    @SerializedName("section")
    @Expose
    private String section;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("abstract")
    @Expose
    private String _abstract;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("published_date")
    @Expose
    private String publishedDate;
    @SerializedName("multimedia")
    @Expose
    private List<NyMultiVO> multimedia = null;

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstract() {
        return _abstract;
    }

    public void setAbstract(String _abstract) {
        this._abstract = _abstract;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public List<NyMultiVO> getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(List<NyMultiVO> multimedia) {
        this.multimedia = multimedia;
    }
}
