package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhenduanjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhenduanjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhenduanjiluView;


/**
 * 诊断记录
 *
 * @author 
 * @email 
 * @date 2022-03-16 16:17:03
 */
public interface ZhenduanjiluService extends IService<ZhenduanjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhenduanjiluVO> selectListVO(Wrapper<ZhenduanjiluEntity> wrapper);
   	
   	ZhenduanjiluVO selectVO(@Param("ew") Wrapper<ZhenduanjiluEntity> wrapper);
   	
   	List<ZhenduanjiluView> selectListView(Wrapper<ZhenduanjiluEntity> wrapper);
   	
   	ZhenduanjiluView selectView(@Param("ew") Wrapper<ZhenduanjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhenduanjiluEntity> wrapper);
   	

}

