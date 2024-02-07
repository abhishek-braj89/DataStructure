package recursion;

import java.util.ArrayList;

public class StepsCombo {

    public ArrayList<String> stepsCombo(int stepsCount){

        ArrayList<String> allStepCombos = new ArrayList<>();
        if(stepsCount == 0){
            ArrayList<String> basicStep = new ArrayList<>();
            basicStep.add("");
            return basicStep;
        }
        if(stepsCount < 0){
            return new ArrayList<>();
        }
        ArrayList<String> possibleCombosWith1 = stepsCombo(stepsCount-1);
        ArrayList<String> possibleCombosWith2 = stepsCombo(stepsCount-2);
        //ArrayList<String> possibleCombosWith3 = stepsCombo(stepsCount-3);

        for(String stepsCombination : possibleCombosWith1){
            allStepCombos.add("1:" + stepsCombination);
        }

        for(String stepsCombination : possibleCombosWith2){
            allStepCombos.add("2:" + stepsCombination);
        }

//        for(String stepsCombination : possibleCombosWith3){
//            allStepCombos.add("3:" + stepsCombination);
//        }

        return allStepCombos;
    }


    public static void main(String[] args){
        System.out.println(new StepsCombo().stepsCombo(3));
    }
}
