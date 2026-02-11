package com.tap.tflassessment.servlet.Services;

import java.util.List;

import com.tap.tflassessment.servlet.Entities.QuestionModel;
import com.tap.tflassessment.servlet.Repositories.QuestionRepositoryImpl;

public class QuestionServiceImpl implements QuestionService{

    private QuestionRepositoryImpl _repo=new QuestionRepositoryImpl();

    public QuestionServiceImpl() {
    }

    @Override
    public List<QuestionModel> getAllQuestions(){
        return _repo.getAllQuestions();
    }

    // @Override
    // public QuestionModel getQuestionById(int id){
    //     return _repo.getQuestionById(id);
    // }

    
}
