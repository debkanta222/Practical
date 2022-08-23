package Activity;

public class Switcheg1 {

	public static void main(String[] args) {
		int day=5;
		String dayCounter ="";
		switch (day) {
		case 1: dayCounter="1-monday";
		break;
		case 2: dayCounter="2-tuesday";
		break;
		case 3: dayCounter="3-wednesday";
		break;
		case 4: dayCounter="4-thrusday";
		break;
		case 5: dayCounter="5-friday";
		break;
		case 6: dayCounter="6-saturday";
		break;
		case 7: dayCounter="7-sunday";
		break;
		default:System.out.println("invalid day");
		}
        System.out.println(dayCounter);
	}

}
