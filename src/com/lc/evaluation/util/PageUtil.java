package com.lc.evaluation.util;

import java.util.List;
import java.util.Set;

import com.lc.evaluation.entity.basic.EntityMine;

/**
 * @author 0001
 *
 * @param <T>
 */
public class PageUtil<T extends EntityMine> {

	private long page = -1;// 当前页数

	private long allCount = -1;// 总记录数

	private long allPage = -1;// 总页数(总记录数/每页记录数)

	private long limit = 10;// 每页记录数

	private List<T> list;// 包含的集合
	
	//分页中最大页面个数的范围如：4
	private int maxPageNumSize;
	//页面个数如：    3，4，5，6，7
	private Set<Integer> viewPageNum;

	public int getMaxPageNumSize() {
		return maxPageNumSize;
	}

	public void setMaxPageNumSize(int maxPageNumSize) {
		this.maxPageNumSize = maxPageNumSize;
	}



	public Set<Integer> getViewPageNum() {
		return viewPageNum;
	}

	public void setViewPageNum(Set<Integer> viewPageNum) {
		this.viewPageNum = viewPageNum;
	}

	/**
	 * 该方法完成了对{@link PageUtil#getAllCount()}初始化
	 * <p>
	 * 返回该页面下的起始下标
	 * 
	 * @param allCount
	 *            所有的记录
	 * @param page
	 *            当前页面数
	 * @return 返回该页面下的起始下标
	 * @throws PagePropertyNotInitException
	 */
	public long init(long allCount, long page)  {


		this.allCount = allCount;

		long totalpage = (long) Math.ceil((double)allCount / limit);

		this.allPage = totalpage;
		
		if(page > allPage){  //如果比总页数还大
			page = allPage;
		}
		if(page < 1){  //如果小于第一页
			page = 1;
		}
		this.page = page;  //保存当前页
		long begin = (page - 1) * limit;
		
		// 计算要显示的页面序号数

		// viewPageNum.add
		
//		initViewPageNum();

		return begin;
	}

	/**
	 * 计算出要显示的下标
	 */
	private void initViewPageNum() {
		long max = 0;
		long min = 0;
		long tempPage = page;
		long maxViewPage = tempPage + maxPageNumSize / 2;
		if (maxViewPage > allPage) {
			max = allPage;
		} else {
			max = maxViewPage;
		}
		long minViewPage = tempPage - maxPageNumSize / 2;
		if (minViewPage < 1) {
			min = 1;
		} else {
			min = minViewPage;
		}
		//清除原理数据文件
		viewPageNum.clear();
		for (long i = min; i <= max; i++)
			viewPageNum.add((int) i);
	}

	/**
	 * 获取页数
	 * 
	 * @return 返回当前的页面数
	 */
	public long getPage() {
		return page;
	}

	/**
	 * 设置页面数
	 * 
	 * @param page
	 *            设置页面
	 */
	public void setPage(long page) {
		this.page = page;
	}

	/**
	 * 返回所有记录
	 * 
	 * @return
	 */
	public long getAllCount() {
		return allCount;
	}

	/**
	 * 设置当前的记录总数
	 * 
	 * @param allCount
	 *            记录总数
	 */
	public void setAllCount(long allCount) {
		this.allCount = allCount;
	}

	/**
	 * 返回页面总数
	 * 
	 * @return 放回页面总数
	 */
	public long getAllPage() {
		return allPage;
	}

	/**
	 * 每个页面的限制条数
	 * 
	 * @return 返回每个页面的限制条数
	 */
	public long getLimit() {
		return limit;
	}

	/**
	 * 设置页面的记录显示条数
	 * 
	 * @param limit
	 *            页面的记录显示条数
	 */
	public void setLimit(long limit) {
		this.limit = limit;
	}

	/**
	 * 返回当前页面的list
	 * 
	 * @return
	 */
	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}
