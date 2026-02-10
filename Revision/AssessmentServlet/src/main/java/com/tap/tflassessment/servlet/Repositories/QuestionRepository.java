package com.tap.tflassessment.servlet.Repositories;

import com.tap.tflassessment.servlet.Entities.QuestionModel;
import java.util.List;

public interface QuestionRepository {
   // QuestionModel getQuestionById(int id);
    public List <QuestionModel> getAllQuestions();
    
}
