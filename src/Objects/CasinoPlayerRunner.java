package Objects;

public class CasinoPlayerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CasinoPlayer connor = new CasinoPlayer();
		CasinoPlayer adam = new CasinoPlayer("Adam", 100);
		
		System.out.println(connor.getBalance());	
		System.out.println(adam.getBalance());
		
		connor.setBalance(110);
		System.out.println(connor.getBalance());
		
		connor.deposit(1001);
		System.out.println(connor.getBalance());
		
		connor.deposit(5.5);
		System.out.println(connor.getBalance());
		
		connor.withdraw(120);
		System.out.println(connor.getBalance());
		
		connor.betAmount(120);
		
		connor.betAmount(100);
		
		System.out.println(connor.getBet());
		
		adam.setName("Cooler Adam");
		
		System.out.println(adam.getName());
		
		
		GuessingPlayer desmond = new GuessingPlayer();
		
		desmond.setBalance(100);
		
		System.out.println(desmond.getBalance());
		
		desmond.betAmount(10);
		
		System.out.println(desmond.getBet());
		
		desmond.play(5);
		
		System.out.println(desmond.getBalance());
		
		desmond.deposit(100000);
		
		System.out.println(desmond.getBalance());
		
		
		RoulettePlayer emma = new RoulettePlayer();
		
		emma.setBalance(100);
		
		System.out.println(emma.getBalance());
		
		emma.betAmount(10);
		
		System.out.println(emma.getBet());
		
		emma.play(5);
		
		System.out.println(emma.getBalance());
		
		emma.betAmount(10);
		
		System.out.println(emma.getBet());
		
		emma.play(1, 13);
		
		System.out.println(emma.getBalance());
		

		emma.betAmount(10);
		
		System.out.println(emma.getBet());
		
		emma.play("even");
		
		System.out.println(emma.getBalance());
		
		emma.odds();
	}

}
