package monsters;

public  class WaterMonster extends Monster {


    public WaterMonster(String fileName) {
        super(fileName);
    }


    public String makeBooo() {
        return "I drown you!";
    }

}