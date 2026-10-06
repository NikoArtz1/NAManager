package io.github.nikoartz1.NAManager.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Asset")
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Asset_Id")
    private Integer assetId;

    @Column(name = "Asset_Name", nullable = false, length = 40)
    @Size(max = 40, message = "An asset's name cannot exceed 40 characters.")
    private String assetName;

    @Column(name = "Asset_Detail", nullable = true, length = 400)
    @Size(max = 400, message = "An asset's detail cannot exceed 400 characters.")
    private String assetDetail;

    @Column(name = "Asset_Category", nullable = false, length = 20)
    @Size(max = 20, message = "An asset's category cannot exceed 20 characters.")
    private String assetCategory;

    @Column(name = "Hidden_Flag", nullable = false, length = 30)
    @Size(max = 30, message = "A hidden flag to test DTOs. You shouldn't see this.")
    private String hiddenFlag;

    public Integer getAssetId(){
        return assetId;
    }

    public void setAssetId(Integer assetId){
        this.assetId = assetId;
    }

    public String getAssetName(){
        return assetName;
    }

    public void setAssetName(String assetName){
        this.assetName = assetName;
    }

    public String getAssetDetail(){
        return assetDetail;
    }

    public void setAssetDetail(String assetDetail){
        this.assetDetail = assetDetail;
    }

    public String getAssetCategory(){
        return assetCategory;
    }

    public void setAssetCategory(String assetCategory){
        this.assetCategory = assetCategory;
    }

    public String getHiddenFlag() {
        return hiddenFlag;
    }

    public void setHiddenFlag(String hiddenFlag) {
        this.hiddenFlag = hiddenFlag;
    }
}
