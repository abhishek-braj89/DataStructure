package recursion;

import java.util.ArrayList;

public class MatrixTraversal {

    public ArrayList<String> findPaths(int rowCount, int columnCount,int rowCounter, int columnCounter){
        if(rowCounter == rowCount && columnCounter == columnCount){
            ArrayList<String> steps = new ArrayList<>();
            steps.add("");
            return steps;
        }

        ArrayList<String> pathsAfterInitialHorizontalMove = new ArrayList<>();
        ArrayList<String> pathsAfterInitialVerticalMove = new ArrayList<>();

        if(columnCounter<columnCount)
            pathsAfterInitialHorizontalMove =  findPaths(rowCount,columnCount,rowCounter,columnCounter+1);
        if(rowCounter<rowCount)
            pathsAfterInitialVerticalMove =  findPaths(rowCount,columnCount,rowCounter+1,columnCounter);
        ArrayList<String> allPaths = new ArrayList<>();

        for(String step : pathsAfterInitialHorizontalMove){
           allPaths.add("H" + step);
        }
        for(String step : pathsAfterInitialVerticalMove){
            allPaths.add("V" + step);
        }

        return allPaths;
    }

    public static void main(String[] args){
        ArrayList<String> allPaths = new MatrixTraversal().findPaths(3,3,1,1);
        System.out.println(allPaths);
    }

}
