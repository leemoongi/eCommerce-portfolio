package com.home.eCommerceportfolio.repositroy.userActivityLog;

import com.home.eCommerceportfolio.entity.UserActivityLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserActivityLogRepository extends JpaRepository<UserActivityLog,Long>, UserActivityLogRepositorySupport {
}
