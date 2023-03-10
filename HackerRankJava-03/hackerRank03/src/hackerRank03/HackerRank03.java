package hackerRank03;


import java.util.List;
import java.text.DecimalFormat;
import java.util.Arrays;

public class HackerRank03 {
	
    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
	
    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    	double positive = 0;
    	float negative = 0;
    	float zero = 0;
    	for (int i = 0; i < arr.size(); i++) {
			System.out.println("i" + i + " " + arr.get(i));
			if(arr.get(i) > 0) {
				positive += 1;
			}
			else if (arr.get(i) < 0) {
				negative += 1;
			}
			else {
				zero += 1;	
			}
		}

    	DecimalFormat dF1 = new DecimalFormat("#.000000");
    	
    	double positiveDec = positive / arr.size();
    	double negativeDec = negative / arr.size();
    	double zeroDec = zero / arr.size();
    	
    	System.out.println(dF1.format(positiveDec));
    	System.out.println(dF1.format(negativeDec));
    	System.out.println(dF1.format(zeroDec));
    }
    
    public static void main(String[] args) {
    	List<Integer> miLista = Arrays.asList(-4,3,-9,0,4,1);
    	plusMinus(miLista);    
    
    }
}


