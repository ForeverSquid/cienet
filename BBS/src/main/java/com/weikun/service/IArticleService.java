package com.weikun.service;



import com.weikun.vo.Article;
import com.weikun.vo.PageBean;

public interface IArticleService {
	public PageBean queryArticles(int curPage,String usrid) ;
	public boolean delArticle(int id) ;
	public boolean addArticle(Article article) ;
}
