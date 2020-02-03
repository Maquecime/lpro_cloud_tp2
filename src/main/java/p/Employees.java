package p;

import java.io.Serializable;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
class Employees implements Serializable {
	@Id
	private String id;
	
	private String name;
	
    private Employees() {}
    
    public Employees(String id, String name) {
        this.id = id;
        this.name = name;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}
