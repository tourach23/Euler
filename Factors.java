
/**
 * This class generates all the factors of a number.
 */
public class Factors {
    private long factor, number;

    /**
     * Creates a FactorGenerator object used to determine the factor of
     * an input value.
     *
     * @param aNum is the input value
     */
    public Factors(long aNum) {
        long number = aNum;
        long factor = 2;
    }

    /**
     * Determine whether or not there are more factors.
     *
     * @return true there are more factors
     */
    public boolean hasMoreFactors() {
        while (factor <= number) {
            if (number % factor == 0)
                return true;
            else
                factor++;
        }
        return false;
    }

    /**
     * Calculate the next factor of a value.
     *
     * @return factor the next factor
     */
    public long nextFactor() {
        if(hasMoreFactors()){
            number /= factor;
            return factor;
        }
        else
            throw new RuntimeException("There are no more factors");
    }
}








/*
 def get_factors(num):
    L = []
    NewL = []
    FinalL = []
    rootnum = num**.5
    for i in range(2, int(rootnum)+1):
        if num % i == 0:
            L = L + [i]
            for x in L:
                c = num / x
                if c not in NewL:  
                    NewL = NewL + [c]
    FinalL = L + NewL
    FinalL.sort()
    return FinalL
*/