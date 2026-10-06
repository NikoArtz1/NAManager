package io.github.nikoartz1.NAManager.Services;

import io.github.nikoartz1.NAManager.DTOs.AssetMapper;
import io.github.nikoartz1.NAManager.DTOs.AssetResponseDTO;
import io.github.nikoartz1.NAManager.Models.Asset;
import io.github.nikoartz1.NAManager.Repositories.AssetRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssetService {
    private final AssetRepository assetRepository;
    private final AssetMapper assetMapper;

    public AssetService(AssetRepository assetRepository, AssetMapper assetMapper){
        this.assetRepository = assetRepository;
        this.assetMapper = assetMapper;
    }

    public List<AssetResponseDTO> getAllAssets() {
        List<Asset> assets = assetRepository.findAll();

        List<AssetResponseDTO> assetDTOs = new ArrayList<>();

        for(Asset asset : assets){
            AssetResponseDTO dto = assetMapper.toResponseDTO(asset);

            assetDTOs.add(dto);
        }

        return assetDTOs;
    }

    public AssetResponseDTO findAssetById(Integer id){
        Asset asset = assetRepository.findById(id)
                .orElse(null);

        return assetMapper.toResponseDTO(asset);
    }
}
