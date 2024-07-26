package com.fl.myopenshift;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepostiory extends JpaRepository<User,Integer> {
}
