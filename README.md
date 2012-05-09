# Java Interop in Clojure

- Pittsburgh Clojure Meetup
- 2012-05-08
- Benjamin R. Haskell
- benizi([.com](http://benizi.com)) [GitHub](https://github.com/benizi)

## Useful references:

[Clojure Java Interop page](http://clojure.org/java_interop)

[Blog entry on Java Interop](http://blog.jayfields.com/2011/12/clojure-java-interop.html)

## Random links (from discussion):

[Clojure testing with Midje](https://github.com/marick/Midje/wiki)

[How PersistentHashMaps work (part 1)](http://blog.higher-order.net/2009/09/08/understanding-clojures-persistenthashmap-deftwice/)

![PersistentHashMap](http://blog.higher-order.net/files/clj/persistenthashmap1.png)

[How PersistentHashMaps work (part 2)](http://blog.higher-order.net/2010/08/16/assoc-and-clojures-persistenthashmap-part-ii/)

![PersistentHashMap change](http://blog.higher-order.net/files/clj/persistenthashmap-pathcopy.png)

[Clojure Graph library (loom)](https://github.com/jkk/loom)

## Prep:

```shell
lein deps
```

## Interesting stuff in this project:

[src/com/benizi/interop/core.clj](src/com/benizi/interop/core.clj) - examples of Java interop

[src/com/benizi/interop/Simple.java](src/com/benizi/interop/Simple.java) - small Java class used in examples
