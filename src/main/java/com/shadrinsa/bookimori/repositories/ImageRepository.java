package com.shadrinsa.bookimori.repositories;

import com.shadrinsa.bookimori.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
