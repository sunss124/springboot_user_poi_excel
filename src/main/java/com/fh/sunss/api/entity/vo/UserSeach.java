package com.fh.sunss.api.entity.vo;


import com.fh.sunss.api.entity.po.User;

public class UserSeach extends  BaseSeach<User>{
    private  Integer sheetLength;
    private  String nameSearch;
    private  String  areaStrSearch;
    private  String typeStrSearch;
    private  Integer isupSearch;
    private  Integer ishotSearch;
    private  Integer minPriceSearch;
    private  Integer maxPriceSearch;

    public String getNameSearch() {
        return nameSearch;
    }

    public void setNameSearch(String nameSearch) {
        this.nameSearch = nameSearch;
    }

    public String getAreaStrSearch() {
        return areaStrSearch;
    }

    public void setAreaStrSearch(String areaStrSearch) {
        this.areaStrSearch = areaStrSearch;
    }

    public String getTypeStrSearch() {
        return typeStrSearch;
    }

    public void setTypeStrSearch(String typeStrSearch) {
        this.typeStrSearch = typeStrSearch;
    }

    public Integer getIsupSearch() {
        return isupSearch;
    }

    public void setIsupSearch(Integer isupSearch) {
        this.isupSearch = isupSearch;
    }

    public Integer getIshotSearch() {
        return ishotSearch;
    }

    public void setIshotSearch(Integer ishotSearch) {
        this.ishotSearch = ishotSearch;
    }

    public Integer getMinPriceSearch() {
        return minPriceSearch;
    }

    public void setMinPriceSearch(Integer minPriceSearch) {
        this.minPriceSearch = minPriceSearch;
    }

    public Integer getMaxPriceSearch() {
        return maxPriceSearch;
    }

    public void setMaxPriceSearch(Integer maxPriceSearch) {
        this.maxPriceSearch = maxPriceSearch;
    }

    public Integer getSheetLength() {
        return sheetLength;
    }

    public void setSheetLength(Integer sheetLength) {
        this.sheetLength = sheetLength;
    }
}
