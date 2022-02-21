package ua.lviv.iot.firstLaba;

public class Main {

	public static void main(String[] args) {
		Puzzle apuzzle = new Puzzle();
		Puzzle bpuzzle = new Puzzle(100, "Cat Puzzle", 2.2, 3.1);
		Puzzle cpuzzle = new Puzzle(100, "Dog Puzzle",2.4 ,3.7);
		System.out.println(apuzzle.toString());
		System.out.println(bpuzzle.toString());
		System.out.println(cpuzzle.toString());

	}

}
