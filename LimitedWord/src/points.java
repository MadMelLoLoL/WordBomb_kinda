// '**' means Ai was used here, '--' is from tutorial or someone else's code, '/m' is my code when or no label is my code
public class points {

    //takes the length of input and adds to score value depending on length
    public static int getScore(int length){
        int score = 0;

        if(length >= 7){
            score += 5;
        } else if(length >= 5){
            score += 3;
        } else if(length >= 1){
            score += 1;
        }

        //System.out.println("Score: " + score); DEBUG STUFF DELETE
        return score;
    }
    
}
