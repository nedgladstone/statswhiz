package com.github.nedgladstone.statswhiz.model;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class SearchStatsPitchingResultMlb {
    private String copyRight;
    private QueryStatsPitchingResultMlb queryResults;

    public SearchStatsPitchingResultMlb(String copyRight, QueryStatsPitchingResultMlb queryResults) {
        this.copyRight = copyRight;
        this.queryResults = queryResults;
    }

    public String getCopyRight() {
        return copyRight;
    }

    public void setCopyRight(String copyRight) {
        this.copyRight = copyRight;
    }

    public QueryStatsPitchingResultMlb getQueryResults() {
        return queryResults;
    }

    public void setQueryResults(QueryStatsPitchingResultMlb queryStatsPitchingResultMlb) {
        this.queryResults = queryStatsPitchingResultMlb;
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "copyRight='" + copyRight + '\'' +
                ", queryResults=" + queryResults +
                '}';
    }
}
