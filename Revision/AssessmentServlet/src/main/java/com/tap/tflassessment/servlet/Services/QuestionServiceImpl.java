package com.tap.tflassessment.servlet.Services;

import com.tap.tflassessment.servlet.Entities.QuestionModel;
import com.tap.tflassessment.servlet.Repositories.QuestionRepositoryImpl;
import com.tap.tflassessment.servlet.Repositories.QuestionRepository;
import java.util.List;

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
