# TodoFRP

An inplementation of [TodoMVC](http://todomvc.com) using HLisp and Javelin.

* See the demo [here](http://micha.github.com/todofrp/).
* Or look at the source code...

# Development

Install [Leiningen2](https://github.com/technomancy/leiningen)

Install dependencies:

    lein deps

Start a server to serve the app on port 4000:

    script/serve

In another tab, you can start watcher-based ClojureScript compilation:

    script/autobuild

Visit [http://localhost:4000/](http://localhost:4000/) to see the app.
