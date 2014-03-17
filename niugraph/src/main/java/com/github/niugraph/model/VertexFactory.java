package com.github.niugraph.model;

/**
 * create {@link Vertex} instance
 * @author jjb
 *
 * @param <V> {@link Vertex} type
 */
public interface VertexFactory<V> {

    /**
     * create {@link Vertex} instance
     * @return
     */
    V createVertex();
}
