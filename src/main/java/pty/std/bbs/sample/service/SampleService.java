package pty.std.bbs.sample.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface SampleService {
	void insertBoard(Map<String, Object> map, HttpServletRequest request) throws Exception;

	Map<String, Object> selectBoardDetail(Map<String, Object> map) throws Exception;

	void updateBoard(Map<String, Object> map, HttpServletRequest request) throws Exception;

	void deleteBoard(Map<String, Object> map) throws Exception;

	Map<String, Object> selectBoardList(Map<String, Object> map) throws Exception;
}
