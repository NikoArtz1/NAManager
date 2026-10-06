package io.github.nikoartz1.NAManager.Controllers;

import io.github.nikoartz1.NAManager.DTOs.AssetResponseDTO;
import io.github.nikoartz1.NAManager.Repositories.AssetRepository;
import io.github.nikoartz1.NAManager.Services.AssetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/assets")
public class AssetController {
    private final AssetRepository assetRepository;
    private final AssetService assetService;

    public AssetController(AssetRepository assetRepository, AssetService assetService){
        this.assetRepository = assetRepository;
        this.assetService = assetService;
    }

    @GetMapping
    public List<AssetResponseDTO> getAllAssets(){
        return assetService.getAllAssets();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AssetResponseDTO> getAssetById(@PathVariable Integer id){
        AssetResponseDTO dto = assetService.findAssetById(id);

        return ResponseEntity.ok(dto);
    }
}
