package springFw.ex02.dp03;

public class RaceTest {

	public static void main(String[] args) {
		RunningRace race1 = new Run100();
		race1.race();
		
		RunningRace race2 = new RunHurdle();
		race2.race();

	}

}
