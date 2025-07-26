<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Error</title>
    <style>
        body {
            background-color: #f8d7da;
            font-family: Arial, sans-serif;
            color: #721c24;
            text-align: center;
            padding-top: 100px;
        }

        .error-box {
            background-color: #f5c6cb;
            border: 1px solid #f5c2c7;
            border-radius: 5px;
            padding: 30px;
            display: inline-block;
        }
    </style>
</head>
<body>
<div class="error-box">
    <h1>Oops! 😞</h1>
    <h2>An unexpected error occurred.</h2>
    <p>Please try again later or contact support if the issue persists.</p>
</div>

<h1>The message is: ${msg}</h1>

</body>
</html>
