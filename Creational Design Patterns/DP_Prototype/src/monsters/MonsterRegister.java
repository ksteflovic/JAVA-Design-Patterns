package monsters;

import java.util.HashMap;
import java.util.Map;

public class MonsterRegister {

    private Map<String, Monster> register = new HashMap<String, Monster>();

    public Monster giveMonster(String type)  {
        Monster vzor = register.get(type);

        Monster clone = null;
        try {
            clone = (Monster) vzor.clone();
        } catch (CloneNotSupportedException ex) {}
        return clone;
    }

    public void addMonsterModel(String typ, Monster p) {
        register.put(typ, p);
    }
}
