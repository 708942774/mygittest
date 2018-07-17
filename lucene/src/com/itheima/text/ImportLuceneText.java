package com.itheima.text;

import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.document.TextField;
import org.junit.Test;
import com.itheima.dao.BookDao;
import com.itheima.dao.impl.BookDaoImpl;
import com.itheima.domain.Book;

public class ImportLuceneText {

	@Test
	public void text() {
		
		//1采集数据
		BookDao bookDao = new BookDaoImpl();
		List<Book> bookList = bookDao.queryList();
		//2创建文档集合
		List<Document> docuList = new ArrayList<>();
		//遍历数据集合
		for (Book book : bookList) {
			//3创建文档对象
			Document document = new Document();
			//4创建Field域对象，存储数据
				//name:指定域名;value:指定域值;store:是否存储;
			Field idField = new TextField("id", book.getId()+"", Store.YES);
			//5把Field放入文档中
			document.add(idField);
			//6把文档对象放入到文档集合中
			docuList.add(document);
		}
		//7创建分词对象
		
		//8创建指定索引库地址的流对象 Director
		//9创建写入索引库的配置对象IndexWriterConfig
		//10创建写入索引库的对象  需要两个参数  上面两个
		//11把文档集合遍历 依次写入到索引库
		//12关闭流
		
	}
}
