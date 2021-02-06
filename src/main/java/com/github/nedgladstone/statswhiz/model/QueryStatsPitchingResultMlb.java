package com.github.nedgladstone.statswhiz.model;

import io.micronaut.core.annotation.Introspected;

import java.util.List;

@Introspected
public class QueryStatsPitchingResultMlb {
    private String created;
    private String totalSize;
    private List<StatsPitchingMlb> row;

    public QueryStatsPitchingResultMlb(String created, String totalSize, List<StatsPitchingMlb> row) {
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

    public List<StatsPitchingMlb> getRow() {
        return row;
    }

    public void setRow(List<StatsPitchingMlb> row) {
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
