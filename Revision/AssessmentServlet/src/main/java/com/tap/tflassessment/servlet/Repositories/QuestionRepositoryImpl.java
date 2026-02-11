package com.tap.tflassessment.servlet.Repositories;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tap.tflassessment.servlet.Entities.QuestionModel;

public class QuestionRepositoryImpl implements QuestionRepository {

    @Override
    public List<QuestionModel> getAllQuestions() {
        List<QuestionModel> questions = new ArrayList<>();
        try {
            ObjectMapper mapper = new ObjectMapper();

            InputStream is = getClass().getClassLoader().getResourceAsStream("data/Questions.json");

            questions=mapper.readValue(is,new TypeReference<List<QuestionModel>>() {});

        } catch (Exception e) {
            System.out.println(e);
            
        }
        return questions;
    }

    // @Override
    // public QuestionModel getQuestionById(int id) {
    //     throw new UnsupportedOperationException("Not supported yet.");
    // }
}
