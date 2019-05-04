package com.example.testingintelligy.Generator;

import java.util.ArrayList;
import java.util.List;

public interface Test {

   /* public List<Integer> getQuestions(Integer size);

    public List<Integer> getImageAnswers(Integer size);

    public List<String> getAnswers(Integer size);*/

    public int[] getQues(int size);

    public int[] getimgs(int size);

    public String[] getans(int size);
}
