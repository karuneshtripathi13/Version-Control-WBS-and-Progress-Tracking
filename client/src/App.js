import './App.css';
import "./tracking.css"
import Header from './components/Header';
import Footer from './components/Footer';
import Upload from './components/Upload';
import Home from './components/Home'
import View from './components/View'
import Login from "./components/Login";
import Delete from "./components/Delete";
import Edit from "./components/Edit";
import Previous from "./components/Previous";
import Header1 from './components/Header1';
import Register from './components/Register';
import MainSideNav from './components/MainSideNav';

import React, { useState } from "react";
import {Fragment} from 'react'
import { BrowserRouter as Router, Switch,Link, Route } from "react-router-dom";
import { set } from 'mongoose';
function App() {
  const [idd, setIdd] = useState("");
  const setLogin=(e)=>{
    setIdd(e)
  }
  return (
    <Router>
      <Switch>
    <div className="App">
    <Route path='/' exact render={() =>
    <Fragment>
    <Header1/>
    <Login/>
    </Fragment>
    } />
    <Route path='/register' exact render={() =>
    <Fragment>
    <Header1/>
    <Register/>
    </Fragment>
    } />
    <Route path='/login'>
      <Header/>
      <MainSideNav/>
      <Route path="/login/addnew"><Upload idd={localStorage.getItem("idd")}/></Route>
      <Route path="/login/viewprev"><View idd={localStorage.getItem("idd")}/></Route>
      <Route path="/login/delete"><Delete idd={localStorage.getItem("idd")}/></Route>
      <Route path="/login/edit"><Edit idd={localStorage.getItem("idd")}/></Route>
      <Route path="/login/previous"><Previous idd={localStorage.getItem("idd")}/></Route>
      <Route path="/login/home">
        <Home idd={localStorage.getItem("idd")}/>
      </Route>
    </Route>
    <Footer/>
    </div>
    </Switch>
    </Router>
  );
}

export default App;
