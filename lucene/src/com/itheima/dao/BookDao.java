package com.itheima.dao;

import java.util.List;
import com.itheima.domain.Book;

/*
 * 好习惯---->写明当前方法是干啥用的
 * 查询book集合
 */

public interface BookDao {

	public List<Book> queryList();
}
