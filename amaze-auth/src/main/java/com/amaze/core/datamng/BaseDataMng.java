package com.amaze.core.datamng;


import java.util.List;

import com.amaze.core.po.Root;

public interface BaseDataMng {

	/**
	 * �������
	 * 
	 * @param root
	 * @return
	 * @throws Exception
	 */
	public abstract String saveObj(Root root) throws Exception;

	/**
	 * �������¶���
	 * 
	 * @param root
	 * @throws Exception
	 */
	public abstract void saveOrUpdate(Root root) throws Exception;

	/**
	 * ���¶���
	 * 
	 * @param root
	 * @throws Exception
	 */
	public abstract void updateObj(Root root) throws Exception;

	/**
	 * ����Id��������ȡ����
	 * 
	 * @param id
	 * @param className
	 * @return
	 */
	public abstract Root getObj(String id, String className);
	
	/**
	 * ����id�����ȡ����
	 * @param id
	 * @param className
	 * @return
	 */
	public abstract Root getObj(String id,Class<?> className);
	
	/**
	 * ����id,����ɾ����¼
	 * @param id
	 * @param className
	 * @return
	 * @throws Exception
	 */
	public abstract Root deleteObj(String id,String className) throws Exception;
	
	/**
	 * ����id����ɾ����¼
	 * @param id
	 * @param className
	 * @return
	 * @throws Exception
	 */
	public abstract Root deleteObj(String id,Class<?> className) throws Exception;
	
	/**
	 * ����������������ȡ������¼
	 * @param className
	 * @param condition
	 * @return
	 */
	public abstract Root getObjByCondition(String className,String condition);
	
	/**
	 * �����ࡢ������ȡ������¼
	 * @param className
	 * @param condition
	 * @return
	 */
	public abstract Root getObjByCondition(Class<?> className,String condition);
	
	/**
	 * ����������������ȡ��¼����
	 * @param className
	 * @param condition
	 * @return
	 */
	public abstract List<?> getObjListByCondition(String className,String condition);
	
	/**
	 * �����ࡢ������ȡ��¼����
	 * @param className
	 * @param condition
	 * @return
	 */
	public abstract List<?> getObjListByCondition(Class<?> className,String condition);

	/**
	 * ��������,������ȡ��ҳ��¼����
	 * @param className
	 * ����
	 * @param condition
	 * ����
	 * @param firstRow
	 * @param pageSize
	 * @return
	 */
    public abstract List<?> getPagedObjListWithCondition(String className,String condition,int firstRow,int pageSize);

    /**
     * ������,������ȡ��ҳ��¼����
     * @param className
     * ����
     * @param condition
     * ����
     * @param firstRow
     * @param pageSize
     * @return
     */
    public abstract List<?> getPagedObjListWithCondition(Class<?> className,String condition,int firstRow,int pageSize);
    
    /**
     * ����������������ȡ��¼����
     * @param className
     * @param condition
     * @return
     */
    public abstract Long getAllObjCountByCondition(String className, String condition);
    
    /**
     * �����ࡢ������ȡ��¼����
     * @param className
     * @param condition
     * @return
     */
    public abstract Long getAllObjCountByCondition(Class<?> className, String condition);
}
