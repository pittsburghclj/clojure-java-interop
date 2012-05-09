# Java Interop in Clojure

- Pittsburgh Clojure Meetup
- 2012-05-08
- Benjamin R. Haskell
- benizi([.com](http://benizi.com)) [GitHub](https://github.com/benizi)

## Useful references:

[Clojure Java Interop page](http://clojure.org/java_interop)

[Blog entry on Java Interop](http://blog.jayfields.com/2011/12/clojure-java-interop.html)

## Source code from the talk

[src/com/benizi/interop/core.clj](src/com/benizi/interop/core.clj) - examples of Java interop

[src/com/benizi/interop/Simple.java](src/com/benizi/interop/Simple.java) - small Java class used in examples

# Discussion afterward

## Testing in Clojure

Shameless plug: [yu2.be](http://yu2.be/) (YouTube URL shortener) [Source on GitHub](https://github.com/benizi/yu2.be)  Used clojure.test for testing.

[Clojure testing with Midje](https://github.com/marick/Midje/wiki)

## How PersistentHashMaps work

[How PersistentHashMaps work (part 1)](http://blog.higher-order.net/2009/09/08/understanding-clojures-persistenthashmap-deftwice/)

[How PersistentHashMaps work (part 2)](http://blog.higher-order.net/2010/08/16/assoc-and-clojures-persistenthashmap-part-ii/)

![PersistentHashMap](http://blog.higher-order.net/files/clj/persistenthashmap1.png)

![PersistentHashMap change](http://blog.higher-order.net/files/clj/persistenthashmap-pathcopy.png)

## Does Clojure have a built-in persistent graph data structure?

A: No. But:

[Clojure Graph library (loom)](https://github.com/jkk/loom)
