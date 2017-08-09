package com.pazl.pazlManage.utils;

import java.util.Collections;
import java.util.List;

/**
 * @author Echo
 *
 */
public class PageInfo 
{
	private int pageindex = 0;//当前页
	
	private int pageData = 0;//每页条数
	
	private int totalPage = 0;//总页数
	//
	private int totalData = 0;//总条数
	
	private List dataList = Collections.EMPTY_LIST;
	
	/**
	 * @return the pageindex
	 */
	public int getPageindex() {
		return pageindex;
	}
	/**
	 * @param pageindex the pageindex to set
	 */
	public void setPageindex(int pageindex) {
		this.pageindex = pageindex;
	}
	/**
	 * @return the pageData
	 */
	public int getPageData() {
		return pageData;
	}
	/**
	 * @param pageData the pageData to set
	 */
	public void setPageData(int pageData) {
		this.pageData = pageData;
	}
	/**
	 * @return the totalPage
	 */
	public int getTotalPage() {
		
		if(totalData != 0){
			this.totalPage = totalData % pageData == 0 ? totalData / pageData : totalData / pageData + 1;
		}
		return totalPage;
	}
	/**
	 * @param totalPage the totalPage to set
	 */
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
			
	}
	/**
	 * @return the totalData
	 */
	public int getTotalData() {
		return totalData;
	}
	/**
	 * @param totalData the totalData to set
	 */
	public void setTotalData(int totalData) {
		this.totalData = totalData;
	}
	/**
	 * @return the dataList
	 */
	public List getDataList() {
		return dataList;
	}
	/**
	 * @param dataList the dataList to set
	 */
	public void setDataList(List dataList) {
		this.dataList = dataList;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(1%20);
	}

}
