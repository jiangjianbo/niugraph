package com.github.niugraph.model;

/**
 * create {@link Graph} instance
 * @author jjb
 *
 * @param <V> {@link Vertex} class in graph
 * @param <E> {@link Edge} class in graph
 */
public interface GraphFactory<V, E> {

    /**
     * create {@link Graph} instance
     * @param vertexFactory 
     * @param edgeFactory
     * @return
     */
    Graph<V,E> createGraph(VertexFactory<V> vertexFactory, EdgeFactory<V, E> edgeFactory);
}
