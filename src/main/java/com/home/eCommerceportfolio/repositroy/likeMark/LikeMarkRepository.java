package com.home.eCommerceportfolio.repositroy.likeMark;

import com.home.eCommerceportfolio.entity.LikeMark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeMarkRepository extends JpaRepository<LikeMark,Long>, LikeMarkRepositorySupport {
}
