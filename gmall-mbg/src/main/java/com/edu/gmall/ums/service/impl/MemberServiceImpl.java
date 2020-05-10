package com.edu.gmall.ums.service.impl;

import com.edu.gmall.ums.entity.Member;
import com.edu.gmall.ums.mapper.MemberMapper;
import com.edu.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author qqq
 * @since 2020-05-10
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
