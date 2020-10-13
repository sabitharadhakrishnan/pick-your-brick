import React, {useEffect} from "react";
import axios from 'axios';

export default function ProductsView(){
    const [products,setProducts] = React.useState([]);
    const url = "http://localhost:8080/products";

    useEffect(() => {getAllProducts();}, []);
    const getAllProducts = () => {
        axios.get(url)
          .then(response => {
            console.log(response.data);
            setProducts(response.data);
          })
          .catch(err => {
            console.log(err)
          })
      }

    return(
        <React.Fragment>
            <div id = "list" >Product Catelog</div>
            {products.map((product)=>{
                return(
                <div key={product.productId} className = "products">
                    <div>
                    {product.name}
                    </div>
                </div>);
            })}
        </React.Fragment>
    );
}