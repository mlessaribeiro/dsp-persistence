package abstraction.interfaces;

import abstraction.model.Person;

public interface Persistence {

    public void save(Person pessoa);
    
    public void list();
    
}
