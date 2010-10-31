/**
 * My work on the Project Euler math problems implemented as correctly as i am able
 * i expect this work to evolve over time as i learn.
 * @author tourach23
 * @see Http://projecteuler.net
 */

class Euler{
    public static void main(String[] args) {
    	EulerOne totalOne = new EulerOne();
    	System.out.println("The Answer to Project Euler #1 is "+ totalOne.doWork());
    	EulerTwo totalTwo = new EulerTwo();
    	System.out.println("The Answer to Project Euler #2 is "+ totalTwo.eulerTwoWork());
    	EulerThree totalThree = new EulerThree();
    	System.out.println("The Answer to Project Euler #3 is "+ totalThree.eulerThreeWork());
    	EulerFour totalFour = new EulerFour();
    	System.out.println("The Answer to Project Euler #4 is "+ totalFour.eulerFourWork());
    	EulerFive totalFive = new EulerFive();
    	System.out.println("The Answer to Project Euler #5 is "+ totalFive.eulerFiveWork());
    	EulerSix totalSix = new EulerSix();
    	System.out.println("The Answer to Project Euler #6 is "+ totalSix.eulerSixWork());
    	EulerSeven totalSeven = new EulerSeven();
    	System.out.println("The Answer to Project Euler #7 is "+ totalSeven.eulerSevenWork());
    	EulerEight totalEight = new EulerEight();
    	System.out.println("The Answer to Project Euler #8 is "+ totalEight.eulerEightWork());
    	EulerNine totalNine = new EulerNine();
    	System.out.println("The Answer to Project Euler #9 is "+ totalNine.eulerNineWork());
    	EulerTen totalTen = new EulerTen();
    	System.out.println("The Answer to Project Euler #10 is "+ totalTen.eulerTenWork());
    	EulerSixteen totalSixteen = new EulerSixteen();
    	System.out.println("The Answer to Project Euler #16 is "+ totalSixteen.eulerSixteenWork());
    	EulerTwenty totalTwenty = new EulerTwenty();
    	System.out.println("The Answer to Project Euler #20 is "+ totalTwenty.eulerTwentyWork());    	
    }
}