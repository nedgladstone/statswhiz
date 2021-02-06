package com.github.nedgladstone.statswhiz.model;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class SearchPlayersResultMlb {
    private String copyRight;
    private QueryPlayersResultMlb queryResults;

    public SearchPlayersResultMlb(String copyRight, QueryPlayersResultMlb queryResults) {
        this.copyRight = copyRight;
        this.queryResults = queryResults;
    }

    public String getCopyRight() {
        return copyRight;
    }

    public void setCopyRight(String copyRight) {
        this.copyRight = copyRight;
    }

    public QueryPlayersResultMlb getQueryResults() {
        return queryResults;
    }

    public void setQueryResults(QueryPlayersResultMlb queryPlayersResultsMlb) {
        this.queryResults = queryPlayersResultsMlb;
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "copyRight='" + copyRight + '\'' +
                ", queryResults=" + queryResults +
                '}';
    }
}
