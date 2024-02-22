public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result="miss";
    
        int lengthOfLocationCells = locationCells.length;
        int cell;
        for (int i = 0; i < lengthOfLocationCells; i ++) {
            cell = locationCells[i];
            if (guess == cell && cell != -1) {
                result = "hit";
                numOfHits ++;
                locationCells[i] = -1;
                break;
            }
        }
        if(numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
