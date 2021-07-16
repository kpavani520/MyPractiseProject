package Interface;

public class CountryTraffic implements CentralRules,ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralRules a=new CountryTraffic();
		a.greenGo();
		a.redStop();
		a.flashYellow();
		ContinentalTraffic c=new CountryTraffic();
		c.TrainSymbol();
		
		CountryTraffic b=new CountryTraffic();
		b.WalkSign();
		

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green means Go");
		
	}
public void WalkSign() {
	System.out.println("Pedestrain Walking");
}
	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red means Stop");
		
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Flashing Yellow light");
		
	}

	@Override
	public void TrainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train system means stop");
		
	}

}
