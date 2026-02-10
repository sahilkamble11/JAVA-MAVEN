package com.tap.tflassessment.servlet.Services;

import com.tap.tflassessment.servlet.Entities.QuestionModel;
import java.util.List;

public interface QuestionService {
    //QuestionModel getQuestionById(int id) ;
    public List <QuestionModel> getAllQuestions();

    
}
