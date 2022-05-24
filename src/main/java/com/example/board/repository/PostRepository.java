package com.example.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

/*
 * 投稿のリポジトリー
 */
public interface PostRepository extends JpaRepository<Post, Long> {

}
