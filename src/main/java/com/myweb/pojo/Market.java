package com.myweb.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Market {
    private int id;
    private Integer fisheryId;
    private Integer sellStatus;
    private BigDecimal startPrice;
    private BigDecimal stopPrice;
    private Integer sellDuration;
    private String sellStartTime;
    private BigDecimal staticPrice;
    private Integer favorCount;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "fishery_id", nullable = true)
    public Integer getFisheryId() {
        return fisheryId;
    }

    public void setFisheryId(Integer fisheryId) {
        this.fisheryId = fisheryId;
    }

    @Basic
    @Column(name = "sell_status", nullable = true)
    public Integer getSellStatus() {
        return sellStatus;
    }

    public void setSellStatus(Integer sellStatus) {
        this.sellStatus = sellStatus;
    }

    @Basic
    @Column(name = "start_price", nullable = true, precision = 2)
    public BigDecimal getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(BigDecimal startPrice) {
        this.startPrice = startPrice;
    }

    @Basic
    @Column(name = "stop_price", nullable = true, precision = 2)
    public BigDecimal getStopPrice() {
        return stopPrice;
    }

    public void setStopPrice(BigDecimal stopPrice) {
        this.stopPrice = stopPrice;
    }

    @Basic
    @Column(name = "sell_duration", nullable = true)
    public Integer getSellDuration() {
        return sellDuration;
    }

    public void setSellDuration(Integer sellDuration) {
        this.sellDuration = sellDuration;
    }

    @Basic
    @Column(name = "sell_start_time", nullable = true, length = 255)
    public String getSellStartTime() {
        return sellStartTime;
    }

    public void setSellStartTime(String sellStartTime) {
        this.sellStartTime = sellStartTime;
    }

    @Basic
    @Column(name = "static_price", nullable = true, precision = 2)
    public BigDecimal getStaticPrice() {
        return staticPrice;
    }

    public void setStaticPrice(BigDecimal staticPrice) {
        this.staticPrice = staticPrice;
    }

    @Basic
    @Column(name = "favor_count", nullable = true)
    public Integer getFavorCount() {
        return favorCount;
    }

    public void setFavorCount(Integer favorCount) {
        this.favorCount = favorCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Market market = (Market) o;

        if (id != market.id) return false;
        if (fisheryId != null ? !fisheryId.equals(market.fisheryId) : market.fisheryId != null) return false;
        if (sellStatus != null ? !sellStatus.equals(market.sellStatus) : market.sellStatus != null) return false;
        if (startPrice != null ? !startPrice.equals(market.startPrice) : market.startPrice != null) return false;
        if (stopPrice != null ? !stopPrice.equals(market.stopPrice) : market.stopPrice != null) return false;
        if (sellDuration != null ? !sellDuration.equals(market.sellDuration) : market.sellDuration != null) return false;
        if (sellStartTime != null ? !sellStartTime.equals(market.sellStartTime) : market.sellStartTime != null) return false;
        if (staticPrice != null ? !staticPrice.equals(market.staticPrice) : market.staticPrice != null) return false;
        if (favorCount != null ? !favorCount.equals(market.favorCount) : market.favorCount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (fisheryId != null ? fisheryId.hashCode() : 0);
        result = 31 * result + (sellStatus != null ? sellStatus.hashCode() : 0);
        result = 31 * result + (startPrice != null ? startPrice.hashCode() : 0);
        result = 31 * result + (stopPrice != null ? stopPrice.hashCode() : 0);
        result = 31 * result + (sellDuration != null ? sellDuration.hashCode() : 0);
        result = 31 * result + (sellStartTime != null ? sellStartTime.hashCode() : 0);
        result = 31 * result + (staticPrice != null ? staticPrice.hashCode() : 0);
        result = 31 * result + (favorCount != null ? favorCount.hashCode() : 0);
        return result;
    }
}
