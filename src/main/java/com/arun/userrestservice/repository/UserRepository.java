package com.arun.userrestservice.repository;

import com.arun.userrestservice.dao.UserDao;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author arun on 7/12/20
 */
public interface UserRepository extends PagingAndSortingRepository<UserDao, Long> {
}
