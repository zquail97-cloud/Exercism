
class AnnalynsInfiltration {
	public static boolean canFastAttack(boolean knightIsAwake) {
		if (knightIsAwake == true) {
			return false;
		} else {
			return true;
		}

	}

	public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
		if (archerIsAwake == true || knightIsAwake == true || prisonerIsAwake == true) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
		if (archerIsAwake == false && prisonerIsAwake == true) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake,
			boolean petDogIsPresent) {
		if (!petDogIsPresent && !archerIsAwake && !knightIsAwake && prisonerIsAwake) {
			return true;
		} else if (petDogIsPresent && !archerIsAwake) {
			return true;
		} else {
			return false;
		}
	}
}
    

