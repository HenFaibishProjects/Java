package Enums;

public enum CarTypes {
	BMW("Bemer"),Subaro("subarro");

	private final String CarName;
	
    private CarTypes(String CarName) {
        this.CarName = CarName;
    }

    public String getName() {
        return CarName;
    }
}

