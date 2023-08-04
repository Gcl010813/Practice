package com.xiaoGuo.community.utils;

import java.io.Serializable;
import java.util.List;

public class PageUtil<T> implements Serializable {
    private Integer dataCount;          //数据总条数
    private Integer pageSize;           //每页显示的条数
    private Integer totalPages;         //总页数
    private Integer pageNumber=1;         //当前页
    private Integer beginIndex;         //当前页数据的开始下标
    private List<T> list;

    public Integer getDataCount() {
        return dataCount;
    }

    public void setDataCount(Integer dataCount) {
        this.dataCount = dataCount;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getBeginIndex() {
        return beginIndex;
    }

    public void setBeginIndex(Integer beginIndex) {
        this.beginIndex = beginIndex;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
    public PageUtil() {
    }

    public PageUtil(Integer dataCount, Integer pageSize, Integer totalPages, Integer pageNumber, Integer beginIndex, List<T> list) {
        this.dataCount = dataCount;
        this.pageSize = pageSize;
        this.totalPages = totalPages;
        this.pageNumber = pageNumber;
        this.beginIndex = beginIndex;
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageUtils{" +
                "dataCount=" + dataCount +
                ", pageSize=" + pageSize +
                ", totalPages=" + totalPages +
                ", pageNumber=" + pageNumber +
                ", beginIndex=" + beginIndex +
                ", list=" + list +
                '}';
    }
}