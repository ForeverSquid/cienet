package com.weikun.dao;
import com.weikun.vo.*;

import java.util.*;
public interface IArticleDAO {
	public PageBean queryArticles(int curPage,String usrid);
}
