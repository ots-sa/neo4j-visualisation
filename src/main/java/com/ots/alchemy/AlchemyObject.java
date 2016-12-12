package com.ots.alchemy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sdimitriadis on 12/12/2016.
 */
public class AlchemyObject {
    
    private List<AlchemyNode> nodes = new ArrayList<AlchemyNode>();
    
    private List<AlchemyEdge> edges = new ArrayList<AlchemyEdge>();
    
    
    public List<AlchemyNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<AlchemyNode> nodes) {
        this.nodes = nodes;
    }

    public List<AlchemyEdge> getEdges() {
        return edges;
    }

    public void setEdges(List<AlchemyEdge> edges) {
        this.edges = edges;
    }
}
