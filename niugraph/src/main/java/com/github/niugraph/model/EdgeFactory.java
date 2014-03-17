package com.github.niugraph.model;

public interface EdgeFactory<V,E> {

    E createEdge(V source, V target);
}
