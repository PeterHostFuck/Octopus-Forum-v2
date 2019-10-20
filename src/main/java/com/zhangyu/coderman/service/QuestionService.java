package com.zhangyu.coderman.service;

import com.github.pagehelper.PageInfo;
import com.zhangyu.coderman.dto.*;
import com.zhangyu.coderman.modal.Question;
import com.zhangyu.coderman.modal.User;

import java.util.List;

public interface QuestionService {

    void doPublish(Question question);

    PageInfo<Question> getPage(Integer pageNo, Integer pageSize);

    PageInfo<Question> findQuestionsByUserId(Integer pageNo, Integer pageSize, Integer id);

    Question findQuestionById(Integer id);

    void updateQuestion(Question question);

    ResultTypeDTO saveOrUpdate(Question question);

    List<Question> relatedQuestions(Question question);

    void incViewCount(Question question);

    List<CommentDTO> findQuestionComments(Integer id);

    PageInfo<Question> getPageBySearch(QuestionQueryDTO questionQueryDTO);


    List<QuestionDTO> findNewQuestion(int i);

    PageInfo<Question> findQuestionsByCategory(Integer pageNo, Integer pageSize, Integer categoryVal);

    List<QuestionDTO> findRecommendQuestions(int pageno, int pagesize);

    PageInfo<Question> getCollectPage(Integer pageNo, Integer pageSize, Integer userId);

    List<User> findCollectUsers(Integer id);

    PageInfo<Question> findQuestionsWithUserByTopic(TopicQueryDTO topicQueryDTO);
}
