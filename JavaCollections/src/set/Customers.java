package set;

import java.util.Objects;

public class Customers {
	private long id;
	private String name;
  
	public Customers(long id,String name) {
		super();
		this.id=id;
		this.name=name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customers other = (Customers) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Customers [id=" + id + ", name=" + name + "]";
	}
	
}
