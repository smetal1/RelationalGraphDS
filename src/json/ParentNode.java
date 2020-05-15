package json;

import java.util.ArrayList;

public class ParentNode {
	private String parentUri;
	private ArrayList<ResourceNode> resourceNodes;
	public String getParentUri() {
		return parentUri;
	}
	public void setParentUri(String parentUri) {
		this.parentUri = parentUri;
	}
	public ArrayList<ResourceNode> getResourceNodes() {
		return resourceNodes;
	}
	public void setResourceNodes(ArrayList<ResourceNode> resourceNodes) {
		for (ResourceNode resourceNode : resourceNodes) {
			this.resourceNodes.add(new ResourceNode(resourceNode.getResourceURI(), resourceNode.getRelation(), resourceNode.getEdgeNodes(), resourceNode.getResourceNodes()));
		}
		
	}
	
	

}
