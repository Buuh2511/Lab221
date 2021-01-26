/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package done.s.p0017;

import java.net.URI;

/**
 *
 * @author DoanNC
 */
public class Leaf {

    private String name;
    private URI url;

    public Leaf() {
    }

    public Leaf(String name, URI url) {
        this.name = name;
        this.url = url;
    }

    public Leaf(String name) {
        this.name = name;
        this.url = null;
    }

    public URI getUrl() {
        return this.url;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
