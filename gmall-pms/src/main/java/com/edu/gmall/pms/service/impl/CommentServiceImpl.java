package com.edu.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.edu.gmall.pms.entity.Comment;
import com.edu.gmall.pms.mapper.CommentMapper;
import com.edu.gmall.pms.service.CommentService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author qqq
 * @since 2020-05-10
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
