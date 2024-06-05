import axios from 'axios';
import React, { useEffect } from 'react';

const Test1 = () => {
    useEffect(()=>{
        axios.get('http://dongwoossltest.shop/api/')
        .then(res=>
          alert(res.data))
    },[])
    
    return (
        <div>
            
        </div>
    );
};

export default Test1;