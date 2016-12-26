package com.sam.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pager<T> implements Serializable {

	private static final long serialVersionUID = -8456035774058401826L;

	private int pageSize;//每页显示多少条记录
	
	private int currentPage;//当前第几页数据
	
	private int totalRecord;//表示一共多少条记录
	
	private int totalPage;//一共多少页数据
	
	private List<T> dataList;//要显示的数据
	
	

	public Pager() {
	}
	
	public Pager(int pageNum, int pageSize, List<T> sourceList) {
		System.out.println("Pager---sourceList---->"+sourceList);
		System.out.println("Pager---pageNum---->"+pageNum);
		System.out.println("Pager---pageSize---->"+pageSize);
		
		if(sourceList == null) {
			return;
		}
		
		//总记录条数
		this.totalRecord = sourceList.size();
		//每页显示多少条记录
		this.pageSize = pageSize;
		
		//获取总页数
		/**
		 * totalPage --> 总页数
		 * pageNum -->  查询第几页数据
		 */
		this.totalPage = this.totalRecord / this.pageSize;
		if(this.totalRecord % this.pageSize != 0) {
			this.totalPage += 1;
		}
		
		//当前的第几页数据
		//currentpage = this.totalPage < pageNum ? this.currentPage = this.totalPage : pageNum;
		if(this.totalPage < pageNum) {
			this.currentPage = this.totalPage;
		}else {
			this.currentPage = pageNum;
		}
		
		//获取
		//起始索引=每页显示的数据条数 * (当前页码-1)
		int fromIndex = this.pageSize * (this.currentPage - 1);
		
		//int toIndex = this.pageSize * this.currentpage > this.totalRecord ? this.totalRecord : this.pageSize * this.currentpage;
		int toIndex;
		if(this.pageSize * this.currentPage > this.totalRecord) {
			toIndex = this.totalRecord;
		}else {
			toIndex = this.pageSize * this.currentPage;
		}
		this.dataList = new ArrayList<T>();
		if(sourceList.size() > 0) {
			this.dataList = sourceList.subList(fromIndex, toIndex);
		} 
		
	
	}

	public Pager(int pageSize, int currentpage, int totalRecord, int totalPage,
			List<T> dataList) {
		super();
		this.pageSize = pageSize;
		this.currentPage = currentpage;
		this.totalRecord = totalRecord;
		this.totalPage = totalPage;
		this.dataList = dataList;
	}


	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<T> getDataList() {
		return dataList;
	}
	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}
	@Override
	public String toString() {
		return "Pager [pageSize=" + pageSize + ", currentPage=" + currentPage
				+ ", totalRecord=" + totalRecord + ", totalPage=" + totalPage
				+ ", dataList=" + dataList + "]";
	}
	
	
	
}
