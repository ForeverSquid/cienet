package com.weikun.service;

import java.util.List;

import com.alibaba.fastjson.JSONArray;
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
	@Override
	public boolean delArticle(int id) {
		// TODO Auto-generated method stub
		return dao.delArticle(id);
	}
	@Override
	public boolean addArticle(Article article) {
		// TODO Auto-generated method stub
		return dao.addArticle(article);
	}
	@Override
	public String queryCT(int id) {
		// TODO Auto-generated method stub
	
		
		
		return 	JSONArray.toJSONString(dao.queryCT(id));
	}
	public static void main(String[] args) {
		System.out.println(new ArticleServiceImpl().queryCT(80));
	}

}
