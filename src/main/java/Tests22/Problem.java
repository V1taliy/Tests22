package Tests22;



public class Problem {


        private boolean useDFSAlgorithm;


        public Problem(){
            this.useDFSAlgorithm = useDFSAlgorithm;
        }



    public boolean isUseDFSAlgorithm() {
        return useDFSAlgorithm;
    }

    public void setUseDFSAlgorithm(boolean useDFSAlgorithm) {
        this.useDFSAlgorithm = useDFSAlgorithm;
    }


    private String applyDFSAlgorithm() {
        return "DFS";
    }

    private String applyBFSAlgorithm() {
        return "BFS";
    }

    public String applyAlgorithm() {
        if (useDFSAlgorithm == true) {
            return applyDFSAlgorithm();
        } else

        {
            return applyBFSAlgorithm();
        }


    }

}


