package com.smart.advice;

import com.smart.concept.Forum;

/**
 * Created by Administrator on 2017/5/5.
 */
public class ForumService {
    public void removeForum(int forumId){
        throw new RuntimeException("运行异常");
    }
    public void updateForum(Forum forum){
        throw new RuntimeException("更新异常");
    }
}
