package json;

import java.util.ArrayList;

public class ResourceNode{
	private String resourceURI;
	private String relation;
	private ArrayList<EdgeNodes> edgeNodes;
	private ArrayList<ResourceNode> resourceNodes;
	
	public ResourceNode (String resourceURI,String relation,ArrayList<EdgeNodes> edgeNodes,ArrayList<ResourceNode> resourceNodes) {
		this.setResourceURI(resourceURI);
		this.setRelation(relation);
		this.setEdgeNodes(edgeNodes);
		this.setResourceNodes(resourceNodes);;
	}
	
	public String getResourceURI() {
		return resourceURI;
	}
	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}

	public String getRelation() {
		return relation;
	}
	
	public void setRelation(String relation) {
		this.relation=relation;
		
	}
	
	public ArrayList<EdgeNodes> getEdgeNodes() {
		return edgeNodes;
	}
	public void setEdgeNodes(ArrayList<EdgeNodes> edgeNodes) {
		for (EdgeNodes edgeNodes2 : edgeNodes) {
			this.edgeNodes.add(new EdgeNodes(edgeNodes2.getProperty(), edgeNodes2.getRelation()));
		}
	}
	public ArrayList<ResourceNode> getResourceNodes() {
		return this.resourceNodes;
	}
	public void setResourceNodes(ArrayList<ResourceNode> resourceNodes) {
		for (ResourceNode resourceNode : resourceNodes) {
			this.resourceNodes.add(new ResourceNode(resourceNode.getResourceURI(), resourceNode.getRelation(), resourceNode.getEdgeNodes(), resourceNode.getResourceNodes()));
		}
	}
	
}
