
import React from 'react';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import './App.css';
import ProfileMain from './components/profile/ProfileMain';
import ReservedCars from './components/profile/ReservedCars';
import UsedCarReviews from './components/profile/UsedCarReviews';
import CheckMyCar from './components/profile/CheckMyCar';
import RegisterMain from './components/register/RegisterMain';

import {Provider} from 'react-redux';
import store from './store/store';

function App() {

  
  

  
  return (
    <div className="App">
      <BrowserRouter>
              
              
                <Provider store={store}>
                <Routes>
                  <Route path="/profile">
                    <Route index element={<ProfileMain />} />
                    <Route path="reservedCars" element={<ReservedCars />} />
                    <Route path="usedCarReviews" element={<UsedCarReviews />} />
                    <Route path="checkMyCar" element={<CheckMyCar/>} />
              
                  </Route>

                  <Route path='/car/new' element={<RegisterMain />} />
                  </Routes>
                </Provider>
              
            </BrowserRouter>
      
    </div>
  );
}

export default App;
