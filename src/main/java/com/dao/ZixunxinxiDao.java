package com.dao;

import com.entity.ZixunxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZixunxinxiVO;
import com.entity.view.ZixunxinxiView;


/**
 * 咨询信息
 * 
 * @author 
 * @email 
 * @date 2022-03-16 16:17:03
 */
public interface ZixunxinxiDao extends BaseMapper<ZixunxinxiEntity> {
	
	List<ZixunxinxiVO> selectListVO(@Param("ew") Wrapper<ZixunxinxiEntity> wrapper);
	
	ZixunxinxiVO selectVO(@Param("ew") Wrapper<ZixunxinxiEntity> wrapper);
	
	List<ZixunxinxiView> selectListView(@Param("ew") Wrapper<ZixunxinxiEntity> wrapper);

	List<ZixunxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZixunxinxiEntity> wrapper);
	
	ZixunxinxiView selectView(@Param("ew") Wrapper<ZixunxinxiEntity> wrapper);
	

}
