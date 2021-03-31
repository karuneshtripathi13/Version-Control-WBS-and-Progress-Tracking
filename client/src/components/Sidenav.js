import React from 'react';
import { slide as Menu } from 'react-burger-menu'
import { Link } from 'react-router-dom';
import "./Sidenav.css";

const Sidenav=()=> {
    return (
      <Menu>
        <>
          <img src="https://www.iconspng.com/uploads/circled-user-icon.png" alt="User" width="100vw" height="100vw"></img>
          <div id="logindet">Project Name: {(localStorage.getItem("proj")!=null)?(localStorage.getItem("proj")):(null)}</div>
          <div id="logindet">Project ID: {(localStorage.getItem("idd")!=null)?(localStorage.getItem("idd")):(null)}</div>
        </>
        <Link to="/login/home" className="btn" style={{margin:'1vw',width:'14vw'}}>Home &nbsp;&nbsp;<i className='fa fa-home'></i></Link>
        <Link to="/login/addnew" className="btn" style={{margin:'1vw',width:'14vw'}}>Add New File</Link>
        <Link to="/login/viewprev" className="btn" style={{margin:'1vw', width:'14vw'}}>Current Version</Link>
        <Link to="/login/previous" className="btn" style={{margin:'1vw',width:'14vw'}}>See Previous Versions</Link>
        <Link to="/login/delete" className="btn" style={{margin:'1vw',width:'14vw'}}>Delete File</Link>
        <Link to="/login/edit" className="btn" style={{margin:'1vw',width:'14vw'}}>Edit File</Link>
      </Menu>
    );
}
export default Sidenav;