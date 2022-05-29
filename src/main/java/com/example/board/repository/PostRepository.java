package com.example.board.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * 投稿のリポジトリー
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

	public Optional<Post> findById(String id);
	//public List<Post> findAll();
	
	/**
	 * 更新日時の降順で全ての投稿を検索する
	 * 
	 * @return投稿のリスト
	 */
	List<Post> findAllByOrderByUpdatedDateDesc();
	
	/**
	 * 更新日時の降順で未削除の投稿を検索する
	 * 
	 * @retrun 投稿リスト
	 */
	List<Post> findByDeletedFalseOrderByUpdatedDateDesc();
}
