package com.backend.camping.member.dao;


import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.backend.camping.member.domain.Member;
import com.backend.camping.member.domain.MemberToken;
import com.backend.camping.member.dto.param.CreateMemberParam;
import com.backend.camping.member.dto.param.CreateMemberTokenParam;




@Mapper
@Repository
public interface MemberDao {
    

	public Member findById(String id); //시큐리티 디테일서비스에서 사용 

 	public Integer isExistUserId(String id); //중복여부확인

	public Integer createMember(CreateMemberParam param);  //화원가입처리


	public Integer createjwttoken(CreateMemberTokenParam param);  //화원가입처리

	public Integer deletejwttoken(String id); //토큰 삭제 

	public Optional<MemberToken> findBytoken(String id);

}
