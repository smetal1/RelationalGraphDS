package json;

public class EdgeNodes {	
	
	private String property;
	private String relation;
	
	public EdgeNodes(String property,String relation) {
		this.setProperty(property);
		this.setRelation(relation);
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}

}
