package com.weikun.service;



import java.util.List;

import com.weikun.vo.Article;
import com.weikun.vo.PageBean;
import com.weikun.vo.ReArticle;

public interface IArticleService {
	public PageBean queryArticles(int curPage,String usrid) ;
	public boolean delArticle(int id) ;
	public boolean addArticle(Article article) ;
	public String queryCT(int id) ;
}
