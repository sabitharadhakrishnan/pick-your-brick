import React from 'react';
import {BrowserRouter, Route, Switch} from "react-router-dom";

import './App.css';
import ProductsView from "./components/ProductsView"

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Switch>
          <Route exact path="/" component={ProductsView}/>
        </Switch>
      </BrowserRouter>
    </div>
  );
}

export default App;
