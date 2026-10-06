package io.github.nikoartz1.NAManager.Repositories;

import io.github.nikoartz1.NAManager.Models.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Integer> {
}
