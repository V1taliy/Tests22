package Tests22;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class ProblemTest {

    private static Problem problem1 = new Problem();
    private static Problem problem2 = new Problem();

    private static ArrayList<Problem> problems = new ArrayList<Problem>();


   // private static Problem[] problemsArray = {};

    @Test
    public String testDfsAlgorithm() {

        problems.add(problem1);
        problems.add(problem2);


        problem1.setUseDFSAlgorithm(true);
        problem2.setUseDFSAlgorithm(false);
        if(problem1.equals(true))
        {
return "DFS";

        }

else
        return problem2.applyAlgorithm().equals(true)
    }


}

