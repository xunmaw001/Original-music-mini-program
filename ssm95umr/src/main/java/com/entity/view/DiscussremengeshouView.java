package com.entity.view;

import com.entity.DiscussremengeshouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 热门歌手评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-14 11:56:01
 */
@TableName("discussremengeshou")
public class DiscussremengeshouView  extends DiscussremengeshouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussremengeshouView(){
	}
 
 	public DiscussremengeshouView(DiscussremengeshouEntity discussremengeshouEntity){
 	try {
			BeanUtils.copyProperties(this, discussremengeshouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
