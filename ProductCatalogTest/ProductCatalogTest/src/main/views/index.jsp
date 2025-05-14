<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Catalog</title>
    <style>
        body {
            font-family: Arial;
            margin: 20px;
        }
        #product-list div {
            border: 1px solid #ccc;
            padding: 10px;
            margin: 10px 0;
        }
        img {
            border-radius: 5px;
        }
    </style>
</head>
<body>
    <h1>Product Catalog</h1>
    <div id="product-list"></div>

    <script>
        fetch("http://localhost:8080/api/products")
            .then(res => res.json())
            .then(data => {
                const container = document.getElementById("product-list");
                data.forEach(product => {
                    const div = document.createElement("div");
                    div.innerHTML = `
                        <h3>${product.name}</h3>
                        <p>${product.description}</p>
                        <p>₹${product.price}</p>
                        <img src="${product.imageUrl}" width="100">
                    `;
                    container.appendChild(div);
                });
            })
            .catch(err => console.error('Error fetching products:', err));
    </script>
</body>
</html>
