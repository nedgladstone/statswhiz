package com.github.nedgladstone.statswhiz.model;

import io.micronaut.core.annotation.Introspected;

import java.util.List;

@Introspected
public class QueryStatsHittingResultMlb {
    private String created;
    private String totalSize;
    private List<StatsHittingMlb> row;

    public QueryStatsHittingResultMlb(String created, String totalSize, List<StatsHittingMlb> row) {
        this.created = created;
        this.totalSize = totalSize;
        this.row = row;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(String totalSize) {
        this.totalSize = totalSize;
    }

    public List<StatsHittingMlb> getRow() {
        return row;
    }

    public void setRow(List<StatsHittingMlb> row) {
        this.row = row;
    }

    @Override
    public String toString() {
        return "QueryResult{" +
                "created='" + created + '\'' +
                ", totalSize='" + totalSize + '\'' +
                ", row=" + row +
                '}';
    }
}
