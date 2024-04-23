package com.mokcoding.ex02.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mokcoding.ex02.domain.BoardVO;
import com.mokcoding.ex02.util.Pagination;

@Mapper
public interface BoardMapper {
	// 메소드 이름은 BoardMapper.xml에서 SQL 쿼리 정의 태그의 id 값과 동일
	// 매개변수는 BoardMapper.xml에서 #{변수명}과 동일(클래스 타입은 각 멤버변수명과 매칭)
	int insert(BoardVO boardVO); // 게시글 등록
	List<BoardVO> selectList(); // 게시글 전체 조회
	BoardVO selectOne(int boardId); // 특정 게시글 조회
	int update(BoardVO boardVO); // 특정 게시글 수정
	int delete(int boardId); // 특정 게시글 삭제
	// DB -> MAPPER.XML -> MAPPER.JAVA 순으로 진행후 TEST를 하는게 꼭 좋음
	// 전체 게시글 페이징 처리
	List<BoardVO> selectListByPagination(Pagination pagination);
	int selectTotalCount();
}
