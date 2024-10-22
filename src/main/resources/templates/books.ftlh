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
<form class="searchForm" action="/" method="get">
    <input type="text" name="title" style="width: 300px;">
    <input type="submit" value="Поиск"/>
</form>

<form class="addButton" action="/addBook" method="get">
    <input type="submit" value="Добавить">
</form>
<h4>Список книг</h4>
<div class="bookDiv">
<#list books as book>
    <div >
        <p>
            <a href ="/book/${book.id}"> <img src="/image/${book.getCover().id}" width="200" height="250px" /> <br> </a>
            <h3><b>${book.title}
            ${book.rating}</b></h3>
        </p>
    </div>
<#else>
    <h3> Ничего не найдено </h3>
</#list>
</div>
<hr>
<link rel="stylesheet" href="style.css">
</body>
</html>