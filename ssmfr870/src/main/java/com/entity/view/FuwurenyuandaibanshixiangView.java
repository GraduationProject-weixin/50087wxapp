package com.entity.view;

import com.entity.FuwurenyuandaibanshixiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 服务人员待办事项
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-01 20:21:01
 */
@TableName("fuwurenyuandaibanshixiang")
public class FuwurenyuandaibanshixiangView  extends FuwurenyuandaibanshixiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FuwurenyuandaibanshixiangView(){
	}
 
 	public FuwurenyuandaibanshixiangView(FuwurenyuandaibanshixiangEntity fuwurenyuandaibanshixiangEntity){
 	try {
			BeanUtils.copyProperties(this, fuwurenyuandaibanshixiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
