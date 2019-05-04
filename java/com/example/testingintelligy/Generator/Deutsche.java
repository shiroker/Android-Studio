package com.example.testingintelligy.Generator;

import com.example.testingintelligy.R;

import java.util.Arrays;
//import java.util.List;

public class Deutsche implements Test {

    private int[] allQuest;
    private String[] allAnswer;
    private int[] allImageAnswers;



    public Deutsche(){


        allQuest = new int[]{R.drawable.dliq_1, R.drawable.dliq_2,R.drawable.dliq_3,R.drawable.dliq_4,R.drawable.dliq_5,R.drawable.dliq_6,R.drawable.dliq_7,
                R.drawable.dliq_8, R.drawable.liq_1,R.drawable.liq_2,R.drawable.liq_3,R.drawable.liq_4,R.drawable.liq_5,R.drawable.liq_6,R.drawable.liq_7,
                R.drawable.liq_8,R.drawable.liq_9,R.drawable.liq_10,R.drawable.liq_11,R.drawable.liq_12,R.drawable.liq_13,R.drawable.liq_14,R.drawable.liq_15,
                R.drawable.liq_16,R.drawable.liq_17,R.drawable.liq_18,R.drawable.liq_19,R.drawable.liq_20,R.drawable.liq_21,R.drawable.liq_22,R.drawable.liq_23,
                R.drawable.liq_24,R.drawable.liq_25,R.drawable.liq_26,R.drawable.liq_27,R.drawable.liq_28,R.drawable.liq_29,R.drawable.liq_30,R.drawable.liq_31,
                R.drawable.liq_32,R.drawable.liq_33,R.drawable.liq_34,R.drawable.liq_35,R.drawable.liq_36,R.drawable.liq_37,R.drawable.liq_38,R.drawable.liq_39,
                R.drawable.liq_40,R.drawable.liq_41,R.drawable.liq_42,R.drawable.liq_43,R.drawable.liq_44,R.drawable.liq_45,R.drawable.liq_46,R.drawable.liq_47,
                R.drawable.liq_48,R.drawable.liq_49,R.drawable.liq_50,R.drawable.liq_51,R.drawable.liq_52,R.drawable.liq_53,R.drawable.liq_54,R.drawable.liq_55,
                R.drawable.liq_56,R.drawable.liq_57};

        allAnswer = new String[]{"B","A","B","C","B","D","B","C",
                "D","A","D","B","C","B","A","C","B","C",
                "A","C","B","C","D","A","D","B","A","C",
                "B","C","A","C","D","B","D","A","B","C",
                "D","A","B","D","A","B","C","B","C","B",
                "A","D","B","C","D","A","C","D","A","D",
                "A","B","D","C","D","C","D"};
        allImageAnswers = new int[]{R.drawable.liq_1_a,R.drawable.liq_2_a,R.drawable.liq_3_a,R.drawable.liq_4_a,R.drawable.liq_5_a,R.drawable.liq_6_a,R.drawable.liq_7_a,
                R.drawable.liq_8_a,R.drawable.liq_9_a,R.drawable.liq_10_a,R.drawable.liq_11_a,R.drawable.liq_12_a,R.drawable.liq_13_a,R.drawable.liq_14_a,R.drawable.liq_15_a,
                R.drawable.liq_16_a,R.drawable.liq_17_a,R.drawable.liq_18_a,R.drawable.liq_19_a,R.drawable.liq_20_a,R.drawable.liq_21_a,R.drawable.liq_22_a,R.drawable.liq_23_a,
                R.drawable.liq_24_a,R.drawable.liq_25_a,R.drawable.liq_26_a,R.drawable.liq_27_a,R.drawable.liq_28_a,R.drawable.liq_29_a,R.drawable.liq_30_a,R.drawable.liq_31_a,
                R.drawable.liq_32_a,R.drawable.liq_33_a,R.drawable.liq_34_a,R.drawable.liq_35_a,R.drawable.liq_36_a,R.drawable.liq_37_a,R.drawable.liq_38_a,R.drawable.liq_39_a,
                R.drawable.liq_40_a,R.drawable.liq_41_a,R.drawable.liq_42_a,R.drawable.liq_43_a,R.drawable.liq_44_a,R.drawable.liq_45_a,R.drawable.liq_46_a,R.drawable.liq_47_a,
                R.drawable.liq_48_a,R.drawable.liq_49_a,R.drawable.liq_50_a,R.drawable.liq_51_a,R.drawable.liq_52_a,R.drawable.liq_53_a,R.drawable.liq_54_a,R.drawable.liq_55_a,
                R.drawable.liq_56_a,R.drawable.liq_57_a};

    }





    //@Override
   // public List<Integer> getQuestions(Integer size) {
      //  Integer[] q = Arrays.copyOfRange(allQuest,1,size); return Arrays.asList(q);}


   // @Override
   // public List<String> getAnswers(Integer size){ return Arrays.asList(allAnswer).subList(1,size);}

    //@Override
   // public List<Integer> getImageAnswers(Integer size){return  Arrays.asList(allImageAnswers).subList(1,size);}

    @Override
    public  int[] getQues(int size){return  Arrays.copyOfRange(allQuest,0,size);}
    @Override
    public  int[] getimgs(int size){return  Arrays.copyOfRange(allImageAnswers,0,size);}
    @Override
    public String[] getans(int size){return  Arrays.copyOfRange(allAnswer,0,size);}





    public String getResultBtnText(){return "Das Ergebnis ->";}


}
