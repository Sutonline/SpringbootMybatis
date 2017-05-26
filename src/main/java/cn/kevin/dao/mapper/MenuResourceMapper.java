package cn.kevin.dao.mapper;

import cn.kevin.domain.MenuResource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

/**
 * Created by yongkang.zhang on 2017/5/26.
 */
@Mapper
public interface MenuResourceMapper {

    @Select("select * from menu_resource")
    List<MenuResource> selectAll();

}
