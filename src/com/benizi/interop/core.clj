(ns com.benizi.interop.core
  (:import
    [com.benizi.interop Simple Simple$Inner] ; some (dumb) examples
    ; some more reasonable examples:
    [java.util Currency Date Locale Random]
    [clojure.lang PersistentVector])
  (:require [clojure.reflect :as cr]))


;;; Creating an instance of a Java class

(comment (Classname. args*))
(comment ==> (new Classname args*))

(let [a-string (String. "an initialized string")]
  (str "String is: " a-string))

(str "The time is now: " (Date.))


;;; Access to instance members via the dot operator

(comment (.instanceMember instance args*))
(comment ==> (. instance instanceMember args*))

(.toUpperCase "asdf")

(let [myobj (Simple.)]
  (.approximatePi myobj))

(comment (.instanceMember Classname args*))
(comment ==> (. Classname instanceMember args*))

(.getName String)

(comment (Classname/staticMethod args*))
(comment ==> (. Classname staticMethod args*))

(System/getProperty "java.vm.version")

(comment Classname/staticField)
(comment ==> (. Classname staticField))

(* 2 Math/PI)

(let [usd (Currency/getInstance "USD")
      yen (Currency/getInstance "JPY")]
  (.getSymbol usd (Locale/US))
  (.getSymbol yen (Locale/JAPAN)))

(vector Simple$Inner/someValue)


;;; The Dot

; Generally the forms already discussed should be preferred,
; except when writing macros

(comment (. instance-expr member-symbol))

(let [simple (Simple. 7)]
  (. simple approximatePi))

(comment (. Classname-symbol member-symbol))

(. Simple$Inner someValue)

(comment (. instance-expr (method-symbol args*)) or
(comment (. instance-expr method-symbol args*)))

(let [simple (Simple.)]
  (. simple (giveYou "an" "argument"))
  (. simple giveYou "an" "argument"))

(comment (. Classname-symbol (method-symbol args*)) or
(comment (. Classname-symbol method-symbol args*)))

(. Currency (getInstance "USD"))
(. Currency getInstance "USD")
(. Locale US)


;;; Dot-dot

; similar to the -> "threading" macro
(comment (.. System (getProperties) (get "os.name")))
(comment ==> (. (. System (getProperties)) (get "os.name")))

(.. System (getProperties) (get "os.name"))

(doto (java.util.HashMap.) (.put "a" 1) (.put "b" 2))


;;; creating Java objects from Clojure
(let [simple (Simple. 8)
      guesses (java.util.HashMap.)]
  (doto guesses
    (.put "close" (Integer. 7))
    (.put "far" (Integer. 10)))
  (.judgeCloseness simple guesses))

;;; Clojure is written in Java...
(map :name (:members (cr/reflect (Simple.))))
(cr/reflect [])
(supers (class []))
(first (:members (cr/reflect [])))
(:bases (cr/reflect []))

(defn constructors [type]
  (for [f (seq (:members (cr/reflect type)))
        :when (and
                (:parameter-types f)
                (not (:return-type f)))]
    (:parameter-types f)))
(constructors [])
;(class clojure.lang.PersistentVector/EMPTY)
;(clojure.lang.PersistentVector. 0 5 clojure.lang.PersistentVector/EMPTY (object-array 0))
