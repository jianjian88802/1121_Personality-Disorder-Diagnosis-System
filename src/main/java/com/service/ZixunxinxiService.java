package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZixunxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZixunxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZixunxinxiView;


/**
 * 咨询信息
 *
 * @author 
 * @email 
 * @date 2022-03-16 16:17:03
 */
public interface ZixunxinxiService extends IService<ZixunxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZixunxinxiVO> selectListVO(Wrapper<ZixunxinxiEntity> wrapper);
   	
   	ZixunxinxiVO selectVO(@Param("ew") Wrapper<ZixunxinxiEntity> wrapper);
   	
   	List<ZixunxinxiView> selectListView(Wrapper<ZixunxinxiEntity> wrapper);
   	
   	ZixunxinxiView selectView(@Param("ew") Wrapper<ZixunxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZixunxinxiEntity> wrapper);
   	

}

