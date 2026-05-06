class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
    
    public String toString() {
		return "Fighter is a fighter!";
    	
    }
}

class Warrior extends Fighter {
	
	@Override
	public String toString() {
		return "Fighter is a Warrior";
	}
    @Override
	boolean isVulnerable() {
		return false;
	}
    @Override
	int getDamagePoints(Fighter fighter) {
		if (fighter.isVulnerable()) {
			return 10;
		} else {
			return 6;
		}

	}
}


class Wizard extends Fighter {

	private boolean spellPrepped = false;

	@Override
	public String toString() {
		return "Fighter is a Wizard";
	}

	@Override
	boolean isVulnerable() {
		if (spellPrepped) {
			return false;
		} else {
			return true;
		}
	}

	void prepareSpell() {
		spellPrepped = true;
	}

    @Override
	int getDamagePoints(Fighter fighter) {
		if (spellPrepped) {
			return 12;
		} else {
			return 3;
		}

	}
}
