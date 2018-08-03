package example

import kotlinx.html.div
import kotlinx.html.dom.create
import kotlinx.html.textInput
import org.w3c.dom.Node
import kotlin.browser.document
import kotlin.browser.window

fun main(args: Array<String>) {
    document.body?.append(createMyDiv())
}

fun createMyDiv(): Node {
    return document.create.div {
        textInput {
            this.value = "Hello"
            window.setTimeout({
                this.value = "Changed!"
            }, 1000)
        }
    }
}

