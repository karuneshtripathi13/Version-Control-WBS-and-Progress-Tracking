import React from 'react';
import { Link } from 'react-router-dom';
import '../App.css';
import "./Sidenav.css";
import './Button'
const Header1 = ({title}) => {
    return (
        <header>
            <h1>{title}</h1>
        </header>
    )
}
Header1.defaultProps={
    title:'Version Control',
}
export default Header1
