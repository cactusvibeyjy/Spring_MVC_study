package com.demo.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import com.demo.beans.BoardInfoBean;
import com.demo.service.MenuService;

public class MenuInterceptor implements HandlerInterceptor {
	
	
	private MenuService menuService;
	
	// 생성자 주입
	public MenuInterceptor(MenuService menuService) {
		this.menuService = menuService;
	}
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//DB; 테이블에서 게시판 이름들을 가져와 메뉴페이지에 전달하기
		List<BoardInfoBean> topMenuList = menuService.getMenuList();
		request.setAttribute("topMenuList", topMenuList);

		return true;
	}

}
