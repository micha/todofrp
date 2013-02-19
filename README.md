# TodoFRP

An inplementation of [TodoMVC](http://todomvc.com) using HLisp and Javelin.

## Demo

* See the demo [here](http://micha.github.com/todofrp/).

## Development

Install [Leiningen2](https://github.com/technomancy/leiningen)

Install dependencies:

    lein deps

You can start watcher-based ClojureScript compilation:

    script/autobuild

HTML and JavaScript files will be created in the `resources/public` directory.

### Note

When compiling the application you may come across some errors similar to this
one:

    line 1 column 807 - Error: <section> is not recognized!

It's okay. This is just the HTML-tidy library failing to pretty-print some
optional HTML (HTML-tidy doesn't know how to deal with HTML5 elements). It's
nothing to worry about.

