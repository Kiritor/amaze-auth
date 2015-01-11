package com.amaze.core.datamng;


import java.util.List;

import com.amaze.core.po.Root;

public interface BaseDataMng {

	/**
	 * 保存对象
	 * 
	 * @param root
	 * @return
	 * @throws Exception
	 */
	public abstract String saveObj(Root root) throws Exception;

	/**
	 * 保存或更新对象
	 * 
	 * @param root
	 * @throws Exception
	 */
	public abstract void saveOrUpdate(Root root) throws Exception;

	/**
	 * 更新对象
	 * 
	 * @param root
	 * @throws Exception
	 */
	public abstract void updateObj(Root root) throws Exception;

	/**
	 * 根据Id、类名获取对象
	 * 
	 * @param id
	 * @param className
	 * @return
	 */
	public abstract Root getObj(String id, String className);
	
	/**
	 * 根据id、类获取对象
	 * @param id
	 * @param className
	 * @return
	 */
	public abstract Root getObj(String id,Class<?> className);
	
	/**
	 * 根据id,类名删除记录
	 * @param id
	 * @param className
	 * @return
	 * @throws Exception
	 */
	public abstract Root deleteObj(String id,String className) throws Exception;
	
	/**
	 * 根据id、类删除记录
	 * @param id
	 * @param className
	 * @return
	 * @throws Exception
	 */
	public abstract Root deleteObj(String id,Class<?> className) throws Exception;
	
	/**
	 * 根据类名、条件获取单条记录
	 * @param className
	 * @param condition
	 * @return
	 */
	public abstract Root getObjByCondition(String className,String condition);
	
	/**
	 * 根据类、条件获取单条记录
	 * @param className
	 * @param condition
	 * @return
	 */
	public abstract Root getObjByCondition(Class<?> className,String condition);
	
	/**
	 * 根据类名、条件获取记录集合
	 * @param className
	 * @param condition
	 * @return
	 */
	public abstract List<?> getObjListByCondition(String className,String condition);
	
	/**
	 * 根据类、条件获取记录集合
	 * @param className
	 * @param condition
	 * @return
	 */
	public abstract List<?> getObjListByCondition(Class<?> className,String condition);

	/**
	 * 根据类名,条件获取分页记录集合
	 * @param className
	 * 类名
	 * @param condition
	 * 条件
	 * @param firstRow
	 * @param pageSize
	 * @return
	 */
    public abstract List<?> getPagedObjListWithCondition(String className,String condition,int firstRow,int pageSize);

    /**
     * 根据类,条件获取分页记录集合
     * @param className
     * 类名
     * @param condition
     * 条件
     * @param firstRow
     * @param pageSize
     * @return
     */
    public abstract List<?> getPagedObjListWithCondition(Class<?> className,String condition,int firstRow,int pageSize);
    
    /**
     * 根据类名、条件获取记录总数
     * @param className
     * @param condition
     * @return
     */
    public abstract Long getAllObjCountByCondition(String className, String condition);
    
    /**
     * 根据类、条件获取记录总数
     * @param className
     * @param condition
     * @return
     */
    public abstract Long getAllObjCountByCondition(Class<?> className, String condition);
}
