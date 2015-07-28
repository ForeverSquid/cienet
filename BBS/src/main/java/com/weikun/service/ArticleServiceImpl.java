package com.weikun.service;

import java.util.List;

import com.weikun.dao.*;
import com.weikun.vo.Article;
import com.weikun.vo.PageBean;

public class ArticleServiceImpl implements IArticleService {
	private IArticleDAO dao=new ArticleDAOImpl();
	@Override
	public PageBean queryArticles(int curPage,String usrid) {
		// TODO Auto-generated method stub
		return dao.queryArticles(curPage,usrid);
	}

}
