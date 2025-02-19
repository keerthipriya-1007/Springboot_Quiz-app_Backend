package com.project.quizapp.service;

import com.project.quizapp.dao.QuestionDao;
import com.project.quizapp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<List<Question>> getAllQuestions() {
        try{

                return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
        }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String  addQuestion(Question question) {
        questionDao.save(question);
        return ("Success");
    }
}
