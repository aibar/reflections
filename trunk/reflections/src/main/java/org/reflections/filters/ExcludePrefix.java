package org.reflections.filters;

/**
 *
 */
public class ExcludePrefix implements ExcludeFilter<String> {
    private final String prefix;

    public ExcludePrefix(final String prefix) {
        this.prefix = prefix;
    }

    public boolean accept(final String name) {
        return !name.startsWith(prefix);
    }
}
