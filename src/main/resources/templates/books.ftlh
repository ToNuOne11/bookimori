<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html">
<head>
    <title>
        Bookimori
    </title>
</head>
<body>
<h1>
    Bookimori
</h1><hr>
<form action="/" method="get">
    Поиск: <input type="text" name="title"><br>
    <input type="submit" value="Поиск"/>
</form>
<h4>Список книг</h4>
<#list books as book>
    <div>
        <p>
            <b>${book.title}</b>
            ${book.rating} | <a href ="/product/${book.id}"> ... </a>
        </p>
    </div>
<#else>
    <h3> Ничего не найдено </h3>
</#list>
<hr>
</body>
</html>