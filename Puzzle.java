package ua.lviv.iot.firstLaba;

public record Puzzle(int quantityOfPiecesOfThePuzzle, String descriptionOfThePuzzle, double heightOfTheBox, double widthOfTheBox, boolean isJigsaw, double price) {
	private final static String defaultDescription = "Cat puzzle";
	
	public Puzzle() {
		this(0, "unknown", 0, 0, false, 0);
	}
	public Puzzle(int quantityOfPiecesOfThePuzzle, String descriptionOfThePuzzle, double heightOfTheBox, double widthOfTheBox) {
		this(quantityOfPiecesOfThePuzzle, descriptionOfThePuzzle,heightOfTheBox ,widthOfTheBox ,false,0);
	}
	@Override
	public String toString() {
		return "Description:"+descriptionOfThePuzzle+"\nQuantity of pieces:"+quantityOfPiecesOfThePuzzle+"\nHeight of the box:"+heightOfTheBox+"\nWidth of the box:"+widthOfTheBox+"\nIs it a jigsaw?:"+isJigsaw+"\nPrice:"+price;
	}
	
	public static String defaultDescription() 
	  {
	    return defaultDescription;
	  }

}
