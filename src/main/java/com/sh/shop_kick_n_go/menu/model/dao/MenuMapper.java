package com.sh.shop_kick_n_go.menu.model.dao;


import com.sh.shop_kick_n_go.menu.model.dto.CategoryDto;
import com.sh.shop_kick_n_go.menu.model.dto.MenuDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    List<MenuDto> findAll();

    MenuDto findByMenuCode(Long menuCode);

    List<MenuDto> findByCategoryCode(int categoryCode);

    int insertMenu(MenuDto menuDto);

    List<CategoryDto> findAllCategory();
}
