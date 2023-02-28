package org.project.omwp.repository;

import org.project.omwp.entity.ImgEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImgRepository extends JpaRepository<ImgEntity, Long> {
}