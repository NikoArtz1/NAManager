package io.github.nikoartz1.NAManager.DTOs;

public record AssetResponseDTO(
        Integer assetId,
        String assetName,
        String assetDetail,
        String assetCategory
) {
}
