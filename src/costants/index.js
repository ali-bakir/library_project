import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from '../app/App';
import registerServiceWorker from '../main/java/com/bakir/ali/library_project/utils/registerServiceWorker';
import { BrowserRouter as Router } from 'react-router-dom';

ReactDOM.render(
    <Router>
        <App />
    </Router>,
    document.getElementById('root')
);

registerServiceWorker();