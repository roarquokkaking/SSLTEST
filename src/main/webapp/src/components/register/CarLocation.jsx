import React, {useContext, useEffect, useRef, useState} from 'react';
import styles from "./css/CarLocation.module.css";
import {Button} from '@mui/material';
import RegisterHeader from "./RegisterHeader";
import {RegisterContext} from "./RegisterContext";

const CarLocation = () => {
    return (
        <>
            <RegisterHeader text={"자동차 기본 위치 정보"} />
            <div className={styles.location}>
                
            </div>
        </>
    );
};

export default CarLocation;