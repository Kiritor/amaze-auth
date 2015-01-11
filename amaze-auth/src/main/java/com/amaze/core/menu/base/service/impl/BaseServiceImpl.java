package com.amaze.core.menu.base.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amaze.core.datamng.BaseDataMng;
import com.amaze.core.menu.base.service.BaseService;
import com.amaze.core.po.Root;

@Service("baseService")
@Transactional
public class BaseServiceImpl implements BaseService{

	@Resource
	public BaseDataMng baseDataMng;
	@Override
	public String saveObj(Root root) throws Exception {
		// TODO Auto-generated method stub
		return baseDataMng.saveObj(root);
	}

}
