package com.github.nedgladstone.statswhiz.model;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class SearchStatsHittingResultMlb {
    private String copyRight;
    private QueryStatsHittingResultMlb queryResults;

    public SearchStatsHittingResultMlb(String copyRight, QueryStatsHittingResultMlb queryResults) {
        this.copyRight = copyRight;
        this.queryResults = queryResults;
    }

    public String getCopyRight() {
        return copyRight;
    }

    public void setCopyRight(String copyRight) {
        this.copyRight = copyRight;
    }

    public QueryStatsHittingResultMlb getQueryResults() {
        return queryResults;
    }

    public void setQueryResults(QueryStatsHittingResultMlb queryStatsHittingResultMlb) {
        this.queryResults = queryStatsHittingResultMlb;
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "copyRight='" + copyRight + '\'' +
                ", queryResults=" + queryResults +
                '}';
    }
}
