package io.github.nikoartz1.NAManager.DTOs;

import io.github.nikoartz1.NAManager.Models.Asset;
import org.springframework.stereotype.Component;

@Component
public class AssetMapper{
    public AssetResponseDTO toResponseDTO(Asset asset){
        return new AssetResponseDTO(
                asset.getAssetId(),
                asset.getAssetName(),
                asset.getAssetDetail(),
                asset.getAssetCategory()
        );
    }
}
