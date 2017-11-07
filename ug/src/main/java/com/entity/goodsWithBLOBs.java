package com.entity;

public class goodsWithBLOBs extends goods {
    private String goodsstate;

    private String thumpuserids;

    public String getGoodsstate() {
        return goodsstate;
    }

    public void setGoodsstate(String goodsstate) {
        this.goodsstate = goodsstate == null ? null : goodsstate.trim();
    }

    public String getThumpuserids() {
        return thumpuserids;
    }

    public void setThumpuserids(String thumpuserids) {
        this.thumpuserids = thumpuserids == null ? null : thumpuserids.trim();
    }
}