Kotlinx Update DOM with setTimeout Demo
=======================================

Use [kotlinx](https://github.com/Kotlin/kotlinx.html) to generate DOM,
and try updating the DOM value in `setTimeout` after sometime.

```
textInput {
    this.value = "Hello"
    window.setTimeout({
        this.value = "Changed!"
    }, 1000)
}
```

But the problem is it doesn't take effect, and give an error:

```
Uncaught IllegalStateException {
    message_8yp7un$_0: "No current tag",
    cause_th0jdv$_0: null,
    name: "IllegalStateException",
    stack: "IllegalStateException: No current tag
        at Illeg…otlin-js-dom-update-with-setTimeout-demo.js:19:19"
    }
```

Run this demo
-------------

```
npm install
./gradlew compileKotlin2Js
open index.html
```

Open developer console of browser, you will see the error mentioned above.


