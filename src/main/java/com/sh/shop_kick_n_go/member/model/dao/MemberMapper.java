package com.sh.shop_kick_n_go.member.model.dao;


import com.sh.shop_kick_n_go.member.model.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    MemberDto read(Long id);
}
