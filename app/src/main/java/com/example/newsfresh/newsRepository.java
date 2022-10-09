package com.example.newsfresh;

import java.util.ArrayList;

public class newsRepository {
    private String status;
    private String totalResults;
    private ArrayList<ViewModel> article;

    public newsRepository(String status, String totalResults, ArrayList<ViewModel> article) {
        this.status = status;
        this.totalResults = totalResults;
        this.article = article;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<ViewModel> getArticle() {
        return article;
    }

    public void setArticle(ArrayList<ViewModel> article) {
        this.article = article;
    }
}
