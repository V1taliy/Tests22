package Tests22;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ProblemTest {

    private static Problem problem1 = new Problem();
    private static Problem problem2 = new Problem();

    private static ArrayList<Problem> problems = new ArrayList<Problem>();


   // private static Problem[] problemsArray = {};

    @Test
    public void testDfsAlgorithm() {

        problems.add(problem1);
        problems.add(problem2);


        System.out.println(problems);

    }


}

