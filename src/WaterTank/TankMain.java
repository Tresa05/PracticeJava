package WaterTank;

public class TankMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Tank tank = new Tank();
				tank.tankCapacity = 100;
				tank.bucketCapacity = 10;
				tank.currentlevel = 0;
				tank.cutoff = 90;
				tank.fillTank();
				

	}	
}