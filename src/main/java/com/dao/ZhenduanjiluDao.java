package com.dao;

import com.entity.ZhenduanjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhenduanjiluVO;
import com.entity.view.ZhenduanjiluView;


/**
 * 诊断记录
 * 
 * @author 
 * @email 
 * @date 2022-03-16 16:17:03
 */
public interface ZhenduanjiluDao extends BaseMapper<ZhenduanjiluEntity> {
	
	List<ZhenduanjiluVO> selectListVO(@Param("ew") Wrapper<ZhenduanjiluEntity> wrapper);
	
	ZhenduanjiluVO selectVO(@Param("ew") Wrapper<ZhenduanjiluEntity> wrapper);
	
	List<ZhenduanjiluView> selectListView(@Param("ew") Wrapper<ZhenduanjiluEntity> wrapper);

	List<ZhenduanjiluView> selectListView(Pagination page,@Param("ew") Wrapper<ZhenduanjiluEntity> wrapper);
	
	ZhenduanjiluView selectView(@Param("ew") Wrapper<ZhenduanjiluEntity> wrapper);
	

}
