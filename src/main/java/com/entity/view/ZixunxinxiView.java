package com.entity.view;

import com.entity.ZixunxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 咨询信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-16 16:17:03
 */
@TableName("zixunxinxi")
public class ZixunxinxiView  extends ZixunxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZixunxinxiView(){
	}
 
 	public ZixunxinxiView(ZixunxinxiEntity zixunxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zixunxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
